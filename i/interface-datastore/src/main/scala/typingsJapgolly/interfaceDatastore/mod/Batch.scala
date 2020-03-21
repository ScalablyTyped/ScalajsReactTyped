package typingsJapgolly.interfaceDatastore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Batch[Value] extends js.Object {
  def commit(): js.Promise[Unit]
  def delete(key: Key): Unit
  def put(key: Key, value: Value): Unit
}

object Batch {
  @scala.inline
  def apply[Value](commit: CallbackTo[js.Promise[Unit]], delete: Key => Callback, put: (Key, Value) => Callback): Batch[Value] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commit")(commit.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Key) => delete(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction2((t0: typingsJapgolly.interfaceDatastore.mod.Key, t1: Value) => put(t0, t1).runNow()))
    __obj.asInstanceOf[Batch[Value]]
  }
}

