package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesXrangeDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Style options for the guide box default
    * state.
    */
  var default: js.UndefOr[SeriesXrangeDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesXrangeDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesXrangeDataDragDropGuideBoxDefaultOptions = null): SeriesXrangeDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesXrangeDataDragDropGuideBoxOptions]
  }
}

