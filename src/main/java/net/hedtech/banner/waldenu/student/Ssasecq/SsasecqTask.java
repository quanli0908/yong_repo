package net.hedtech.banner.waldenu.student.Ssasecq;

import java.util.Hashtable;

public class SsasecqTask extends net.hedtech.banner.student.schedule.Ssasecq.SsasecqTask {
	public SsasecqTask(String taskName) {
		super(taskName);
	}
	
	public SsasecqTask(String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}
	
	@Override
	public net.hedtech.banner.waldenu.student.Ssasecq.model.SsasecqModel getModel() {
		return (net.hedtech.banner.waldenu.student.Ssasecq.model.SsasecqModel)super.getModel();
	}
	
	public net.hedtech.banner.waldenu.student.Ssasecq.services.SsasecqServices getServices() {
		return (net.hedtech.banner.waldenu.student.Ssasecq.services.SsasecqServices)getSupportCodeManager().getServices();
	}
}
