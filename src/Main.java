public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1_000_000;
        double interestRate = 9.99;
        int loanTermInMonths = 24;
        int monthlyPayment = service.calculateMonthlyPayment(creditAmount, interestRate, loanTermInMonths);
        System.out.println("Ежемесячный платеж: " + monthlyPayment + " рублей");
    }
}