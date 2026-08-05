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

        // create application eligible
        boolean applicationEligible = degreeEligible && backlogEligible && graduationYearEligible
                && aptituteEligible && codingEligible && communicationEligible && projectEligible
                && verificationEligible;

        // cadidate details
        System.out.println("Campous Placement Application Report");
        System.out.println("=======================================");
        System.out.println("Candidate Name        : " + candidateName);
        System.out.println("Registration Number   : " + registrationNumber);
        System.out.println("Degree                : " + degree);
        System.out.println("Degree Percentage     : " + degreePercentage);
        System.out.println("Active Backlogs       : " + activeBacklogs);
        System.out.println("-----------------------------------------");
        System.out.println("Aptitude Score        : " + aptitudeCorrectAns + " / " + aptitideTotalQ);
        System.out.println("Aptitude Percentage   : " + aptitudePercentage);
        System.out.println("Coding Test Cases     : " + codingTestcasesPass + " / " + totalCodingTestcases);
        System.out.println("Coding Percentage     : " + codingPercentage);
        System.out.println("Communication Score   : " + communicationScore);
        System.out.println("Projects Completed    : " + (projectCompleted ? "Yes" : "No"));
        System.out.println("Profile Verified      : " + (profileVerified ? "Yes" : "No"));
        System.out.println("-----------------------------------------");
        if (degreeEligible) {
            System.out.println("Degree Eligibility      : Eligible");
        } else {
            System.out.println("Degree Eligibility      : Not Eligible");
        }

        if (backlogEligible) {
            System.out.println("Backlog Eligibility     : Eligible");
        } else {
            System.out.println("Backlog Eligibility     : Not Eligible");
        }

        if (graduationYearEligible) {
            System.out.println("Graduation Year         : Eligible");
        } else {
            System.out.println("Graduation Year         : Not Eligible");
        }
        if (aptituteEligible) {
            System.out.println("Aptitude Eligibility    : Eligible");
        } else {
            System.out.println("Aptitude Eligibility    : Not Eligible");
        }

        if (codingEligible) {
            System.out.println("Coding Eligibility      : Eligible");
        } else {
            System.out.println("Coding Eligibility      : Not Eligible");
        }
        if (communicationEligible) {
            System.out.println("Communication Status    : Eligible");
        } else {
            System.out.println("Communication Status    : Not Eligible");
        }

        // Displaying the final eligibility status

        if (!degreeEligible) {
            System.out.println("Application Status  : Not Eligible");
            System.out.println("Next Action        : Improve the required degree percentage.");
        } else if (!backlogEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action        : Clear all active backlogs.");
        } else if (!graduationYearEligible) {
            System.out.println("Application Status  : Not Eligible");
            System.out.println("Next Action        : Check the eligible graduation-year criteria.");
        } else if (!aptituteEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action        : Improve aptitude assessment performance.");
        } else if (!codingEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action        : Improve coding assessment performance.");
        } else if (!communicationEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action        : Improve communication assessment performance.");
        } else if (!projectEligible) {
            System.out.println("Application Status : Application On Hold");
            System.out.println("Next Action        : Complete the required project.");
        } else if (!verificationEligible) {
            System.out.println("Application Status  : Application On Hold");
            System.out.println("Next Action         : Complete profile verification.");
        } else {
            System.out.println("Application Status  : Eligible to Apply");
            System.out.println("Next Action         : Submit the company application.");
        }
    }
}
