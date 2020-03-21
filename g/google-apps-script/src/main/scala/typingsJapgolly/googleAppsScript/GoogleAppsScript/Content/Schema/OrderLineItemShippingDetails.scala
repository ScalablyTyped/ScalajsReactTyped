package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemShippingDetails extends js.Object {
  var deliverByDate: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[OrderLineItemShippingDetailsMethod] = js.undefined
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

