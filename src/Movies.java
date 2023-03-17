public class Movies {

    private String title;
    private int duration;

    public Movies(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public void playMovie(){
        System.out.println("Time to watch " + title + " for " + duration + " minutes!");
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
