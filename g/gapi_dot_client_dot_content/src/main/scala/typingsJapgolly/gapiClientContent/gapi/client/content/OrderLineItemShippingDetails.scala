package typingsJapgolly.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemShippingDetails extends js.Object {
  /** The delivery by date, in ISO 8601 format. */
  var deliverByDate: js.UndefOr[String] = js.undefined
  /** Details of the shipping method. */
  var method: js.UndefOr[OrderLineItemShippingDetailsMethod] = js.undefined
  /** The ship by date, in ISO 8601 format. */
  var shipByDate: js.UndefOr[String] = js.undefined
}

object OrderLineItemShippingDetails {
  @scala.inline
  def apply(
    deliverByDate: String = null,
    method: OrderLineItemShippingDetailsMethod = null,
    shipByDate: String = null
  ): OrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    if (deliverByDate != null) __obj.updateDynamic("deliverByDate")(deliverByDate.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (shipByDate != null) __obj.updateDynamic("shipByDate")(shipByDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderLineItemShippingDetails]
  }
}

