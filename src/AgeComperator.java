import java.util.Comparator;

public class AgeComperator implements Comparator<Animal> {
    private String direction = "ASC";

    public AgeComperator(String direction){
        this.direction = direction;
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        int result = Integer.compare(o1.getAge(), o2.getAge());

        if(direction.equals("DESC")){
            result = result * -1;
        }
        return result;
    }
}
