public class CreditPaymentService {
    public int calculateMonthlyPayment(int creditAmount, double interestRate, int loanTermInMonths) {
        double monthlyInterestRate = interestRate / 12 / 100;
        double annuityCoefficient = monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTermInMonths) / (Math.pow(1 + monthlyInterestRate, loanTermInMonths) - 1);
        return (int) (creditAmount * annuityCoefficient);
    }
}