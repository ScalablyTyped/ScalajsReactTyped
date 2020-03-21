package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesNetworkgraphDataDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[SeriesNetworkgraphDataDragDropGuideBoxDefaultOptions] = js.undefined
}

object SeriesNetworkgraphDataDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: SeriesNetworkgraphDataDragDropGuideBoxDefaultOptions = null): SeriesNetworkgraphDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesNetworkgraphDataDragDropGuideBoxOptions]
  }
}

