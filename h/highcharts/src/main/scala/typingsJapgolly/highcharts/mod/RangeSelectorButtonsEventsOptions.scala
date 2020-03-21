package typingsJapgolly.highcharts.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButtonsEventsOptions extends js.Object {
  /**
    * (Highstock, Gantt) Fires when clicking on the rangeSelector button. One
    * parameter, event, is passed to the function, containing common event
    * information.
    *
    *  (see online documentation for example)
    *
    * Return false to stop default button's click action.
    */
  var click: js.UndefOr[RangeSelectorClickCallbackFunction] = js.undefined
}

object RangeSelectorButtonsEventsOptions {
  @scala.inline
  def apply(click: (/* e */ Event_, /* Return */ js.UndefOr[Boolean]) => Callback = null): RangeSelectorButtonsEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.std.Event_, t1: /* Return */ js.UndefOr[scala.Boolean]) => click(t0, t1).runNow()))
    __obj.asInstanceOf[RangeSelectorButtonsEventsOptions]
  }
}

