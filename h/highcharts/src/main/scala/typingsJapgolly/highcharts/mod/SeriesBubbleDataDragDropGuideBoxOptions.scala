package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesBubbleDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesBubbleDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesBubbleDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesBubbleDataDragDropGuideBoxDefaultOptions = null): SeriesBubbleDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesBubbleDataDragDropGuideBoxOptions]
  }
}

