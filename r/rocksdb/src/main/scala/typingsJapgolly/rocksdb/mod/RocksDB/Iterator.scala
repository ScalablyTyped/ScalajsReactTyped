package typingsJapgolly.rocksdb.mod.RocksDB

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.abstractLeveldown.mod.AbstractIterator
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import typingsJapgolly.abstractLeveldown.mod.ErrorCallback
import typingsJapgolly.abstractLeveldown.mod.ErrorKeyValueCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator extends AbstractIterator[Bytes, Bytes] {
  var binding: js.Any
  var cache: js.Any
  var fastFuture: js.Any
  var finished: js.Any
  def seek(key: Bytes): Unit
}

object Iterator {
  @scala.inline
  def apply(
    binding: js.Any,
    cache: js.Any,
    db: AbstractLevelDOWN[Bytes, Bytes],
    end: ErrorCallback => Callback,
    fastFuture: js.Any,
    finished: js.Any,
    next: ErrorKeyValueCallback[Bytes, Bytes] => CallbackTo[Iterator],
    seek: Bytes => Callback
  ): Iterator = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], fastFuture = fastFuture.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(js.Any.fromFunction1((t0: typingsJapgolly.abstractLeveldown.mod.ErrorCallback) => end(t0).runNow()))
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: typingsJapgolly.abstractLeveldown.mod.ErrorKeyValueCallback[
  typingsJapgolly.rocksdb.mod.RocksDB.Bytes, 
  typingsJapgolly.rocksdb.mod.RocksDB.Bytes]) => next(t0).runNow()))
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: typingsJapgolly.rocksdb.mod.RocksDB.Bytes) => seek(t0).runNow()))
    __obj.asInstanceOf[Iterator]
  }
}

