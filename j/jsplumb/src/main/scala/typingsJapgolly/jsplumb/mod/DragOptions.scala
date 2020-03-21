package typingsJapgolly.jsplumb.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragOptions extends js.Object {
  var containment: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.undefined
  var start: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.undefined
  var stop: js.UndefOr[js.Function1[/* params */ DragEventCallbackOptions, Unit]] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object DragOptions {
  @scala.inline
  def apply(
    containment: String = null,
    cursor: String = null,
    drag: /* params */ DragEventCallbackOptions => Callback = null,
    start: /* params */ DragEventCallbackOptions => Callback = null,
    stop: /* params */ DragEventCallbackOptions => Callback = null,
    zIndex: Int | Double = null
  ): DragOptions = {
    val __obj = js.Dynamic.literal()
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.jsplumb.mod.DragEventCallbackOptions) => drag(t0).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.jsplumb.mod.DragEventCallbackOptions) => start(t0).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.jsplumb.mod.DragEventCallbackOptions) => stop(t0).runNow()))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragOptions]
  }
}

