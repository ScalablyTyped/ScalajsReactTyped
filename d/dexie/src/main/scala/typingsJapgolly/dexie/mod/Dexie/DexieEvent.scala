package typingsJapgolly.dexie.mod.Dexie

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexieEvent extends js.Object {
  var subscribers: js.Array[js.Function]
  def fire(args: js.Any*): js.Any
  def subscribe(fn: js.Function1[/* repeated */ js.Any, _]): Unit
  def unsubscribe(fn: js.Function1[/* repeated */ js.Any, _]): Unit
}

object DexieEvent {
  @scala.inline
  def apply(
    fire: /* repeated */ js.Any => CallbackTo[js.Any],
    subscribe: js.Function1[/* repeated */ js.Any, js.Any] => Callback,
    subscribers: js.Array[js.Function],
    unsubscribe: js.Function1[/* repeated */ js.Any, js.Any] => Callback
  ): DexieEvent = {
    val __obj = js.Dynamic.literal(subscribers = subscribers.asInstanceOf[js.Any])
    __obj.updateDynamic("fire")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fire(t0).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: js.Function1[/* repeated */ js.Any, js.Any]) => subscribe(t0).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction1((t0: js.Function1[/* repeated */ js.Any, js.Any]) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[DexieEvent]
  }
}

