package typingsJapgolly.readableStream.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_writable ====
trait CorkedRequest extends js.Object {
  var entry: js.Any
  var next: js.Any
  def finish(): Unit
}

object CorkedRequest {
  @scala.inline
  def apply(entry: js.Any, finish: Callback, next: js.Any): CorkedRequest = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.updateDynamic("finish")(finish.toJsFn)
    __obj.asInstanceOf[CorkedRequest]
  }
}

