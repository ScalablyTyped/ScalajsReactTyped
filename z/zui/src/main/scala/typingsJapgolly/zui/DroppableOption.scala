package typingsJapgolly.zui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableOption extends js.Object {
  var always: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  var before: js.UndefOr[js.Function1[/* e */ js.UndefOr[DroppableEvent], Boolean]] = js.undefined
  var beforeDrop: js.UndefOr[js.Function1[/* e */ DroppableEvent, Boolean]] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var deviation: js.UndefOr[Double] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  var finish: js.UndefOr[js.Function1[/* e */ DroppableEvent, Unit]] = js.undefined
  var flex: js.UndefOr[Boolean] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var sensorOffsetX: js.UndefOr[Double] = js.undefined
  var sensorOffsetY: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[DroppableEvent], Unit]] = js.undefined
  var target: JQuery | String
}

object DroppableOption {
  @scala.inline
  def apply(
    target: JQuery | String,
    always: /* e */ DroppableEvent => Callback = null,
    before: /* e */ js.UndefOr[DroppableEvent] => CallbackTo[Boolean] = null,
    beforeDrop: /* e */ DroppableEvent => CallbackTo[Boolean] = null,
    container: String = null,
    deviation: Int | Double = null,
    drag: /* e */ DroppableEvent => Callback = null,
    drop: /* e */ DroppableEvent => Callback = null,
    finish: /* e */ DroppableEvent => Callback = null,
    flex: js.UndefOr[Boolean] = js.undefined,
    handle: String = null,
    selector: String = null,
    sensorOffsetX: Int | Double = null,
    sensorOffsetY: Int | Double = null,
    start: /* e */ js.UndefOr[DroppableEvent] => Callback = null
  ): DroppableOption = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (always != null) __obj.updateDynamic("always")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.zui.DroppableEvent) => always(t0).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.zui.DroppableEvent]) => before(t0).runNow()))
    if (beforeDrop != null) __obj.updateDynamic("beforeDrop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.zui.DroppableEvent) => beforeDrop(t0).runNow()))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (deviation != null) __obj.updateDynamic("deviation")(deviation.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.zui.DroppableEvent) => drag(t0).runNow()))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.zui.DroppableEvent) => drop(t0).runNow()))
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.zui.DroppableEvent) => finish(t0).runNow()))
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (sensorOffsetX != null) __obj.updateDynamic("sensorOffsetX")(sensorOffsetX.asInstanceOf[js.Any])
    if (sensorOffsetY != null) __obj.updateDynamic("sensorOffsetY")(sensorOffsetY.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.zui.DroppableEvent]) => start(t0).runNow()))
    __obj.asInstanceOf[DroppableOption]
  }
}

