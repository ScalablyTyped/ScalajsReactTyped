package typingsJapgolly.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata extends js.Object {
  var annotations: js.UndefOr[js.Array[SchemaOrderMerchantProvidedAnnotation]] = js.native
  /**
    * The ID of the line item to set metadata. Either lineItemId or productId
    * is required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * The ID of the product to set metadata. This is the REST ID used in the
    * products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata {
  @scala.inline
  def apply(
    annotations: js.Array[SchemaOrderMerchantProvidedAnnotation] = null,
    lineItemId: String = null,
    productId: String = null
  ): SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata]
  }
}

