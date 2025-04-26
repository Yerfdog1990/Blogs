// Choose a payment method and enter the amount to pay
function choosePaymentMethod(paymentMethod, amount) {
    switch (paymentMethod){
        case "cash":
            console.log(`$${amount} paid in cash.`); // Pay in cash.
            break;
        case "debit card":
            console.log(`$${amount} paid using a debit card.`); // Pay using a debit card.
            break;
        case "paypal":
            console.log(`$${amount} paid using PayPal.`); // Pay using PayPal.
            break
        case "stripe":
            console.log(`$${amount} paid using Stripe.`); // Pay using Stripe
            break;
        default:
            console.log("Invalid payment method.");
    }
}
choosePaymentMethod("cash", 100);
choosePaymentMethod("debit card", 100);
choosePaymentMethod("paypal", 100);
choosePaymentMethod("stripe", 100);
choosePaymentMethod("cash app", 100);

// Output
// $100 paid in cash.
// $100 paid using a debit card.
// $100 paid using PayPal.
// $100 paid using Stripe.
// Invalid payment method.

