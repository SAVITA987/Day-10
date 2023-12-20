package test;

public class EmployeeWageProgram {
	    public static void main(String[] args) {
	        EmpWageBuilder empWageBuilder = new EmpWageBuilder();

	        CompanyEmpWage company1 = new CompanyEmpWage("Company1", 20, 8, 4, 20, 100);
	        CompanyEmpWage company2 = new CompanyEmpWage("Company2", 25, 8, 4, 22, 110);

	        empWageBuilder.addCompanyEmpWage(company1);
	        empWageBuilder.addCompanyEmpWage(company2);

	        empWageBuilder.computeEmployeeWage();

	        for (CompanyEmpWage companyEmpWage : empWageBuilder.companyEmpWages) {
	            System.out.println(companyEmpWage.companyName + " Total Wage: " + companyEmpWage.totalWage);
	        }

	        for (CompanyEmpWage companyEmpWage : empWageBuilder.companyEmpWages) {
	            System.out.println(companyEmpWage.companyName + " Daily Wages: " + companyEmpWage.dailyWages);
	        }

	        String companyToQuery = "Company1";
	        int totalWage = empWageBuilder.getTotalWageByCompany(companyToQuery);
	        System.out.println(companyToQuery + " Total Wage: " + totalWage);
	    }
	}


