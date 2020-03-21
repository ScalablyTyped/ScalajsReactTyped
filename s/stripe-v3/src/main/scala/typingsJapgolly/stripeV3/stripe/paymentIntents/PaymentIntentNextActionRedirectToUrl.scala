package typingsJapgolly.stripeV3.stripe.paymentIntents

import typingsJapgolly.stripeV3.AnonUrl
import typingsJapgolly.stripeV3.stripeV3Strings.redirect_to_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentIntentNextActionRedirectToUrl extends js.Object {
  /**
    * Contains instructions for authenticating a payment by
    * redirecting your customer to another page or application.
    */
  var redirect_to_url: AnonUrl
  /**
    * Type of the next action to perform
    */
  var `type`: redirect_to_url
}

object PaymentIntentNextActionRedirectToUrl {
  @scala.inline
  def apply(redirect_to_url: AnonUrl, `type`: redirect_to_url): PaymentIntentNextActionRedirectToUrl = {
    val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentIntentNextActionRedirectToUrl]
  }
}

