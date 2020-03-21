package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderShipment extends js.Object {
  var carrier: js.UndefOr[String] = js.undefined
  var creationDate: js.UndefOr[String] = js.undefined
  var deliveryDate: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var trackingId: js.UndefOr[String] = js.undefined
}

object OrderShipment {
  @scala.inline
  def apply(
    carrier: String = null,
    creationDate: String = null,
    deliveryDate: String = null,
    id: String = null,
    lineItems: js.Array[OrderShipmentLineItemShipment] = null,
    status: String = null,
    trackingId: String = null
  ): OrderShipment = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (deliveryDate != null) __obj.updateDynamic("deliveryDate")(deliveryDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderShipment]
  }
}

