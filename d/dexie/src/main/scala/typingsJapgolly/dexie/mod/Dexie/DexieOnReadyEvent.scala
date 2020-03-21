package typingsJapgolly.dexie.mod.Dexie

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexieOnReadyEvent extends js.Object {
  def fire(): js.Any
  def subscribe(fn: js.Function0[_], bSticky: Boolean): Unit
  def unsubscribe(fn: js.Function0[_]): Unit
}

object DexieOnReadyEvent {
  @scala.inline
  def apply(
    fire: CallbackTo[js.Any],
    subscribe: (js.Function0[js.Any], Boolean) => Callback,
    unsubscribe: js.Function0[js.Any] => Callback
  ): DexieOnReadyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fire")(fire.toJsFn)
    __obj.updateDynamic("subscribe")(js.Any.fromFunction2((t0: js.Function0[js.Any], t1: scala.Boolean) => subscribe(t0, t1).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[DexieOnReadyEvent]
  }
}

