package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
//            System.out.println(i);
            for(int j = 0; j < cathetusLength - i - 1; j ++){
                System.out.print(" ");
            }
            for (int j = i + 1; j > 0 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
