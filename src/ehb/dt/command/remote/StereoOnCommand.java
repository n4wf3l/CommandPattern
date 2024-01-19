package ehb.dt.command.remote;

public class StereoOnCommand implements Command {
	Stereo stereo;
 
	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}
