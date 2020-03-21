package typingsJapgolly.facebookPixel.facebook.Pixel.DPA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseParameters
  extends typingsJapgolly.facebookPixel.facebook.Pixel.PurchaseParameters

object PurchaseParameters {
  @scala.inline
  def apply(
    currency: String,
    value: Double,
    content_ids: js.Array[String] = null,
    content_name: String = null,
    content_type: String = null,
    num_items: Int | Double = null,
    order_id: String = null
  ): PurchaseParameters = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (content_ids != null) __obj.updateDynamic("content_ids")(content_ids.asInstanceOf[js.Any])
    if (content_name != null) __obj.updateDynamic("content_name")(content_name.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (num_items != null) __obj.updateDynamic("num_items")(num_items.asInstanceOf[js.Any])
    if (order_id != null) __obj.updateDynamic("order_id")(order_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseParameters]
  }
}

