class PaymentService {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("creditCard")) {
            processCreditCardPayment(amount);
        } else if (paymentType.equals("paypal")) {
            processPaypalPayment(amount);
        } else {
            System.out.println("Invalid payment type.");
        }
    }

    private void processCreditCardPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    private void processPaypalPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class Application {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("creditCard", 100.0);
        paymentService.processPayment("paypal", 200.0);
    }
}
