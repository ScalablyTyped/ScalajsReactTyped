package typingsJapgolly.mongoose

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mongodb.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofLong extends Instantiable0[Long] {
  val MAX_VALUE: typingsJapgolly.bson.mod.Long = js.native
  val MIN_VALUE: typingsJapgolly.bson.mod.Long = js.native
  val NEG_ONE: typingsJapgolly.bson.mod.Long = js.native
  val ONE: typingsJapgolly.bson.mod.Long = js.native
  val ZERO: typingsJapgolly.bson.mod.Long = js.native
  /**
    * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: Double, highBits: Double): typingsJapgolly.bson.mod.Long = js.native
  /** Returns a Long representing the given (32-bit) integer value. */
  def fromInt(i: Double): typingsJapgolly.bson.mod.Long = js.native
  /** Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned. */
  def fromNumber(n: Double): typingsJapgolly.bson.mod.Long = js.native
  /**
    * Returns a Long representation of the given string
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  def fromString(s: String): typingsJapgolly.bson.mod.Long = js.native
  def fromString(s: String, opt_radix: Double): typingsJapgolly.bson.mod.Long = js.native
}

