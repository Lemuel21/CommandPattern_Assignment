package CmdPattern;

public class turnOn implements Command{
    private musicPlayer MP;

public turnOn(musicPlayer MP){
    this.MP = MP;
}
    @Override
    public String execute() {
        return MP.turnOn();
    }
}
