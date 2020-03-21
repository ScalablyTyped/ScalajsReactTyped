package typingsJapgolly.stripe.mod.issuing.cards

import typingsJapgolly.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import typingsJapgolly.stripe.stripeStrings.bulk
import typingsJapgolly.stripe.stripeStrings.canceled
import typingsJapgolly.stripe.stripeStrings.delivered
import typingsJapgolly.stripe.stripeStrings.failure
import typingsJapgolly.stripe.stripeStrings.individual
import typingsJapgolly.stripe.stripeStrings.pending
import typingsJapgolly.stripe.stripeStrings.returned
import typingsJapgolly.stripe.stripeStrings.shipped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIssuingCardShippingDetails extends IIssuingCardShippingAddress {
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
    */
  var carrier: String
  /**
    * A unix timestamp representing a best estimate of when the card will be delivered.
    */
  var eta: Double
  /**
    * The delivery status of the card. One of pending, shipped, delivered, returned, failure, or canceled.
    */
  var status: pending | shipped | delivered | returned | failure | canceled
  /**
    * A tracking number for a card shipment.
    */
  var tracking_number: String
  /**
    * A link to the shipping carrier’s site where you can view detailed information about a card shipment.
    */
  var tracking_url: String
}

object IIssuingCardShippingDetails {
  @scala.inline
  def apply(
    address: ICardholderBillingAddress,
    carrier: String,
    eta: Double,
    name: String,
    status: pending | shipped | delivered | returned | failure | canceled,
    tracking_number: String,
    tracking_url: String,
    `type`: bulk | individual = null
  ): IIssuingCardShippingDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tracking_number = tracking_number.asInstanceOf[js.Any], tracking_url = tracking_url.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardShippingDetails]
  }
}

