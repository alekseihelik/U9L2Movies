public class Horror extends Movies{

    private int jumpscares;

    public Horror(String title, int duration){
        super(title, duration);
    }

    public void jumpscare(){
        System.out.println("AHHHH!");
        jumpscares++;
    }

    public String getJumpscares() {
        return super.getTitle() + " has had " + jumpscares + " jumpscares!";
    }
}
