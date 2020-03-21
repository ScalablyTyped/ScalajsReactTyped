package typingsJapgolly.pEvent.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emitter[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */] extends js.Object {
  var addEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var addListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var off: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var on: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var removeEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  var removeListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
}

object Emitter {
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    addEventListener: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Callback = null,
    addListener: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Callback = null,
    off: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Callback = null,
    on: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Callback = null,
    removeEventListener: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Callback = null,
    removeListener: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Callback = null
  ): Emitter[EventName, EmittedType] = {
    val __obj = js.Dynamic.literal()
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: EventName, t1: /* listener */ js.Function1[EmittedType, scala.Unit]) => addEventListener(t0, t1).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: EventName, t1: /* listener */ js.Function1[EmittedType, scala.Unit]) => addListener(t0, t1).runNow()))
    if (off != null) __obj.updateDynamic("off")(js.Any.fromFunction2((t0: EventName, t1: /* listener */ js.Function1[EmittedType, scala.Unit]) => off(t0, t1).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction2((t0: EventName, t1: /* listener */ js.Function1[EmittedType, scala.Unit]) => on(t0, t1).runNow()))
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: EventName, t1: /* listener */ js.Function1[EmittedType, scala.Unit]) => removeEventListener(t0, t1).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: EventName, t1: /* listener */ js.Function1[EmittedType, scala.Unit]) => removeListener(t0, t1).runNow()))
    __obj.asInstanceOf[Emitter[EventName, EmittedType]]
  }
}

