package typingsJapgolly.nodelibFsWalk.asyncMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncProvider extends js.Object {
  val _reader: typingsJapgolly.nodelibFsWalk.readersAsyncMod.default
  val _root: js.Any
  val _settings: js.Any
  val _storage: js.Any
  def read(callback: AsyncCallback): Unit
}

object AsyncProvider {
  @scala.inline
  def apply(
    _reader: typingsJapgolly.nodelibFsWalk.readersAsyncMod.default,
    _root: js.Any,
    _settings: js.Any,
    _storage: js.Any,
    read: AsyncCallback => Callback
  ): AsyncProvider = {
    val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _storage = _storage.asInstanceOf[js.Any])
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: typingsJapgolly.nodelibFsWalk.asyncMod.AsyncCallback) => read(t0).runNow()))
    __obj.asInstanceOf[AsyncProvider]
  }
}

