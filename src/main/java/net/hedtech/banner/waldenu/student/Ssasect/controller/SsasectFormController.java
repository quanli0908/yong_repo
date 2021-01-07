package net.hedtech.banner.waldenu.student.Ssasect.controller;

import morphis.foundations.core.appsupportlib.runtime.ITask;
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
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.core.utils.behavior.annotations.After;

public class SsasectFormController extends net.hedtech.banner.student.schedule.Ssasect.controller.SsasectFormController {

	public SsasectFormController(ITask task) {
		super(task);
	}

	@Override
	public SsasectTask getTask() {
		return (SsasectTask) super.getTask();
	}

	public SsasectModel getFormModel() {
		return getTask().getModel();
	}
	
	@After
	@ActionTrigger(action = "LOAD_CURRENT_RELEASE")
	public void Ssasect_LoadCurrentRelease_after() {
		 String currRel = getFormModel().getFormHeader().getCurrentRelease() + "-EXT";     
		 getFormModel().getFormHeader().setCurrentRelease(toStr(currRel)); 
	}
}