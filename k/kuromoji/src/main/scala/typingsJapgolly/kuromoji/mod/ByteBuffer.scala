package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteBuffer extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Uint8Array
  var position: Double
  def get(index: Double): Double
  def getInt(index: Double): Double
  def getShort(index: Double): Double
  def getString(index: Double): String
  def put(b: Double): Unit
  def putInt(num: Double): Unit
  def putShort(num: Double): Unit
  def putString(str: String): Unit
  def readInt(): Double
  def reallocate(): Unit
  def shrink(): scala.scalajs.js.typedarray.Uint8Array
  def size(): Double
}

object ByteBuffer {
  @scala.inline
  def apply(
    buffer: scala.scalajs.js.typedarray.Uint8Array,
    get: Double => CallbackTo[Double],
    getInt: Double => CallbackTo[Double],
    getShort: Double => CallbackTo[Double],
    getString: Double => CallbackTo[String],
    position: Double,
    put: Double => Callback,
    putInt: Double => Callback,
    putShort: Double => Callback,
    putString: String => Callback,
    readInt: CallbackTo[Double],
    reallocate: Callback,
    shrink: CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    size: CallbackTo[Double]
  ): ByteBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("getInt")(js.Any.fromFunction1((t0: scala.Double) => getInt(t0).runNow()))
    __obj.updateDynamic("getShort")(js.Any.fromFunction1((t0: scala.Double) => getShort(t0).runNow()))
    __obj.updateDynamic("getString")(js.Any.fromFunction1((t0: scala.Double) => getString(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction1((t0: scala.Double) => put(t0).runNow()))
    __obj.updateDynamic("putInt")(js.Any.fromFunction1((t0: scala.Double) => putInt(t0).runNow()))
    __obj.updateDynamic("putShort")(js.Any.fromFunction1((t0: scala.Double) => putShort(t0).runNow()))
    __obj.updateDynamic("putString")(js.Any.fromFunction1((t0: java.lang.String) => putString(t0).runNow()))
    __obj.updateDynamic("readInt")(readInt.toJsFn)
    __obj.updateDynamic("reallocate")(reallocate.toJsFn)
    __obj.updateDynamic("shrink")(shrink.toJsFn)
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[ByteBuffer]
  }
}

