
package studentsummary;


public class StudentSummary {
    
public static int subjects = 6;

    public static void main(String[] args) {
        // ONE DIMESNIONAL ARRAY - 6 subjects
        String[] subjects = {"Maths", 
                            "PE", 
                            "Music", 
                            "Social Studies", 
                            "Gateway", 
                            "Economics"};
        
        // Two DIMESNIONAL ARRAY - students grades (6 subjects, and 4 assessments per subject)
        double[][] assessmentGrades = {{87.5, 77.1, 75.0, 78.2}, 
                                    {61.2, 67.3, 79.3, 75.0}, 
                                    {92.8, 92.8, 97.7, 89.6}, 
                                    {80.0, 75.9, 88.0, 48.6},
                                    {62.3, 48.2, 80.0, 45.9},
                                    {73.2, 48.6, 35.1, 83.1}
                                    };
        
        
        double[] mathGrades = assessmentGrades[0];
        double[] peGrades = assessmentGrades[1];
        double[] musicGrades = assessmentGrades[2];
        double[] socialStudiesGrades = assessmentGrades[3];
        double[] gatewayGrades = assessmentGrades[4];
        double[] economicsGrades = assessmentGrades[5];
        
        // MATHS AVERAGE
         double mathTotal = 0;
         for (int i=0; i< mathGrades.length; i++) {
            mathTotal = mathTotal + mathGrades[i];}
        double mathAverage = mathTotal / mathGrades.length;
        
        // PE AVERAGE
        double peTotal = 0; 
        for (int i=0; i< peGrades.length; i++) {
            peTotal = peTotal + peGrades[i];}
        double peAverage = peTotal / peGrades.length;
        
        // MUSIC AVERAGE
        double musicTotal = 0;
        for (int i=0; i< musicGrades.length; i++) {
            musicTotal = musicTotal + musicGrades[i];}
        double musicAverage = musicTotal / musicGrades.length;
        
        // SOCIAL STUDIES AVERAGE
        double ssTotal = 0;
        for (int i=0; i< socialStudiesGrades.length; i++) {
            ssTotal = ssTotal + socialStudiesGrades[i];}
        double ssAverage = ssTotal / socialStudiesGrades.length;
        
         // GATEWAY AVERAGE
        double gatewayTotal = 0;
        for (int i=0; i< gatewayGrades.length; i++) {
            gatewayTotal = gatewayTotal + gatewayGrades[i];}
        double gatewayAverage = gatewayTotal / gatewayGrades.length;
        
         // ECONIMICS AVERAGE
        double economicsTotal = 0;
         for (int i=0; i< economicsGrades.length; i++) {
            economicsTotal = economicsTotal + economicsGrades[i];}
        double economicsAverage = economicsTotal / economicsGrades.length;
        
        
        char[] gradeLetter = {'A', 'B', 'C', 'D', 'F'};
        
        System.out.println("End-of-year transcript:");
        
        // display MATHS results
        System.out.print("Maths: " + "grades " + java.util.Arrays.toString(assessmentGrades[0]));
        System.out.format(" - the average is: " + mathAverage + "\n");
        
        // display PE results
        System.out.print("PE: " + "grades " + java.util.Arrays.toString(assessmentGrades[1]));
        System.out.format(" - the average is: " + peAverage + "\n");
        
         // display MUSIC results
        System.out.print("Music: " + "grades " + java.util.Arrays.toString(assessmentGrades[2]));
        System.out.format(" - the average is: " + musicAverage + "\n");
        
        // display SOCIAL STUDIES results
        System.out.print("Social Studies: " + "grades " + java.util.Arrays.toString(assessmentGrades[3]));
        System.out.format(" - the average is: " + ssAverage + "\n");
        
        // display GATEWAY results
        System.out.print("Gateway: " + "grades " + java.util.Arrays.toString(assessmentGrades[4]));
        System.out.format(" - the average is: " + gatewayAverage + "\n");
        
        // display ECONIMICS results
        System.out.print("Economics: " + "grades " + java.util.Arrays.toString(assessmentGrades[5]));
        System.out.format(" - the average is: " + economicsAverage + "\n");
        
    }
}
    