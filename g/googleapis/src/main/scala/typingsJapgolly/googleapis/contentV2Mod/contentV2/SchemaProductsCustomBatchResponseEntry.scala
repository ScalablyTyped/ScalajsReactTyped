package typingsJapgolly.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch products response.
  */
@js.native
trait SchemaProductsCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The inserted product. Only defined if the method is insert and if the
    * request was successful.
    */
  var product: js.UndefOr[SchemaProduct] = js.native
}

object SchemaProductsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    errors: SchemaErrors = null,
    kind: String = null,
    product: SchemaProduct = null
  ): SchemaProductsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductsCustomBatchResponseEntry]
  }
}

