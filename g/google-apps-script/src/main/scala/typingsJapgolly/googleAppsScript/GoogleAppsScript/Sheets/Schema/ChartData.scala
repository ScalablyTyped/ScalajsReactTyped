package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartData extends js.Object {
  var sourceRange: js.UndefOr[ChartSourceRange] = js.undefined
}

object ChartData {
  @scala.inline
  def apply(sourceRange: ChartSourceRange = null): ChartData = {
    val __obj = js.Dynamic.literal()
    if (sourceRange != null) __obj.updateDynamic("sourceRange")(sourceRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
}

