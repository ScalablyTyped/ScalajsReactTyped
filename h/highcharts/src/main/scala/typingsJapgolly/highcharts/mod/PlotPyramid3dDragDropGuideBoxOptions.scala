package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPyramid3dDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotPyramid3dDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotPyramid3dDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotPyramid3dDragDropGuideBoxDefaultOptions = null): PlotPyramid3dDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPyramid3dDragDropGuideBoxOptions]
  }
}

