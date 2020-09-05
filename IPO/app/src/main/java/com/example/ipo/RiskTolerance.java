package com.example.ipo;

public final class RiskTolerance{

    /**
     *
     * This method returns a list of questions to assess investor risk tolerance.
     * Path C:\Users\jyoth\AndroidStudioProjects\IPO\app\src\main\java\com\example\ipo
     * @return A list of investment questions
     */
    public static String[] getRiskTolerance() {
        return new String[] {
                "What is your current age?",
                "How many years do you have till retirement?",
                "Do you prefer gains on stock or steady income?",
                "How many months of income have you saved for emergency funds?",
                "What percentage of monthly income is your car EMI? ",
                "How much income do you want in retirement?",
                "Do you plan to fund your childrens college education?",
                "Will you downsize your house in retirement?",
                "What is your idea of regular vacation?"
        };
    }
}
