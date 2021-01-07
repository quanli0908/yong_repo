package net.hedtech.banner.waldenu.student.Ssasecq.controller;

import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import net.hedtech.banner.waldenu.student.Ssasecq.model.SsbsectAdapter;
import net.hedtech.banner.waldenu.student.Ssasecq.SsasecqTask;
import net.hedtech.banner.waldenu.student.Ssasecq.model.SsasecqModel;
import net.hedtech.banner.student.schedule.Ssasecq.controller.SsbsectController;
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
	public SsasecqTask getTask() {
		return (SsasecqTask) super.getTask();
	}

	public SsasecqModel getFormModel() {
		return getTask().getModel();
	}

	@After
	@AfterQuery
	public void ssbsect_AfterQuery(RowAdapterEvent rowAdapterEvent) {
		SsbsectAdapter ssbsectElement = (SsbsectAdapter)this.getFormModel().getSsbsect().getRowAdapter(true);     

		String clseatsC = "select SSBXLST_ENRL, SSBXLST_SEATS_AVAIL from ssbxlst"
				+ " where SSBXLST_TERM_CODE = :KEY_BLOCK_TERM "
				+ " and  SSBXLST_XLST_GROUP = :KEY_XLST_GROUP ";
			//	+ " and  SSBXLST_XLST_GROUP = '1365' ";
		

	    DataCursor clseatsCursor = new DataCursor(clseatsC);
		NString clseats = NString.getNull();
		 try {
			 clseatsCursor.addParameter("KEY_BLOCK_TERM", ssbsectElement.getSsbsectTermCode());
			 //  clseatsCursor.addParameter("KEY_BLOCK_TERM", getFormModel().getKeyBlock().getSsasectTermCode());
			 clseatsCursor.addParameter("KEY_XLST_GROUP", ssbsectElement.getSsrxlstXlstGroup());
		     clseatsCursor.open();
		     ResultSet clseatsCResults = clseatsCursor.fetchInto();
		     if (clseatsCResults != null) {
		    	 clseats = clseatsCResults.getStr(0);
		    	 ssbsectElement.setCrosslistEnrl(clseats);
		    	 ssbsectElement.setCrosslistSeatsAvail(clseatsCResults.getStr(1));
		     }
		     else {
		    	 ssbsectElement.setCrosslistEnrl(NString.toStr(ssbsectElement.getSsbsectEnrl()));
		    	 ssbsectElement.setCrosslistSeatsAvail(NString.toStr(ssbsectElement.getSsbsectSeatsAvail()));
		     }
        } finally {
        	clseatsCursor.close();
        }
	}
	
}