package net.hedtech.banner.waldenu.student.Ssasect.controller;

import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import net.hedtech.banner.waldenu.student.Ssasect.model.SsbsectAdapter;
import net.hedtech.banner.waldenu.student.Ssasect.SsasectTask;
import net.hedtech.banner.waldenu.student.Ssasect.model.SsasectModel;
import net.hedtech.banner.student.schedule.Ssasect.controller.SsbsectController;
import morphis.foundations.core.appdatalayer.events.AfterQuery;
import morphis.foundations.core.appdatalayer.events.QueryExecute;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appdatalayer.events.CancelEvent;
import morphis.foundations.core.appdatalayer.events.BeforeSave;
import static morphis.foundations.core.types.Types.toStr;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.NInteger;
import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import static morphis.foundations.core.types.Types.*;
import java.util.EventObject;
import morphis.core.utils.behavior.annotations.After;

public class ControllrssbsectController extends SsbsectController {

	public ControllrssbsectController(IFormController parentController, String name) {
		super(parentController, name);
	}

	@Override
	public SsasectTask getTask() {
		return (SsasectTask) super.getTask();
	}

	public SsasectModel getFormModel() {
		return getTask().getModel();
	}


	@After
	@AfterQuery
	public void ssbsect_AfterQuery_after(RowAdapterEvent rowAdapterEvent) {
		SsbsectAdapter ssbsectElement = (SsbsectAdapter)this.getFormModel().getSsbsect().getRowAdapter(true);     

		String programC = "select SSBXLST_ENRL, SSBXLST_SEATS_AVAIL from ssbxlst"
				+ " where SSBXLST_TERM_CODE = :KEY_BLOCK_TERM "
				+ " and  SSBXLST_XLST_GROUP = :KEY_XLST_GROUP ";
			//	+ " and  SSBXLST_XLST_GROUP = '1365' ";
		

	    DataCursor programCursor = new DataCursor(programC);
		NString program = NString.getNull();
		 try {
			 programCursor.addParameter("KEY_BLOCK_TERM", getFormModel().getKeyBlock().getSsasectTermCode());
			 programCursor.addParameter("KEY_XLST_GROUP", ssbsectElement.getXlstGroup());
		     programCursor.open();
		     ResultSet programCResults = programCursor.fetchInto();
		     if (programCResults != null) {
		    	 //program = programCResults.
		    	 program = programCResults.getStr(0);
		    	 ssbsectElement.setCrosslistEnrl(program);
		    	 ssbsectElement.setCrosslistSeatsAvail(programCResults.getStr(1));
		     }
		     else {
		    	 ssbsectElement.setCrosslistEnrl(NString.toStr(ssbsectElement.getSsbsectEnrl()));
		    	 ssbsectElement.setCrosslistSeatsAvail(NString.toStr(ssbsectElement.getSsbsectSeatsAvail()));
		     }
        } finally {
        	programCursor.close();
        }
	}
	
}