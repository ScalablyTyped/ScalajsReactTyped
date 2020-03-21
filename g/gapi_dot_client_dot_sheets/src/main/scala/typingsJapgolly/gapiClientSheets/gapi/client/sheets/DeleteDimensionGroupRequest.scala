package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDimensionGroupRequest extends js.Object {
  /** The range of the group to be deleted. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object DeleteDimensionGroupRequest {
  @scala.inline
  def apply(range: DimensionRange = null): DeleteDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDimensionGroupRequest]
  }
}

