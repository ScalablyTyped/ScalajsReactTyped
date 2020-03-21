package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPolygonDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotPolygonDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotPolygonDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotPolygonDragDropGuideBoxDefaultOptions = null): PlotPolygonDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPolygonDragDropGuideBoxOptions]
  }
}

