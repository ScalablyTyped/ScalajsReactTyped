package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMappointDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotMappointDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotMappointDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotMappointDragDropGuideBoxDefaultOptions = null): PlotMappointDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMappointDragDropGuideBoxOptions]
  }
}

