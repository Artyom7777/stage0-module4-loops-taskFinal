package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength * -1; j <= cathetusLength; j++) {
                if (j == 0 || j == -1) {
                    continue;
                }
                int num = (j < 0) ? j * -1 : j;
                if ((j > 0 && j <= i) || (j < 0 && j >= i * -1)) {
                    System.out.print(num);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        public static void main (String[]args){
            new Pyramid().printPyramid(7);
        }
    }


