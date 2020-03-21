package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddNamedRangeResponse extends js.Object {
  /** The named range to add. */
  var namedRange: js.UndefOr[NamedRange] = js.undefined
}

object AddNamedRangeResponse {
  @scala.inline
  def apply(namedRange: NamedRange = null): AddNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (namedRange != null) __obj.updateDynamic("namedRange")(namedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddNamedRangeResponse]
  }
}

