package typingsJapgolly.datastoreLevel.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.abstractLeveldown.mod.AbstractIterator
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import typingsJapgolly.interfaceDatastore.mod.Batch
import typingsJapgolly.interfaceDatastore.mod.Datastore
import typingsJapgolly.interfaceDatastore.mod.Key
import typingsJapgolly.interfaceDatastore.mod.Query
import typingsJapgolly.interfaceDatastore.mod.Result
import typingsJapgolly.levelup.mod.LevelUp
import typingsJapgolly.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDatastore[Value] extends Datastore[Value] {
  var db: LevelUp[AbstractLevelDOWN[String, Value], AbstractIterator[String, Value]]
}

object LevelDatastore {
  @scala.inline
  def apply[Value](
    batch: CallbackTo[Batch[Value]],
    close: CallbackTo[js.Promise[Unit]],
    db: LevelUp[AbstractLevelDOWN[String, Value], AbstractIterator[String, Value]],
    delete: Key => CallbackTo[js.Promise[Unit]],
    get: Key => CallbackTo[js.Promise[Value]],
    has: Key => CallbackTo[js.Promise[Boolean]],
    open: CallbackTo[js.Promise[Unit]],
    put: (Key, Value) => CallbackTo[js.Promise[Unit]],
    query: Query[Value] => CallbackTo[AsyncIterable[Result[Value]]]
  ): LevelDatastore[Value] = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.updateDynamic("batch")(batch.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Key) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Key) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Key) => has(t0).runNow()))
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("put")(js.Any.fromFunction2((t0: typingsJapgolly.interfaceDatastore.mod.Key, t1: Value) => put(t0, t1).runNow()))
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Query[Value]) => query(t0).runNow()))
    __obj.asInstanceOf[LevelDatastore[Value]]
  }
}

