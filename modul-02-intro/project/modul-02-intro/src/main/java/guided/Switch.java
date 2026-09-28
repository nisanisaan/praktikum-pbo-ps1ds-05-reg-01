package guided;

/**
 *
 * @author Admin
 */
public class Switch {

    public static void main(String[] args) {

        int month = 4;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Dingin";
                break;

            case 3:
            case 4:
            case 5:
                season = "Semi";
                break;

            case 6:
            case 7:
            case 8:
                season = "Panas";
                break;

            case 9:
            case 10:
            case 11:
                season = "Gugur";
                break;

            default:
                season = "Bulan tidak valid";
                break;
        }

        System.out.println("Bulan " + month + " masuk musim " + season + ".");
    }
}