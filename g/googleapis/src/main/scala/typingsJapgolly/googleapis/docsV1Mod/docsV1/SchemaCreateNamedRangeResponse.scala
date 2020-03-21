package typingsJapgolly.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a named range.
  */
@js.native
trait SchemaCreateNamedRangeResponse extends js.Object {
  /**
    * The ID of the created named range.
    */
  var namedRangeId: js.UndefOr[String] = js.native
}

object SchemaCreateNamedRangeResponse {
  @scala.inline
  def apply(namedRangeId: String = null): SchemaCreateNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateNamedRangeResponse]
  }
}

