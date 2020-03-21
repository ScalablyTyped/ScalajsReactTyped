package typingsJapgolly.datastoreLevel.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.abstractLeveldown.mod.AbstractBatch
import typingsJapgolly.interfaceDatastore.mod.Batch
import typingsJapgolly.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDatastoreBatch[Value] extends Batch[Value] {
  var ops: js.Array[AbstractBatch[String, Value]]
}

object LevelDatastoreBatch {
  @scala.inline
  def apply[Value](
    commit: CallbackTo[js.Promise[Unit]],
    delete: Key => Callback,
    ops: js.Array[AbstractBatch[String, Value]],
    put: (Key, Value) => Callback
  ): LevelDatastoreBatch[Value] = {
    val __obj = js.Dynamic.literal(ops = ops.asInstanceOf[js.Any])
    __obj.updateDynamic("commit")(commit.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.interfaceDatastore.mod.Key) => delete(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction2((t0: typingsJapgolly.interfaceDatastore.mod.Key, t1: Value) => put(t0, t1).runNow()))
    __obj.asInstanceOf[LevelDatastoreBatch[Value]]
  }
}

