
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
        
        
        // MATHS GRADE LETTER
        char mathsGradeLetter;
        if (mathAverage >= 80) {
            mathsGradeLetter = 'A';
        }else if (mathAverage >= 70) {
            mathsGradeLetter = 'B';
        }else if (mathAverage >= 60) {
            mathsGradeLetter = 'C';
        }else if (mathAverage >= 50) {
            mathsGradeLetter = 'D';
        }else {
            mathsGradeLetter = 'F';
        }
        
        // Pe GRADE LETTER
        char peGradeLetter;
        if (peAverage >= 80) {
            peGradeLetter = 'A';
        }else if (peAverage >= 70) {
            peGradeLetter = 'B';
        }else if (peAverage >= 60) {
            peGradeLetter = 'C';
        }else if (peAverage >= 50) {
            peGradeLetter = 'D';
        }else {
            peGradeLetter = 'F';
        }
        
        // MUSIC GRADE LETTER
        char musicGradeLetter;
        if (musicAverage >= 80) {
            musicGradeLetter = 'A';
        }else if (musicAverage >= 70) {
            musicGradeLetter = 'B';
        }else if (musicAverage >= 60) {
            musicGradeLetter = 'C';
        }else if (musicAverage >= 50) {
            musicGradeLetter = 'D';
        }else {
            musicGradeLetter = 'F';
        }
        
         // SOCIAL STUDIES GRADE LETTER
        char ssGradeLetter;
        if (ssAverage >= 80) {
            ssGradeLetter = 'A';
        }else if (ssAverage >= 70) {
            ssGradeLetter = 'B';
        }else if (ssAverage >= 60) {
            ssGradeLetter = 'C';
        }else if (ssAverage >= 50) {
            ssGradeLetter = 'D';
        }else {
            ssGradeLetter = 'F';
        }
        
         // Gateway GRADE LETTER
        char gatewayGradeLetter;
        if (gatewayAverage >= 80) {
            gatewayGradeLetter = 'A';
        }else if (gatewayAverage >= 70) {
            gatewayGradeLetter = 'B';
        }else if (gatewayAverage >= 60) {
            gatewayGradeLetter = 'C';
        }else if (gatewayAverage >= 50) {
            gatewayGradeLetter = 'D';
        }else {
            gatewayGradeLetter = 'F';
        }
        
         // ECONIMICS GRADE LETTER
        char economicGradeLetter;
        if (economicsAverage >= 80) {
            economicGradeLetter = 'A';
        }else if (economicsAverage >= 70) {
            economicGradeLetter = 'B';
        }else if (economicsAverage >= 60) {
            economicGradeLetter = 'C';
        }else if (economicsAverage >= 50) {
            economicGradeLetter = 'D';
        }else {
            economicGradeLetter = 'F';
        }
        
        
        System.out.println("End-of-year transcript:");
        
        // display MATHS results
        System.out.print("Maths: " + "grades " + java.util.Arrays.toString(assessmentGrades[0]));
        System.out.format(" - the average is: " + mathAverage + " = " + mathsGradeLetter + "\n");
        
        // display PE results
        System.out.print("PE: " + "grades " + java.util.Arrays.toString(assessmentGrades[1]));
        System.out.format(" - the average is: " + peAverage + " = " + peGradeLetter + "\n");
        
         // display MUSIC results
        System.out.print("Music: " + "grades " + java.util.Arrays.toString(assessmentGrades[2]));
        System.out.format(" - the average is: " + musicAverage + " = " + musicGradeLetter + "\n");
        
        // display SOCIAL STUDIES results
        System.out.print("Social Studies: " + "grades " + java.util.Arrays.toString(assessmentGrades[3]));
        System.out.format(" - the average is: " + ssAverage + " = " + ssGradeLetter + "\n");
        
        // display GATEWAY results
        System.out.print("Gateway: " + "grades " + java.util.Arrays.toString(assessmentGrades[4]));
        System.out.format(" - the average is: " + gatewayAverage + " = " + gatewayGradeLetter + "\n");
        
        // display ECONIMICS results
        System.out.print("Economics: " + "grades " + java.util.Arrays.toString(assessmentGrades[5]));
        System.out.format(" - the average is: " + economicsAverage + " = " + economicGradeLetter + "\n");
        
    }
}

