package test;

import java.util.ArrayList;
import java.util.Random;

	class CompanyEmpWage {
	    String companyName;
	    int wagePerHour;
	    int fullDayHours;
	    int partTimeHours;
	    int workingDays;
	    int maxWorkingHours;
	    ArrayList<Integer> dailyWages;
	    int totalWage;

	    public CompanyEmpWage(String companyName, int wagePerHour, int fullDayHours, int partTimeHours, int workingDays, int maxWorkingHours) {
	        this.companyName = companyName;
	        this.wagePerHour = wagePerHour;
	        this.fullDayHours = fullDayHours;
	        this.partTimeHours = partTimeHours;
	        this.workingDays = workingDays;
	        this.maxWorkingHours = maxWorkingHours;
	        this.dailyWages = new ArrayList<>();
	        this.totalWage = 0;
	    }

	    public int computeDailyWage() {
	        Random random = new Random();
	        int attendance = random.nextInt(3); 

	        switch (attendance) {
	            case 1:
	                return wagePerHour * fullDayHours; 
	            case 2:
	                return wagePerHour * partTimeHours; 
	            default:
	                return 0; 
	        }
	    }

	    public void calculateMonthlyWage() {
	        int totalWorkingHours = 0;
	        for (int day = 0; day < workingDays && totalWorkingHours < maxWorkingHours; day++) {
	            int dailyWage = computeDailyWage();
	            totalWage += dailyWage;
	            dailyWages.add(dailyWage);
	            totalWorkingHours += (dailyWage / wagePerHour); 
	        }
	    }
	}

	
	