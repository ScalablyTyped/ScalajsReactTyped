package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDimensionRequest extends js.Object {
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object DeleteDimensionRequest {
  @scala.inline
  def apply(range: DimensionRange = null): DeleteDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDimensionRequest]
  }
}

