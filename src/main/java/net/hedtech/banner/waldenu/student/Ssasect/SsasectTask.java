package net.hedtech.banner.waldenu.student.Ssasect;

import java.util.Hashtable;

public class SsasectTask extends net.hedtech.banner.student.schedule.Ssasect.SsasectTask {
	public SsasectTask(String taskName) {
		super(taskName);
	}
	
	public SsasectTask(String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}
	
	@Override
	public net.hedtech.banner.waldenu.student.Ssasect.model.SsasectModel getModel() {
		return (net.hedtech.banner.waldenu.student.Ssasect.model.SsasectModel)super.getModel();
	}
	
	public net.hedtech.banner.waldenu.student.Ssasect.services.SsasectServices getServices() {
		return (net.hedtech.banner.waldenu.student.Ssasect.services.SsasectServices)getSupportCodeManager().getServices();
	}
}
