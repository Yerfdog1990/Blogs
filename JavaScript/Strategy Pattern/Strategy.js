// Strategy
const Strategy = {
    useCash(amount){
        return console.log(`$${amount} paid in cash.`); // Pay in cash.
    },
    useDebitCard(amount){
        return console.log(`$${amount} paid using a debit card.`); // Pay using a debit card
    },
    usePayPal(amount){
        return console.log(`$${amount} paid using PayPal.`); // Pay using PayPal
   },
    useStripe(amount){
        return console.log(`$${amount} paid using Stripe.`); // Pay using Stripe
    },
    useApplePay(amount) {
        return console.log(`$${amount} paid using Apple Pay.`); // Pay using Apple Pay
    },
    useGooglePay(amount) {
        return console.log(`$${amount} paid using Google Pay.`); // Pay using Google Pay
    },
    useSamsungPay(amount) {
        return console.log(`$${amount} paid using Samsung Pay.`); // Pay using Samsung Pay
    },
    useAmazonPay(amount) {
        return console.log(`$${amount} paid using Amazon Pay.`); // Pay using Amazon Pay
    },
    useVenmo(amount) {
        return console.log(`$${amount} paid using Venmo.`); // Pay using Venmo
    },
    useZelle(amount) {
        return console.log(`$${amount} paid using Zelle.`); // Pay using Zelle
    },
    default(){
        return console.log("Invalid payment method.");
    }
};
// Context to choose a payment method and enter the amount to pay
function choosePaymentMethod(paymentMethod, amount){
    const method = Strategy[paymentMethod] || Strategy.default;
    return method(amount);
}
choosePaymentMethod("useCash", 100);
choosePaymentMethod("useDebitCard", 100);
choosePaymentMethod("usePayPal", 100);
choosePaymentMethod("useStripe", 100);
choosePaymentMethod("useApplePay", 100);
choosePaymentMethod("useGooglePay", 100);
choosePaymentMethod("useSamsungPay", 100);
choosePaymentMethod("useAmazonPay", 100);
choosePaymentMethod("useVenmo", 100);
choosePaymentMethod("useZelle", 100);
choosePaymentMethod("useCashApp", 100);

// Output
// $100 paid in cash.
// $100 paid using a debit card.
// $100 paid using PayPal.
// $100 paid using Stripe.
// $100 paid using Apple Pay.
// $100 paid using Google Pay.
// $100 paid using Samsung Pay.
// $100 paid using Amazon Pay.
// $100 paid using Venmo.
// $100 paid using Zelle.
// Invalid payment method.

