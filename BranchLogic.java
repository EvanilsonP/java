public class BranchLogic {
    public static void main(String[] args) {

        int score = 50;

        if(score == 100 && score >= 90) {

            System.out.println("You got an B");

        } else if (score < 90 && score >= 80) {

            System.out.println("You got a 'B'");

        } else if (score < 80 && score >= 70) {

            System.out.println("You got a 'C'");

        } else if (score < 70 && score >= 60) {

            System.out.println("You got a 'D'");

        } else if(score == 50) {
            System.out.println("You got a 50. You should hit the books as soon as you can!");
        }
        
          else {

            System.out.println("You got a 'F'");
        }

        int month = 5; // June
        String season = null;

        switch(month) {
            case 11: // December
            case 0:  // January
            case 1:  // February
                season = "Winter";
                break;
            
            case 2: // March
            case 3: // April
            case 4: // May
                season = "Spring";
                break;
            
            case 5: // June
            case 6: // July
            case 7: // August
                season = "Summer";
                break;

            case 8:  // September
            case 9:  // October
            case 10: // November
                season = "Fall";
                break;

            default:
                    // This should not happen and it is just
                    // here to show the default case.
                season = "Unknown";
        }
        
        System.out.println(season);
    };
};