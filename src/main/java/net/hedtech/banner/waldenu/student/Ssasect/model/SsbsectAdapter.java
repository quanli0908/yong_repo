package net.hedtech.banner.waldenu.student.Ssasect.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
//import morphis.foundations.core.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;

public class SsbsectAdapter extends net.hedtech.banner.student.schedule.Ssasect.model.SsbsectAdapter {

	public SsbsectAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	public NString getCrosslistEnrl() {
		NString v = new NString((String) this.getValue("CROSSLIST_ENRL"));
		return v;
	}

	public void setCrosslistEnrl(NString value) {
		this.setValue("CROSSLIST_ENRL", value.getValue());
	}

	public NString getCrosslistSeatsAvail() {
		NString v = new NString((String) this.getValue("CROSSLIST_SEATS_AVAIL"));
		return v;
	}

	public void setCrosslistSeatsAvail(NString value) {
		this.setValue("CROSSLIST_SEATS_AVAIL", value.getValue());
	}
	
	//Data Columns
	

}