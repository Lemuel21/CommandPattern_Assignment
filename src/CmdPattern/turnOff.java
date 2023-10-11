package CmdPattern;

public class turnOff implements Command{
    private musicPlayer MP;
    public turnOff(musicPlayer MP){
        this.MP = MP;
    }
    @Override
    public String execute() {
        return MP.turnOff();
    }
}
