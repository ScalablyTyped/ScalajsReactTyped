package typingsJapgolly.bson.mod

import typingsJapgolly.bson.anon.I
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (low : unknown, high : number | undefined, unsigned : boolean | undefined): bson.anon.PinExcludekeyofLongTimest */ @JSImport("bson", "Timestamp")
@js.native
open class Timestamp protected () extends StObject {
  /**
    * @param low - A 64-bit Long representing the Timestamp.
    */
  def this(long: Long) = this()
  /**
    * @param value - A pair of two values indicating timestamp and increment.
    */
  def this(value: I) = this()
  /**
    * @param low - the low (signed) 32 bits of the Timestamp.
    * @param high - the high (signed) 32 bits of the Timestamp.
    * @deprecated Please use `Timestamp({ t: high, i: low })` or `Timestamp(Long(low, high))` instead.
    */
  def this(low: scala.Double, high: scala.Double) = this()
  
  var _bsontype: typingsJapgolly.bson.bsonStrings.Timestamp = js.native
  
  /* Excluded from this release type: toExtendedJSON */
  /* Excluded from this release type: fromExtendedJSON */
  def inspect(): String = js.native
  
  def toJSON(): typingsJapgolly.bson.anon.Timestamp = js.native
}
/* static members */
object Timestamp {
  
  @JSImport("bson", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bson", "Timestamp.MAX_VALUE")
  @js.native
  val MAX_VALUE: Long = js.native
  
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    *
    * @param lowBits - the low 32-bits.
    * @param highBits - the high 32-bits.
    */
  inline def fromBits(lowBits: scala.Double, highBits: scala.Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
  
  /** Returns a Timestamp represented by the given (32-bit) integer value. */
  inline def fromInt(value: scala.Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. Otherwise, zero is returned. */
  inline def fromNumber(value: scala.Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  /**
    * Returns a Timestamp from the given string, optionally using the given radix.
    *
    * @param str - the textual representation of the Timestamp.
    * @param optRadix - the radix in which the text is written.
    */
  inline def fromString(str: String, optRadix: scala.Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], optRadix.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
}
