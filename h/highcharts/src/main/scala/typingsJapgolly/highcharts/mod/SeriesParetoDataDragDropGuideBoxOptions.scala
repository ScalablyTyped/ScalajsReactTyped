package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesParetoDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesParetoDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesParetoDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesParetoDataDragDropGuideBoxDefaultOptions = null): SeriesParetoDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesParetoDataDragDropGuideBoxOptions]
  }
}

