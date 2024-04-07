
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Square{
    List<Integer> num = Arrays.asList(3,5,8,1,9);
    Stream<Integer> square = num.stream();

    public int getSquare() {
        int sum= square.map(s->s*s).reduce(0,(c,e)->c+e);
        System.out.println(sum);
        return sum;
//        Stream<Integer> squaredlist = square.map(s-> s*s);
//        squaredlist.forEach(s-> System.out.print(s+ " "));
//        return squaredlist;
    }
}

class Cube{
    List<Integer> numlist = Arrays.asList(3,5,8,1,9);
    Stream<Integer> cube = numlist.stream();

    public int getCube() {
  //      Stream<Integer> cubelist = cube.map(c-> c*c*c);
//        cubelist.forEach(c-> System.out.print(c+ " "));
//        return cubelist;
       int cubesum= cube.map(c->c*c*c).reduce(0,(a,b)->a+b);
        System.out.println(cubesum);
        return cubesum;

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("sum of squares of (3,5,8,1,9):");
        Square sq = new Square();
        sq.getSquare();

        System.out.println("sum of cubes of (3,5,8,1,9):");
        Cube cu =new Cube();
        cu.getCube();

    }
}