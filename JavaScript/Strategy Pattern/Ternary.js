// Choose a payment method and enter the amount to pay
function choosePaymentMethod(paymentMethod, amount) {
    let payment = paymentMethod === "cash" ? `$${amount} paid in cash.` // Pay in cash
        : paymentMethod === "debit card" ? `$${amount} paid using a debit card.` // Pay using a debit card
        : paymentMethod === "paypal" ? `$${amount} paid using PayPal.` // Pay using PayPal
        : paymentMethod === "stripe" ? `$${amount} paid using Stripe.` // Pay using Stripe
        : "Invalid payment method.";
    console.log(payment);
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

