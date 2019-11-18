package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerEvents extends js.Object {
  var change: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  var create: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  var spin: js.UndefOr[SpinnerEvent[SpinnerUIParam]] = js.undefined
  var start: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  var stop: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
}

object SpinnerEvents {
  @scala.inline
  def apply(
    change: (/* event */ JQueryEventObject, js.Object) => Callback = null,
    create: (/* event */ JQueryEventObject, js.Object) => Callback = null,
    spin: (/* event */ JQueryEventObject, SpinnerUIParam) => Callback = null,
    start: (/* event */ JQueryEventObject, js.Object) => Callback = null,
    stop: (/* event */ JQueryEventObject, js.Object) => Callback = null
  ): SpinnerEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: js.Object) => change(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: js.Object) => create(t0, t1).runNow()))
    if (spin != null) __obj.updateDynamic("spin")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: typingsJapgolly.jqueryui.JQueryUI.SpinnerUIParam) => spin(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: js.Object) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: js.Object) => stop(t0, t1).runNow()))
    __obj.asInstanceOf[SpinnerEvents]
  }
}

