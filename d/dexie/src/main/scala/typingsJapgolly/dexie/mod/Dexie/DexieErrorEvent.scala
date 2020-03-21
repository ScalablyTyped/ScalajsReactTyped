package typingsJapgolly.dexie.mod.Dexie

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexieErrorEvent extends js.Object {
  def fire(error: js.Any): js.Any
  def subscribe(fn: js.Function1[/* error */ js.Any, _]): Unit
  def unsubscribe(fn: js.Function1[/* error */ js.Any, _]): Unit
}

object DexieErrorEvent {
  @scala.inline
  def apply(
    fire: js.Any => CallbackTo[js.Any],
    subscribe: js.Function1[/* error */ js.Any, js.Any] => Callback,
    unsubscribe: js.Function1[/* error */ js.Any, js.Any] => Callback
  ): DexieErrorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fire")(js.Any.fromFunction1((t0: js.Any) => fire(t0).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, js.Any]) => subscribe(t0).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Any, js.Any]) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[DexieErrorEvent]
  }
}

