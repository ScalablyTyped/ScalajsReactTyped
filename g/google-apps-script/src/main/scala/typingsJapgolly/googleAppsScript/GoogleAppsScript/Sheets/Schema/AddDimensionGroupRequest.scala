package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDimensionGroupRequest extends js.Object {
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object AddDimensionGroupRequest {
  @scala.inline
  def apply(range: DimensionRange = null): AddDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddDimensionGroupRequest]
  }
}

