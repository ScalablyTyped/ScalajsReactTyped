package typingsJapgolly.stripe.mod.setupIntents

import typingsJapgolly.stripe.AnonReturnurl
import typingsJapgolly.stripe.stripeStrings.redirect_to_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentNextActionRedirectToUrl extends js.Object {
  /**
    * Contains instructions for authenticating a payment by redirecting your customer to another page or application.
    */
  var redirect_to_url: AnonReturnurl
  var `type`: redirect_to_url
}

object ISetupIntentNextActionRedirectToUrl {
  @scala.inline
  def apply(redirect_to_url: AnonReturnurl, `type`: redirect_to_url): ISetupIntentNextActionRedirectToUrl = {
    val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentNextActionRedirectToUrl]
  }
}

