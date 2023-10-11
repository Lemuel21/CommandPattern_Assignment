package CmdPattern;

public class PowerOff implements Command{

    private lights Lights;

public PowerOff(lights Lights){
    this.Lights = Lights;
}
    @Override
    public String execute() {
        return Lights.TurnOff();
    }
}
