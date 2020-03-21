package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartSeriesFormat extends Entity {
  // Represents the fill format of a chart series, which includes background formating information. Read-only.
  var fill: js.UndefOr[WorkbookChartFill] = js.undefined
  // Represents line formatting. Read-only.
  var line: js.UndefOr[WorkbookChartLineFormat] = js.undefined
}

object WorkbookChartSeriesFormat {
  @scala.inline
  def apply(fill: WorkbookChartFill = null, id: String = null, line: WorkbookChartLineFormat = null): WorkbookChartSeriesFormat = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartSeriesFormat]
  }
}

