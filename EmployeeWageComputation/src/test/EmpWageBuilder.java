package test;

import java.util.ArrayList;

class EmpWageBuilder {
	    ArrayList<CompanyEmpWage> companyEmpWages;

	    public EmpWageBuilder() {
	        this.companyEmpWages = new ArrayList<>();
	    }

	    public void addCompanyEmpWage(CompanyEmpWage companyEmpWage) {
	        companyEmpWages.add(companyEmpWage);
	    }

	    public void computeEmployeeWage() {
	        for (CompanyEmpWage companyEmpWage : companyEmpWages) {
	            companyEmpWage.calculateMonthlyWage();
	        }
	    }

	    public int getTotalWageByCompany(String companyName) {
	        for (CompanyEmpWage companyEmpWage : companyEmpWages) {
	            if (companyEmpWage.companyName.equals(companyName)) {
	                return companyEmpWage.totalWage;
	            }
	        }
	        return 0; 
	    }
	}

