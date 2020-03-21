package typingsJapgolly.minimalBitArray.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitArray extends js.Object {
  var bits: scala.scalajs.js.typedarray.Uint32Array
  var length: Double
  def get(index: Double): Boolean
  def set(index: Double, value: js.Any): Boolean
  def toJSON(): BitArrayJSON
}

object BitArray {
  @scala.inline
  def apply(
    bits: scala.scalajs.js.typedarray.Uint32Array,
    get: Double => CallbackTo[Boolean],
    length: Double,
    set: (Double, js.Any) => CallbackTo[Boolean],
    toJSON: CallbackTo[BitArrayJSON]
  ): BitArray = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: scala.Double, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[BitArray]
  }
}

