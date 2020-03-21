package typingsJapgolly.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersSetLineItemMetadataResponse extends js.Object {
  /**
    * The status of the execution.
    */
  var executionStatus: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersSetLineItemMetadataResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOrdersSetLineItemMetadataResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): SchemaOrdersSetLineItemMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersSetLineItemMetadataResponse]
  }
}

