package typingsJapgolly.awsCryptoIe11Detection.cryptoOperationMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.awsCryptoIe11Detection.keyMod.Key
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoOperation extends js.Object {
  val algorithm: String
  val key: Key
  val result: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  def abort(): Unit
  def finish(): Unit
  def onabort(event: Event_): Unit
  def oncomplete(event: Event_): Unit
  def onerror(event: Event_): Unit
  def onprogress(event: Event_): Unit
  def process(buffer: scala.scalajs.js.typedarray.ArrayBufferView): Unit
}

object CryptoOperation {
  @scala.inline
  def apply(
    abort: Callback,
    algorithm: String,
    finish: Callback,
    key: Key,
    onabort: Event_ => Callback,
    oncomplete: Event_ => Callback,
    onerror: Event_ => Callback,
    onprogress: Event_ => Callback,
    process: scala.scalajs.js.typedarray.ArrayBufferView => Callback,
    result: scala.scalajs.js.typedarray.ArrayBuffer = null
  ): CryptoOperation = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("finish")(finish.toJsFn)
    __obj.updateDynamic("onabort")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onabort(t0).runNow()))
    __obj.updateDynamic("oncomplete")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => oncomplete(t0).runNow()))
    __obj.updateDynamic("onerror")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onerror(t0).runNow()))
    __obj.updateDynamic("onprogress")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onprogress(t0).runNow()))
    __obj.updateDynamic("process")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.ArrayBufferView) => process(t0).runNow()))
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoOperation]
  }
}

