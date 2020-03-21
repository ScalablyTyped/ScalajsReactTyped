package typingsJapgolly.stripeV3.stripe.paymentMethod

import typingsJapgolly.stripeV3.AnonAddressline1check
import typingsJapgolly.stripeV3.AnonAmexexpresscheckout
import typingsJapgolly.stripeV3.AnonCharge
import typingsJapgolly.stripeV3.AnonSupported
import typingsJapgolly.stripeV3.stripe.fundingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodCard extends js.Object {
  /**
    * Card brand
    */
  var brand: paymentMethodCardBrand
  /**
    * Checks on Card address and CVC if provided.
    */
  var checks: AnonAddressline1check
  /**
    * Two-letter ISO code representing the country of the card. You
    * could use this attribute to get a sense of the international
    * breakdown of cards you’ve collected.
    */
  var country: String
  /**
    * Two-digit number representing the card’s expiration month.
    */
  var exp_month: Double
  /**
    * Four-digit number representing the card’s expiration year.
    */
  var exp_year: Double
  /**
    * Uniquely identifies this particular card number. You can use
    * this attribute to check whether two customers who’ve signed
    * up with you are using the same card number, for example.
    */
  var fingerprint: String
  /**
    * Card funding type
    */
  var funding: fundingType
  /**
    * Details of the original PaymentMethod that created this object.
    */
  var generated_from: AnonCharge
  /**
    * The last four digits of the card.
    */
  var last4: String
  /**
    * Contains details on how this Card maybe be used for 3D Secure authentication.
    */
  var three_d_secure_usage: js.UndefOr[AnonSupported] = js.undefined
  /**
    * If this Card is part of a card wallet, this contains the details of
    * the card wallet.
    */
  var wallet: AnonAmexexpresscheckout | Null
}

object PaymentMethodCard {
  @scala.inline
  def apply(
    brand: paymentMethodCardBrand,
    checks: AnonAddressline1check,
    country: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: fundingType,
    generated_from: AnonCharge,
    last4: String,
    three_d_secure_usage: AnonSupported = null,
    wallet: AnonAmexexpresscheckout = null
  ): PaymentMethodCard = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], generated_from = generated_from.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    if (three_d_secure_usage != null) __obj.updateDynamic("three_d_secure_usage")(three_d_secure_usage.asInstanceOf[js.Any])
    if (wallet != null) __obj.updateDynamic("wallet")(wallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodCard]
  }
}

