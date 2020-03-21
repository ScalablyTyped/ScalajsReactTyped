package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTimelineDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotTimelineDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotTimelineDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotTimelineDragDropGuideBoxDefaultOptions = null): PlotTimelineDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTimelineDragDropGuideBoxOptions]
  }
}

