package net.hedtech.banner.waldenu.student.Ssasecq.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;

import net.hedtech.general.common.libraries.Goqolib.model.*;
import net.hedtech.general.common.libraries.Soqolib.model.*;

public class SsasecqModel extends net.hedtech.banner.student.schedule.Ssasecq.model.SsasecqModel {
	
	public SsasecqModel(ITask task, Hashtable parameters) {
		super(task, parameters);
	}

	
	public IDBBusinessObject getSsbsect() {
		return (IDBBusinessObject) getBusinessObject("SSBSECT");
	}
}