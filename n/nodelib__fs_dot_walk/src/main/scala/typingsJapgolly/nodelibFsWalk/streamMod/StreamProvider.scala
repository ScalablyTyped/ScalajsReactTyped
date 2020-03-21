package typingsJapgolly.nodelibFsWalk.streamMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamProvider extends js.Object {
  val _reader: typingsJapgolly.nodelibFsWalk.readersAsyncMod.default
  val _root: js.Any
  val _settings: js.Any
  val _stream: Readable
  def read(): Readable
}

object StreamProvider {
  @scala.inline
  def apply(
    _reader: typingsJapgolly.nodelibFsWalk.readersAsyncMod.default,
    _root: js.Any,
    _settings: js.Any,
    _stream: Readable,
    read: CallbackTo[Readable]
  ): StreamProvider = {
    val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _stream = _stream.asInstanceOf[js.Any])
    __obj.updateDynamic("read")(read.toJsFn)
    __obj.asInstanceOf[StreamProvider]
  }
}

