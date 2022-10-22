package typingsJapgolly.meteor.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.bson.anon.High
import typingsJapgolly.bson.anon.NumberLong
import typingsJapgolly.bson.mod.EJSONOptions
import typingsJapgolly.mongodb.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLong
  extends StObject
     with Instantiable0[Long] {
  
  /** Maximum unsigned value. */
  var MAX_UNSIGNED_VALUE: typingsJapgolly.bson.mod.Long = js.native
  
  /** Maximum signed value. */
  var MAX_VALUE: typingsJapgolly.bson.mod.Long = js.native
  
  /** Minimum signed value. */
  var MIN_VALUE: typingsJapgolly.bson.mod.Long = js.native
  
  /** Signed negative one. */
  var NEG_ONE: typingsJapgolly.bson.mod.Long = js.native
  
  /** Signed one. */
  var ONE: typingsJapgolly.bson.mod.Long = js.native
  
  var TWO_PWR_24: typingsJapgolly.bson.mod.Long = js.native
  
  /** Unsigned one. */
  var UONE: typingsJapgolly.bson.mod.Long = js.native
  
  /** Unsigned zero. */
  var UZERO: typingsJapgolly.bson.mod.Long = js.native
  
  /** Signed zero */
  var ZERO: typingsJapgolly.bson.mod.Long = js.native
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    * @param value - The number in question
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  def fromBigInt(value: js.BigInt): typingsJapgolly.bson.mod.Long = js.native
  def fromBigInt(value: js.BigInt, unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  
  /**
    * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits.
    * Each is assumed to use 32 bits.
    * @param lowBits - The low 32 bits
    * @param highBits - The high 32 bits
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  def fromBits(lowBits: Double, highBits: Double): typingsJapgolly.bson.mod.Long = js.native
  def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  
  /**
    * Creates a Long from its byte representation.
    * @param bytes - Byte representation
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @param le - Whether little or big endian, defaults to big endian
    * @returns The corresponding Long value
    */
  def fromBytes(bytes: js.Array[Double]): typingsJapgolly.bson.mod.Long = js.native
  def fromBytes(bytes: js.Array[Double], unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  def fromBytes(bytes: js.Array[Double], unsigned: Boolean, le: Boolean): typingsJapgolly.bson.mod.Long = js.native
  def fromBytes(bytes: js.Array[Double], unsigned: Unit, le: Boolean): typingsJapgolly.bson.mod.Long = js.native
  
  /**
    * Creates a Long from its big endian byte representation.
    * @param bytes - Big endian byte representation
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  def fromBytesBE(bytes: js.Array[Double]): typingsJapgolly.bson.mod.Long = js.native
  def fromBytesBE(bytes: js.Array[Double], unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  
  /**
    * Creates a Long from its little endian byte representation.
    * @param bytes - Little endian byte representation
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  def fromBytesLE(bytes: js.Array[Double]): typingsJapgolly.bson.mod.Long = js.native
  def fromBytesLE(bytes: js.Array[Double], unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  
  def fromExtendedJSON(doc: NumberLong): Double | typingsJapgolly.bson.mod.Long = js.native
  def fromExtendedJSON(doc: NumberLong, options: EJSONOptions): Double | typingsJapgolly.bson.mod.Long = js.native
  
  /**
    * Returns a Long representing the given 32 bit integer value.
    * @param value - The 32 bit integer in question
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  def fromInt(value: Double): typingsJapgolly.bson.mod.Long = js.native
  def fromInt(value: Double, unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  
  /**
    * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
    * @param value - The number in question
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @returns The corresponding Long value
    */
  def fromNumber(value: Double): typingsJapgolly.bson.mod.Long = js.native
  def fromNumber(value: Double, unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  
  /**
    * Returns a Long representation of the given string, written using the specified radix.
    * @param str - The textual representation of the Long
    * @param unsigned - Whether unsigned or not, defaults to signed
    * @param radix - The radix in which the text is written (2-36), defaults to 10
    * @returns The corresponding Long value
    */
  def fromString(str: String): typingsJapgolly.bson.mod.Long = js.native
  def fromString(str: String, unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  def fromString(str: String, unsigned: Boolean, radix: Double): typingsJapgolly.bson.mod.Long = js.native
  def fromString(str: String, unsigned: Unit, radix: Double): typingsJapgolly.bson.mod.Long = js.native
  
  def fromValue(`val`: String): typingsJapgolly.bson.mod.Long = js.native
  def fromValue(`val`: String, unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  /**
    * Converts the specified value to a Long.
    * @param unsigned - Whether unsigned or not, defaults to signed
    */
  def fromValue(`val`: Double): typingsJapgolly.bson.mod.Long = js.native
  def fromValue(`val`: Double, unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  def fromValue(`val`: High): typingsJapgolly.bson.mod.Long = js.native
  def fromValue(`val`: High, unsigned: Boolean): typingsJapgolly.bson.mod.Long = js.native
  
  /**
    * Tests if the specified object is a Long.
    */
  def isLong(value: Any): /* is bson.bson.Long */ Boolean = js.native
}
