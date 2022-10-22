package typingsJapgolly.xtucLong

import typingsJapgolly.xtucLong.anon.High
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Long {
    
    @JSGlobal("Long")
    @js.native
    open class ^ protected ()
      extends typingsJapgolly.xtucLong.mod.^ {
      /**
        * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
        */
      def this(low: Double) = this()
      def this(low: Double, high: Double) = this()
      def this(low: Double, high: Double, unsigned: Boolean) = this()
      def this(low: Double, high: Unit, unsigned: Boolean) = this()
    }
    
    @JSGlobal("Long")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Maximum unsigned value.
      */
    /* static member */
    @JSGlobal("Long.MAX_UNSIGNED_VALUE")
    @js.native
    def MAX_UNSIGNED_VALUE: typingsJapgolly.xtucLong.mod.Long = js.native
    inline def MAX_UNSIGNED_VALUE_=(x: typingsJapgolly.xtucLong.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_UNSIGNED_VALUE")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum signed value.
      */
    /* static member */
    @JSGlobal("Long.MAX_VALUE")
    @js.native
    def MAX_VALUE: typingsJapgolly.xtucLong.mod.Long = js.native
    inline def MAX_VALUE_=(x: typingsJapgolly.xtucLong.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
    
    /**
      * Minimum signed value.
      */
    /* static member */
    @JSGlobal("Long.MIN_VALUE")
    @js.native
    def MIN_VALUE: typingsJapgolly.xtucLong.mod.Long = js.native
    inline def MIN_VALUE_=(x: typingsJapgolly.xtucLong.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
    
    /**
      * Signed negative one.
      */
    /* static member */
    @JSGlobal("Long.NEG_ONE")
    @js.native
    def NEG_ONE: typingsJapgolly.xtucLong.mod.Long = js.native
    inline def NEG_ONE_=(x: typingsJapgolly.xtucLong.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEG_ONE")(x.asInstanceOf[js.Any])
    
    /**
      * Signed one.
      */
    /* static member */
    @JSGlobal("Long.ONE")
    @js.native
    def ONE: typingsJapgolly.xtucLong.mod.Long = js.native
    inline def ONE_=(x: typingsJapgolly.xtucLong.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    /**
      * Unsigned one.
      */
    /* static member */
    @JSGlobal("Long.UONE")
    @js.native
    def UONE: typingsJapgolly.xtucLong.mod.Long = js.native
    inline def UONE_=(x: typingsJapgolly.xtucLong.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UONE")(x.asInstanceOf[js.Any])
    
    /**
      * Unsigned zero.
      */
    /* static member */
    @JSGlobal("Long.UZERO")
    @js.native
    def UZERO: typingsJapgolly.xtucLong.mod.Long = js.native
    inline def UZERO_=(x: typingsJapgolly.xtucLong.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UZERO")(x.asInstanceOf[js.Any])
    
    /**
      * Signed zero
      */
    /* static member */
    @JSGlobal("Long.ZERO")
    @js.native
    def ZERO: typingsJapgolly.xtucLong.mod.Long = js.native
    inline def ZERO_=(x: typingsJapgolly.xtucLong.mod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    /**
      * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits.
      */
    /* static member */
    inline def fromBits(lowBits: Double, highBits: Double): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    
    /**
      * Creates a Long from its byte representation.
      */
    /* static member */
    inline def fromBytes(bytes: js.Array[Double]): typingsJapgolly.xtucLong.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromBytes(bytes: js.Array[Double], unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromBytes(bytes: js.Array[Double], unsigned: Boolean, le: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromBytes(bytes: js.Array[Double], unsigned: Unit, le: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    
    /**
      * Creates a Long from its big endian byte representation.
      */
    /* static member */
    inline def fromBytesBE(bytes: js.Array[Double]): typingsJapgolly.xtucLong.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromBytesBE(bytes: js.Array[Double], unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    
    /**
      * Creates a Long from its little endian byte representation.
      */
    /* static member */
    inline def fromBytesLE(bytes: js.Array[Double]): typingsJapgolly.xtucLong.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromBytesLE(bytes: js.Array[Double], unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    
    /**
      * Returns a Long representing the given 32 bit integer value.
      */
    /* static member */
    inline def fromInt(value: Double): typingsJapgolly.xtucLong.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromInt(value: Double, unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    
    /**
      * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
      */
    /* static member */
    inline def fromNumber(value: Double): typingsJapgolly.xtucLong.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromNumber(value: Double, unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    
    /**
      * Returns a Long representation of the given string, written using the specified radix.
      */
    /* static member */
    inline def fromString(str: String): typingsJapgolly.xtucLong.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromString(str: String, unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromString(str: String, unsigned: Boolean, radix: Double): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromString(str: String, unsigned: Double): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromString(str: String, unsigned: Double, radix: Double): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromString(str: String, unsigned: Unit, radix: Double): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    
    inline def fromValue(`val`: String): typingsJapgolly.xtucLong.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromValue(`val`: String, unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromValue(`val`: Double): typingsJapgolly.xtucLong.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromValue(`val`: Double, unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromValue(`val`: High): typingsJapgolly.xtucLong.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromValue(`val`: High, unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    /**
      * Converts the specified value to a Long.
      */
    /* static member */
    inline def fromValue(`val`: typingsJapgolly.xtucLong.mod.Long): typingsJapgolly.xtucLong.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    inline def fromValue(`val`: typingsJapgolly.xtucLong.mod.Long, unsigned: Boolean): typingsJapgolly.xtucLong.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.xtucLong.mod.Long]
    
    /**
      * Tests if the specified object is a Long.
      */
    /* static member */
    inline def isLong(obj: Any): /* is @xtuc/long.@xtuc/long.Long */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLong")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @xtuc/long.@xtuc/long.Long */ Boolean]
  }
}
