package net.hedtech.banner.waldenu.student.Ssasect.services;

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
import net.hedtech.banner.waldenu.student.Ssasect.SsasectTask;
import net.hedtech.banner.waldenu.student.Ssasect.model.SsasectModel;

public class SsasectServices extends net.hedtech.banner.student.schedule.Ssasect.services.SsasectServices {

	public SsasectServices(ISupportCodeContainer container) {
		super(container);
	}

	public SsasectTask getTask() {
		return (SsasectTask) super.getContainer();
	}

	public SsasectModel getFormModel() {
		return getTask().getModel();
	}

	// TODO: put your services here

}