package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBoxplotDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotBoxplotDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotBoxplotDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotBoxplotDragDropGuideBoxDefaultOptions = null): PlotBoxplotDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBoxplotDragDropGuideBoxOptions]
  }
}

