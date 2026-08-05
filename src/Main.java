public class Main {
    public static void main(String[] args) {
        // candidate profile
        String candidateName = "Aarav";
        int registrationNumber = 24031;
        String degree = "B.E.computer science";
        int graduationYear = 2026;
        double degreePercentage = 72.5;
        int activeBacklogs = 0;
        int aptitudeCorrectAns = 38;
        int aptitideTotalQ = 50;
        int codingTestcasesPass = 8;
        int totalCodingTestcases = 10;
        int communicationScore = 68;
        boolean projectCompleted = true;
        boolean profileVerified = true;

        // candidate assignment details
        double aptitudePercentage = (double) aptitudeCorrectAns / aptitideTotalQ * 100;
        double codingPercentage = (double) codingTestcasesPass / totalCodingTestcases * 100;

        // created boolean expression
        boolean degreeEligible = degreePercentage >= 60;
        boolean backlogEligible = activeBacklogs == 0;
        boolean graduationYearEligible = graduationYear >= 2025 && graduationYear <= 2027;
        boolean aptituteEligible = aptitudePercentage >= 60;
        boolean codingEligible = codingPercentage >= 70;
        boolean communicationEligible = communicationScore >= 60;
        boolean projectEligible = projectCompleted;
        boolean verificationEligible = profileVerified;

    }
}
