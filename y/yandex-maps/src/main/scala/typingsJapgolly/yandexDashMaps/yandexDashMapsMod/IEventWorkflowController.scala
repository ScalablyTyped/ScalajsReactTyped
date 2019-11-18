package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventWorkflowController extends IEventController {
  var onAfterEventFiring: js.UndefOr[
    js.Function3[/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent], Unit]
  ] = js.undefined
  var onBeforeEventFiring: js.UndefOr[
    js.Function3[/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent], Unit]
  ] = js.undefined
}

object IEventWorkflowController {
  @scala.inline
  def apply(
    onAfterEventFiring: (/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent]) => Callback = null,
    onBeforeEventFiring: (/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent]) => Callback = null,
    onStartListening: (/* events */ IEventManager, /* type */ String) => Callback = null,
    onStopListening: (/* events */ IEventManager, /* type */ String) => Callback = null
  ): IEventWorkflowController = {
    val __obj = js.Dynamic.literal()
    if (onAfterEventFiring != null) __obj.updateDynamic("onAfterEventFiring")(js.Any.fromFunction3((t0: /* events */ typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager, t1: /* type */ java.lang.String, t2: /* event */ js.UndefOr[typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEvent]) => onAfterEventFiring(t0, t1, t2).runNow()))
    if (onBeforeEventFiring != null) __obj.updateDynamic("onBeforeEventFiring")(js.Any.fromFunction3((t0: /* events */ typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager, t1: /* type */ java.lang.String, t2: /* event */ js.UndefOr[typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEvent]) => onBeforeEventFiring(t0, t1, t2).runNow()))
    if (onStartListening != null) __obj.updateDynamic("onStartListening")(js.Any.fromFunction2((t0: /* events */ typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager, t1: /* type */ java.lang.String) => onStartListening(t0, t1).runNow()))
    if (onStopListening != null) __obj.updateDynamic("onStopListening")(js.Any.fromFunction2((t0: /* events */ typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager, t1: /* type */ java.lang.String) => onStopListening(t0, t1).runNow()))
    __obj.asInstanceOf[IEventWorkflowController]
  }
}

