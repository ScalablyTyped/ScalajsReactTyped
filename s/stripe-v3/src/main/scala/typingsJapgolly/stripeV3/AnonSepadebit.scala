package typingsJapgolly.stripeV3

import typingsJapgolly.stripeV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSepadebit extends js.Object {
  /**
    * The customer's billing_details. name and email are required.
    */
  var billing_details: AnonEmail
  /**
    * An iban Element.
    */
  var sepa_debit: Element | AnonIban
}

object AnonSepadebit {
  @scala.inline
  def apply(billing_details: AnonEmail, sepa_debit: Element | AnonIban): AnonSepadebit = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], sepa_debit = sepa_debit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSepadebit]
  }
}

