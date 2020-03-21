package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotOhlcDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotOhlcDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotOhlcDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotOhlcDragDropGuideBoxDefaultOptions = null): PlotOhlcDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotOhlcDragDropGuideBoxOptions]
  }
}

