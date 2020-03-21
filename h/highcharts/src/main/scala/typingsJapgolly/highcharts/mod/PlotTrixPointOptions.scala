package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTrixPointOptions extends js.Object {
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PlotTrixPointEventsOptions] = js.undefined
}

object PlotTrixPointOptions {
  @scala.inline
  def apply(events: PlotTrixPointEventsOptions = null): PlotTrixPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTrixPointOptions]
  }
}

