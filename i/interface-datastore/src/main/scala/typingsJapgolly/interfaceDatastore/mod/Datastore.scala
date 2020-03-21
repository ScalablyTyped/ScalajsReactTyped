package typingsJapgolly.interfaceDatastore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datastore[Value] extends js.Object {
  def batch(): Batch[Value]
  def close(): js.Promise[Unit]
  def delete(key: Key): js.Promise[Unit]
  def get(key: Key): js.Promise[Value]
  def has(key: Key): js.Promise[Boolean]
  def open(): js.Promise[Unit]
  def put(key: Key, `val`: Value): js.Promise[Unit]
  def query(q: Query[Value]): AsyncIterable[Result[Value]]
}

object Datastore {
  @scala.inline
  def apply[Value](
    batch: CallbackTo[Batch[Value]],
    close: CallbackTo[js.Promise[Unit]],
    delete: Key => CallbackTo[js.Promise[Unit]],
    get: Key => CallbackTo[js.Promise[Value]],
    has: Key => CallbackTo[js.Promise[Boolean]],
    open: CallbackTo[js.Promise[Unit]],
    put: (Key, Value) => CallbackTo[js.Promise[Unit]],
    query: Query[Value] => CallbackTo[AsyncIterable[Result[Value]]]
  ): Datastore[Value] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batch")(batch.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Key) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Key) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Key) => has(t0).runNow()))
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("put")(js.Any.fromFunction2((t0: typingsJapgolly.interfaceDatastore.mod.Key, t1: Value) => put(t0, t1).runNow()))
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Query[Value]) => query(t0).runNow()))
    __obj.asInstanceOf[Datastore[Value]]
  }
}

