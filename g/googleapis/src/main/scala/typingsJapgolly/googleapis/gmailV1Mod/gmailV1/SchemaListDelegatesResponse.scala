package typingsJapgolly.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListDelegates method.
  */
@js.native
trait SchemaListDelegatesResponse extends js.Object {
  /**
    * List of the user&#39;s delegates (with any verification status).
    */
  var delegates: js.UndefOr[js.Array[SchemaDelegate]] = js.native
}

object SchemaListDelegatesResponse {
  @scala.inline
  def apply(delegates: js.Array[SchemaDelegate] = null): SchemaListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    if (delegates != null) __obj.updateDynamic("delegates")(delegates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDelegatesResponse]
  }
}

