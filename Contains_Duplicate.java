
public class Contains_Duplicate {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4,8,0,9};

        boolean have = false;

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {

                if (array[i] == array[j]) {

                    count++;
                    if (count > 1) {
                        have=true;
                    }

                }

            }

        }
        System.out.println(have);
    }
}
