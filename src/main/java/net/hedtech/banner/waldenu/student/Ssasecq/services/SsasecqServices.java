package net.hedtech.banner.waldenu.student.Ssasecq.services;

import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import static morphis.foundations.core.util.globals.Globals.setGlobal;
import net.hedtech.banner.waldenu.student.Ssasecq.SsasecqTask;
import net.hedtech.banner.waldenu.student.Ssasecq.model.SsasecqModel;

public class SsasecqServices extends net.hedtech.banner.student.schedule.Ssasecq.services.SsasecqServices {

	public SsasecqServices(ISupportCodeContainer container) {
		super(container);
	}

	public SsasecqTask getTask() {
		return (SsasecqTask) super.getContainer();
	}

	public SsasecqModel getFormModel() {
		return getTask().getModel();
	}

	// TODO: put your services here

}