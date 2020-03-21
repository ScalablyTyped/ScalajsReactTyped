package typingsJapgolly.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem extends js.Object {
  /**
    * The ID of the line item to return.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * Quantity that is returned.
    */
  var quantity: js.UndefOr[Double] = js.native
}

object SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem {
  @scala.inline
  def apply(lineItemId: String = null, quantity: Int | Double = null): SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]
  }
}

