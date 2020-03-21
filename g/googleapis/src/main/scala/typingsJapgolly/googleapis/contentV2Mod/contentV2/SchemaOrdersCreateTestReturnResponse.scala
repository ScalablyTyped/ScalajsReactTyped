package typingsJapgolly.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCreateTestReturnResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersCreateTestReturnResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the newly created test order return.
    */
  var returnId: js.UndefOr[String] = js.native
}

object SchemaOrdersCreateTestReturnResponse {
  @scala.inline
  def apply(kind: String = null, returnId: String = null): SchemaOrdersCreateTestReturnResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (returnId != null) __obj.updateDynamic("returnId")(returnId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersCreateTestReturnResponse]
  }
}

