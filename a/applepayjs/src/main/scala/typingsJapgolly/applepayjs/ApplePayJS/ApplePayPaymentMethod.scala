package typingsJapgolly.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dictionary that describes an Apple Pay payment card.
  */
trait ApplePayPaymentMethod extends js.Object {
  /**
    * A string, suitable for display, that describes the card.
    */
  var displayName: String
  /**
    * A string, suitable for display, that is the name of the payment network backing the card.
    */
  var network: String
  /**
    * The payment pass object currently selected to complete the payment.
    */
  var paymentPass: ApplePayPaymentPass
  /**
    * A value representing the card's type of payment.
    */
  var `type`: ApplePayPaymentMethodType
}

object ApplePayPaymentMethod {
  @scala.inline
  def apply(
    displayName: String,
    network: String,
    paymentPass: ApplePayPaymentPass,
    `type`: ApplePayPaymentMethodType
  ): ApplePayPaymentMethod = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], paymentPass = paymentPass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentMethod]
  }
}

