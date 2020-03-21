package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubblePointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotPackedbubblePointEventsOptions] = js.undefined
}

object PlotPackedbubblePointOptions {
  @scala.inline
  def apply(events: PlotPackedbubblePointEventsOptions = null): PlotPackedbubblePointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedbubblePointOptions]
  }
}

