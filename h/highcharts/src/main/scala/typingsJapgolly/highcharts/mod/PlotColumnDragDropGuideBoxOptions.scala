package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotColumnDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotColumnDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotColumnDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotColumnDragDropGuideBoxDefaultOptions = null): PlotColumnDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotColumnDragDropGuideBoxOptions]
  }
}

