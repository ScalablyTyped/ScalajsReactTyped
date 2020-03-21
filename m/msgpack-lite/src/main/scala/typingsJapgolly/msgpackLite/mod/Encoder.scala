package typingsJapgolly.msgpackLite.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder extends js.Object {
  var bufferish: js.Any
  var maxBufferSize: Double
  var minBufferSize: Double
  var offset: Double
  var start: Double
  def encode(chunk: js.Any): Unit
  def end(chunk: js.Any): Unit
  def fetch(): Unit
  def flush(): Unit
  def pull(): Double
  def push(chunk: js.Any): Unit
  def read(): Double
  def reserve(length: Double): Double
  def send(buffer: Buffer): Unit
  def write(chunk: js.Any): Unit
}

object Encoder {
  @scala.inline
  def apply(
    bufferish: js.Any,
    encode: js.Any => Callback,
    end: js.Any => Callback,
    fetch: Callback,
    flush: Callback,
    maxBufferSize: Double,
    minBufferSize: Double,
    offset: Double,
    pull: CallbackTo[Double],
    push: js.Any => Callback,
    read: CallbackTo[Double],
    reserve: Double => CallbackTo[Double],
    send: Buffer => Callback,
    start: Double,
    write: js.Any => Callback
  ): Encoder = {
    val __obj = js.Dynamic.literal(bufferish = bufferish.asInstanceOf[js.Any], maxBufferSize = maxBufferSize.asInstanceOf[js.Any], minBufferSize = minBufferSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: js.Any) => encode(t0).runNow()))
    __obj.updateDynamic("end")(js.Any.fromFunction1((t0: js.Any) => end(t0).runNow()))
    __obj.updateDynamic("fetch")(fetch.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("pull")(pull.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: js.Any) => push(t0).runNow()))
    __obj.updateDynamic("read")(read.toJsFn)
    __obj.updateDynamic("reserve")(js.Any.fromFunction1((t0: scala.Double) => reserve(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.node.Buffer) => send(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: js.Any) => write(t0).runNow()))
    __obj.asInstanceOf[Encoder]
  }
}

