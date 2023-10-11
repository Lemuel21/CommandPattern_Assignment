package CmdPattern;

public class PowerOn implements Command{



private lights Lights;
public PowerOn(lights Lights){
    this.Lights = Lights;
}
     @Override
    public String execute() {
        return Lights.PowerOn();
    }
}
