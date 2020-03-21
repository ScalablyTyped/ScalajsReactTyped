package typingsJapgolly.stripe.mod.issuing.cards

import typingsJapgolly.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import typingsJapgolly.stripe.stripeStrings.bulk
import typingsJapgolly.stripe.stripeStrings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIssuingCardShippingAddress extends js.Object {
  /**
    * Shipping address.
    */
  var address: ICardholderBillingAddress
  /**
    * Recipient name.
    */
  var name: String
  /**
    * One of bulk or individual. Bulk shipments will be grouped and mailed together, while individual ones will not.
    */
  var `type`: js.UndefOr[bulk | individual] = js.undefined
}

object IIssuingCardShippingAddress {
  @scala.inline
  def apply(address: ICardholderBillingAddress, name: String, `type`: bulk | individual = null): IIssuingCardShippingAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardShippingAddress]
  }
}

