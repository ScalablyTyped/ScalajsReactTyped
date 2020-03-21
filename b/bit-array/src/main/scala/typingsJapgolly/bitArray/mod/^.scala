package typingsJapgolly.bitArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bit-array", JSImport.Namespace)
@js.native
class ^ protected () extends BitArray {
  /**
    * Creates a new empty BitArray with the given length or initialises the BitArray with the given hex representation.
    */
  def this(size: Double) = this()
  def this(size: Double, hex: String) = this()
  /**
    * Bitwise AND on the values of this BitArray using BitArray x.
    */
  /* CompleteClass */
  override def and(x: BitArray): BitArray = js.native
  /**
    * Returns a copy of this BitArray.
    */
  /* CompleteClass */
  override def copy(): BitArray = js.native
  /**
    * Returns the total number of bits set to one in this BitArray.
    */
  /* CompleteClass */
  override def count(): Double = js.native
  /**
    * Returns true if this BitArray equals another. Two BitArrays are considered
    * equal if both have the same length and bit pattern.
    */
  /* CompleteClass */
  override def equals(x: BitArray): Boolean = js.native
  /**
    * Returns the value of the bit at index (boolean.)
    */
  /* CompleteClass */
  override def get(index: Double): Boolean = js.native
  /**
    * Inverts this BitArray.
    */
  /* CompleteClass */
  override def not(): BitArray = js.native
  /**
    * Bitwise OR on the values of this BitArray using BitArray x.
    */
  /* CompleteClass */
  override def or(x: BitArray): BitArray = js.native
  /**
    * Resets the BitArray so that it is empty and can be re-used.
    */
  /* CompleteClass */
  override def reset(): BitArray = js.native
  /**
    * Sets the bit at index to a value (boolean.)
    */
  /* CompleteClass */
  override def set(index: Double, value: Boolean): BitArray = js.native
  /**
    * Returns the total number of bits in this BitArray.
    */
  /* CompleteClass */
  override def size(): Double = js.native
  /**
    * Convert the BitArray to an Array of boolean values (slow).
    */
  /* CompleteClass */
  override def toArray(): js.Array[Boolean] = js.native
  /**
    * Returns a string representation of the BitArray with bits
    * in mathemetical order.
    */
  /* CompleteClass */
  override def toBinaryString(): String = js.native
  /**
    * Returns a hexadecimal string representation of the BitArray
    * with bits in logical order.
    */
  /* CompleteClass */
  override def toHexString(): String = js.native
  /**
    * Returns the JSON representation of this BitArray.
    */
  /* CompleteClass */
  override def toJSON(): String = js.native
  /**
    * Toggles the bit at index. If the bit is on, it is turned off. Likewise, if the bit is off it is turned on.
    */
  /* CompleteClass */
  override def toggle(index: Double): BitArray = js.native
  /**
    * Bitwise XOR on the values of this BitArray using BitArray x.
    */
  /* CompleteClass */
  override def xor(x: BitArray): BitArray = js.native
}

