public class Action extends Movies{

    private int fightScenes;

    public Action(String title, int duration){
        super(title, duration);
    }

    public void fightScene(){
        System.out.println("BAM! BOOM! POW!");
        fightScenes++;
    }

    public String getFightScenes(){
        return super.getTitle() + " has had " + fightScenes + " fight scenes!";
    }
}
