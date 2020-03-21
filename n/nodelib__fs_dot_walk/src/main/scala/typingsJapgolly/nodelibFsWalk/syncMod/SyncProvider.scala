package typingsJapgolly.nodelibFsWalk.syncMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodelibFsWalk.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncProvider extends js.Object {
  val _reader: typingsJapgolly.nodelibFsWalk.readersSyncMod.default
  val _root: js.Any
  val _settings: js.Any
  def read(): js.Array[Entry]
}

object SyncProvider {
  @scala.inline
  def apply(
    _reader: typingsJapgolly.nodelibFsWalk.readersSyncMod.default,
    _root: js.Any,
    _settings: js.Any,
    read: CallbackTo[js.Array[Entry]]
  ): SyncProvider = {
    val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any])
    __obj.updateDynamic("read")(read.toJsFn)
    __obj.asInstanceOf[SyncProvider]
  }
}

