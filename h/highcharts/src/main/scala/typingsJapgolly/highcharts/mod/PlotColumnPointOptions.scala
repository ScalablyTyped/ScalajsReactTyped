package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotColumnPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotColumnPointEventsOptions] = js.undefined
}

object PlotColumnPointOptions {
  @scala.inline
  def apply(events: PlotColumnPointEventsOptions = null): PlotColumnPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotColumnPointOptions]
  }
}

