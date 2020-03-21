package typingsJapgolly.bitArray.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitArray extends js.Object {
  /**
    * Bitwise AND on the values of this BitArray using BitArray x.
    */
  def and(x: BitArray): BitArray
  /**
    * Returns a copy of this BitArray.
    */
  def copy(): BitArray
  /**
    * Returns the total number of bits set to one in this BitArray.
    */
  def count(): Double
  /**
    * Returns true if this BitArray equals another. Two BitArrays are considered
    * equal if both have the same length and bit pattern.
    */
  def equals(x: BitArray): Boolean
  /**
    * Returns the value of the bit at index (boolean.)
    */
  def get(index: Double): Boolean
  /**
    * Inverts this BitArray.
    */
  def not(): BitArray
  /**
    * Bitwise OR on the values of this BitArray using BitArray x.
    */
  def or(x: BitArray): BitArray
  /**
    * Resets the BitArray so that it is empty and can be re-used.
    */
  def reset(): BitArray
  /**
    * Sets the bit at index to a value (boolean.)
    */
  def set(index: Double, value: Boolean): BitArray
  /**
    * Returns the total number of bits in this BitArray.
    */
  def size(): Double
  /**
    * Convert the BitArray to an Array of boolean values (slow).
    */
  def toArray(): js.Array[Boolean]
  /**
    * Returns a string representation of the BitArray with bits
    * in mathemetical order.
    */
  def toBinaryString(): String
  /**
    * Returns a hexadecimal string representation of the BitArray
    * with bits in logical order.
    */
  def toHexString(): String
  /**
    * Returns the JSON representation of this BitArray.
    */
  def toJSON(): String
  /**
    * Toggles the bit at index. If the bit is on, it is turned off. Likewise, if the bit is off it is turned on.
    */
  def toggle(index: Double): BitArray
  /**
    * Bitwise XOR on the values of this BitArray using BitArray x.
    */
  def xor(x: BitArray): BitArray
}

object BitArray {
  @scala.inline
  def apply(
    and: BitArray => CallbackTo[BitArray],
    copy: CallbackTo[BitArray],
    count: CallbackTo[Double],
    equals: BitArray => CallbackTo[Boolean],
    get: Double => CallbackTo[Boolean],
    not: CallbackTo[BitArray],
    or: BitArray => CallbackTo[BitArray],
    reset: CallbackTo[BitArray],
    set: (Double, Boolean) => CallbackTo[BitArray],
    size: CallbackTo[Double],
    toArray: CallbackTo[js.Array[Boolean]],
    toBinaryString: CallbackTo[String],
    toHexString: CallbackTo[String],
    toJSON: CallbackTo[String],
    toggle: Double => CallbackTo[BitArray],
    xor: BitArray => CallbackTo[BitArray]
  ): BitArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.bitArray.mod.BitArray) => and(t0).runNow()))
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.bitArray.mod.BitArray) => equals(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("not")(not.toJsFn)
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: typingsJapgolly.bitArray.mod.BitArray) => or(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => set(t0, t1).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.updateDynamic("toBinaryString")(toBinaryString.toJsFn)
    __obj.updateDynamic("toHexString")(toHexString.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: scala.Double) => toggle(t0).runNow()))
    __obj.updateDynamic("xor")(js.Any.fromFunction1((t0: typingsJapgolly.bitArray.mod.BitArray) => xor(t0).runNow()))
    __obj.asInstanceOf[BitArray]
  }
}

