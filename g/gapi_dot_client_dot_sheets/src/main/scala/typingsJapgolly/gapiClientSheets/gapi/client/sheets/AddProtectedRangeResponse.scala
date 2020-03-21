package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddProtectedRangeResponse extends js.Object {
  /** The newly added protected range. */
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}

object AddProtectedRangeResponse {
  @scala.inline
  def apply(protectedRange: ProtectedRange = null): AddProtectedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddProtectedRangeResponse]
  }
}

