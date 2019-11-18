package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventController extends js.Object {
  var onStartListening: js.UndefOr[js.Function2[/* events */ IEventManager, /* type */ String, Unit]] = js.undefined
  var onStopListening: js.UndefOr[js.Function2[/* events */ IEventManager, /* type */ String, Unit]] = js.undefined
}

object IEventController {
  @scala.inline
  def apply(
    onStartListening: (/* events */ IEventManager, /* type */ String) => Callback = null,
    onStopListening: (/* events */ IEventManager, /* type */ String) => Callback = null
  ): IEventController = {
    val __obj = js.Dynamic.literal()
    if (onStartListening != null) __obj.updateDynamic("onStartListening")(js.Any.fromFunction2((t0: /* events */ typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager, t1: /* type */ java.lang.String) => onStartListening(t0, t1).runNow()))
    if (onStopListening != null) __obj.updateDynamic("onStopListening")(js.Any.fromFunction2((t0: /* events */ typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IEventManager, t1: /* type */ java.lang.String) => onStopListening(t0, t1).runNow()))
    __obj.asInstanceOf[IEventController]
  }
}

