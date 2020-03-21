package typingsJapgolly.ol.pointerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var handleDownEvent: js.UndefOr[
    js.Function1[/* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default, Boolean]
  ] = js.undefined
  var handleDragEvent: js.UndefOr[
    js.Function1[/* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default, Unit]
  ] = js.undefined
  var handleEvent: js.UndefOr[js.Function1[/* p0 */ typingsJapgolly.ol.mapBrowserEventMod.default, Boolean]] = js.undefined
  var handleMoveEvent: js.UndefOr[
    js.Function1[/* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default, Unit]
  ] = js.undefined
  var handleUpEvent: js.UndefOr[
    js.Function1[/* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default, Boolean]
  ] = js.undefined
  var stopDown: js.UndefOr[js.Function1[/* p0 */ Boolean, Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    handleDownEvent: /* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default => CallbackTo[Boolean] = null,
    handleDragEvent: /* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default => Callback = null,
    handleEvent: /* p0 */ typingsJapgolly.ol.mapBrowserEventMod.default => CallbackTo[Boolean] = null,
    handleMoveEvent: /* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default => Callback = null,
    handleUpEvent: /* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default => CallbackTo[Boolean] = null,
    stopDown: /* p0 */ Boolean => CallbackTo[Boolean] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (handleDownEvent != null) __obj.updateDynamic("handleDownEvent")(js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default) => handleDownEvent(t0).runNow()))
    if (handleDragEvent != null) __obj.updateDynamic("handleDragEvent")(js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default) => handleDragEvent(t0).runNow()))
    if (handleEvent != null) __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapBrowserEventMod.default) => handleEvent(t0).runNow()))
    if (handleMoveEvent != null) __obj.updateDynamic("handleMoveEvent")(js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default) => handleMoveEvent(t0).runNow()))
    if (handleUpEvent != null) __obj.updateDynamic("handleUpEvent")(js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapBrowserPointerEventMod.default) => handleUpEvent(t0).runNow()))
    if (stopDown != null) __obj.updateDynamic("stopDown")(js.Any.fromFunction1((t0: /* p0 */ scala.Boolean) => stopDown(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

