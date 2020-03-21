package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatterDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotScatterDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotScatterDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotScatterDragDropGuideBoxDefaultOptions = null): PlotScatterDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScatterDragDropGuideBoxOptions]
  }
}

