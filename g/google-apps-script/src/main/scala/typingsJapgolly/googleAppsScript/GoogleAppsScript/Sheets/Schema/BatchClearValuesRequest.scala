package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchClearValuesRequest extends js.Object {
  var ranges: js.UndefOr[js.Array[String]] = js.undefined
}

object BatchClearValuesRequest {
  @scala.inline
  def apply(ranges: js.Array[String] = null): BatchClearValuesRequest = {
    val __obj = js.Dynamic.literal()
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchClearValuesRequest]
  }
}

