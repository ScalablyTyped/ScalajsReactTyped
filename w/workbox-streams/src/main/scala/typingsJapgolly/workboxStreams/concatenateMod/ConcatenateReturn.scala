package typingsJapgolly.workboxStreams.concatenateMod

import org.scalajs.dom.experimental.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatenateReturn extends js.Object {
  var done: js.Promise[Unit]
  var stream: ReadableStream[_]
}

object ConcatenateReturn {
  @scala.inline
  def apply(done: js.Promise[Unit], stream: ReadableStream[_]): ConcatenateReturn = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConcatenateReturn]
  }
}

