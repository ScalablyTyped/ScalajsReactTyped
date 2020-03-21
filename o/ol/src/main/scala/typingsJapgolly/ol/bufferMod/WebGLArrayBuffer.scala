package typingsJapgolly.ol.bufferMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLArrayBuffer extends js.Object {
  def fromArray(array: js.Array[Double]): Unit
  def fromArrayBuffer(buffer: scala.scalajs.js.typedarray.ArrayBuffer): Unit
  def getArray(): scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Uint32Array
  def getSize(): Double
  def getType(): Double
  def getUsage(): Double
  def ofSize(size: Double): Unit
}

object WebGLArrayBuffer {
  @scala.inline
  def apply(
    fromArray: js.Array[Double] => Callback,
    fromArrayBuffer: scala.scalajs.js.typedarray.ArrayBuffer => Callback,
    getArray: CallbackTo[
      scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Uint32Array
    ],
    getSize: CallbackTo[Double],
    getType: CallbackTo[Double],
    getUsage: CallbackTo[Double],
    ofSize: Double => Callback
  ): WebGLArrayBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromArray")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => fromArray(t0).runNow()))
    __obj.updateDynamic("fromArrayBuffer")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.ArrayBuffer) => fromArrayBuffer(t0).runNow()))
    __obj.updateDynamic("getArray")(getArray.toJsFn)
    __obj.updateDynamic("getSize")(getSize.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getUsage")(getUsage.toJsFn)
    __obj.updateDynamic("ofSize")(js.Any.fromFunction1((t0: scala.Double) => ofSize(t0).runNow()))
    __obj.asInstanceOf[WebGLArrayBuffer]
  }
}

