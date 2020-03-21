package typingsJapgolly.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a named range to the spreadsheet.
  */
@js.native
trait SchemaAddNamedRangeRequest extends js.Object {
  /**
    * The named range to add. The namedRangeId field is optional; if one is not
    * set, an id will be randomly generated. (It is an error to specify the ID
    * of a range that already exists.)
    */
  var namedRange: js.UndefOr[SchemaNamedRange] = js.native
}

object SchemaAddNamedRangeRequest {
  @scala.inline
  def apply(namedRange: SchemaNamedRange = null): SchemaAddNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (namedRange != null) __obj.updateDynamic("namedRange")(namedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddNamedRangeRequest]
  }
}

