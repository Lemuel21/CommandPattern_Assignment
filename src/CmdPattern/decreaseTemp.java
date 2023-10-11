package CmdPattern;

public class decreaseTemp implements Command{
    private Thermostat thermostat;
    public decreaseTemp(Thermostat thermostat){
        this.thermostat = thermostat;
    }
    @Override
    public String execute() {
        return thermostat.decreaseTemp();
    }
}
