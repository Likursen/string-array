import org.apache.commons.lang3.RandomStringUtils;

public class Runner {

    public static void main(String[] args) {
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomStringUtils.randomGraph(5);
            System.out.println(array[i]);
        }
    }
}