package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryCreateTestReturnReturnItem extends js.Object {
  var lineItemId: js.UndefOr[String] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
}

object OrdersCustomBatchRequestEntryCreateTestReturnReturnItem {
  @scala.inline
  def apply(lineItemId: String = null, quantity: Int | Double = null): OrdersCustomBatchRequestEntryCreateTestReturnReturnItem = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]
  }
}

