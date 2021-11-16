import java.util.Comparator;

public class SuperFlexibleComperator implements Comparator<Animal> {
    private String direction = "DESC";
    private String type;

    public SuperFlexibleComperator(String type, String direction){
        this.direction = direction;
        this.type = type;
    }

    public void setDirection(String direction) {
        if (direction.equals("TOGGLE")) {
            if (this.direction.equals("ASC")) {
                this.direction = "DESC";
            } else {
                this.direction = "ASC";
            }
        } else {
            this.direction = direction;
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        int result = 0;
        if(type.equals("age")) {
            result = Integer.compare(o1.getAge(), o2.getAge());
        }else if(type.equals("name")){
            result = o1.getName().compareTo(o2.getName());
        } else if (type.equals("type")){
            result = o1.getType().compareTo(o2.getType());
        }

        if(direction.equals("DESC")){
            result = result * -1;
        }
        return result;
    }
}
