package typingsJapgolly.openlayers.mod.olx.interaction

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.MapBrowserPointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerOptions extends js.Object {
  var handleDownEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.undefined
  var handleDragEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.undefined
  var handleEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.undefined
  var handleMoveEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.undefined
  var handleUpEvent: js.UndefOr[js.Function1[/* event */ MapBrowserPointerEvent, Boolean]] = js.undefined
}

object PointerOptions {
  @scala.inline
  def apply(
    handleDownEvent: /* event */ MapBrowserPointerEvent => CallbackTo[Boolean] = null,
    handleDragEvent: /* event */ MapBrowserPointerEvent => CallbackTo[Boolean] = null,
    handleEvent: /* event */ MapBrowserPointerEvent => CallbackTo[Boolean] = null,
    handleMoveEvent: /* event */ MapBrowserPointerEvent => CallbackTo[Boolean] = null,
    handleUpEvent: /* event */ MapBrowserPointerEvent => CallbackTo[Boolean] = null
  ): PointerOptions = {
    val __obj = js.Dynamic.literal()
    if (handleDownEvent != null) __obj.updateDynamic("handleDownEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserPointerEvent) => handleDownEvent(t0).runNow()))
    if (handleDragEvent != null) __obj.updateDynamic("handleDragEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserPointerEvent) => handleDragEvent(t0).runNow()))
    if (handleEvent != null) __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserPointerEvent) => handleEvent(t0).runNow()))
    if (handleMoveEvent != null) __obj.updateDynamic("handleMoveEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserPointerEvent) => handleMoveEvent(t0).runNow()))
    if (handleUpEvent != null) __obj.updateDynamic("handleUpEvent")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapBrowserPointerEvent) => handleUpEvent(t0).runNow()))
    __obj.asInstanceOf[PointerOptions]
  }
}

