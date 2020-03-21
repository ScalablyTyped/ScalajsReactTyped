package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotColumnrangeDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotColumnrangeDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotColumnrangeDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotColumnrangeDragDropGuideBoxDefaultOptions = null): PlotColumnrangeDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotColumnrangeDragDropGuideBoxOptions]
  }
}

