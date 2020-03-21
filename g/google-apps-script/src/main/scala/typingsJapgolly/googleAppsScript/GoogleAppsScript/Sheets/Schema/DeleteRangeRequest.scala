package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRangeRequest extends js.Object {
  var range: js.UndefOr[GridRange] = js.undefined
  var shiftDimension: js.UndefOr[String] = js.undefined
}

object DeleteRangeRequest {
  @scala.inline
  def apply(range: GridRange = null, shiftDimension: String = null): DeleteRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (shiftDimension != null) __obj.updateDynamic("shiftDimension")(shiftDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRangeRequest]
  }
}

