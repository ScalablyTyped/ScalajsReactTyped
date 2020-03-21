package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPolygonDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesPolygonDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesPolygonDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesPolygonDataDragDropGuideBoxDefaultOptions = null): SeriesPolygonDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPolygonDataDragDropGuideBoxOptions]
  }
}

