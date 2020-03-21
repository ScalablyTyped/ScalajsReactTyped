package typingsJapgolly.dexie.mod.Dexie

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.IDBVersionChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexieVersionChangeEvent extends js.Object {
  def fire(event: IDBVersionChangeEvent): js.Any
  def subscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit
  def unsubscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit
}

object DexieVersionChangeEvent {
  @scala.inline
  def apply(
    fire: IDBVersionChangeEvent => CallbackTo[js.Any],
    subscribe: js.Function1[/* event */ IDBVersionChangeEvent, js.Any] => Callback,
    unsubscribe: js.Function1[/* event */ IDBVersionChangeEvent, js.Any] => Callback
  ): DexieVersionChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fire")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.IDBVersionChangeEvent) => fire(t0).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: js.Function1[/* event */ org.scalajs.dom.raw.IDBVersionChangeEvent, js.Any]) => subscribe(t0).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction1((t0: js.Function1[/* event */ org.scalajs.dom.raw.IDBVersionChangeEvent, js.Any]) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[DexieVersionChangeEvent]
  }
}

