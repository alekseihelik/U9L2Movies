public class MoviesRunner {
    public static void main(String[] args) {
        Horror horror = new Horror("Scary Horror Movie", 145);
        Action action = new Action("Eventful Action Movie", 198);

        horror.playMovie();
        System.out.println(horror.getJumpscares());
        horror.jumpscare();
        horror.jumpscare();
        System.out.println(horror.getJumpscares());

        System.out.println("--------------------");

        action.playMovie();
        System.out.println(action.getFightScenes());
        for(int i=0;i<100;i++){
            action.fightScene();
        }
        System.out.println(action.getFightScenes());
    }
}
