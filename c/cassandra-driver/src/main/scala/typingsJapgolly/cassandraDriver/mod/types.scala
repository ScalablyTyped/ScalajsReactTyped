package typingsJapgolly.cassandraDriver.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types {
  
  @JSImport("cassandra-driver", "types.BigDecimal")
  @js.native
  open class BigDecimal protected ()
    extends typingsJapgolly.cassandraDriver.libTypesMod.types.BigDecimal {
    def this(unscaledValue: Double, scale: Double) = this()
  }
  object BigDecimal {
    
    @JSImport("cassandra-driver", "types.BigDecimal")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buf: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.BigDecimal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.BigDecimal]
    
    /* static member */
    inline def fromNumber(value: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.BigDecimal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.BigDecimal]
    
    /* static member */
    inline def fromString(value: String): typingsJapgolly.cassandraDriver.libTypesMod.types.BigDecimal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.BigDecimal]
    
    /* static member */
    inline def toBuffer(value: typingsJapgolly.cassandraDriver.libTypesMod.types.BigDecimal): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  @JSImport("cassandra-driver", "types.Duration")
  @js.native
  open class Duration protected ()
    extends typingsJapgolly.cassandraDriver.libTypesMod.types.Duration {
    def this(month: Double, days: Double, nanoseconds: Double) = this()
    def this(month: Double, days: Double, nanoseconds: typingsJapgolly.cassandraDriver.libTypesMod.types.Long) = this()
  }
  object Duration {
    
    @JSImport("cassandra-driver", "types.Duration")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buffer: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Duration]
    
    /* static member */
    inline def fromString(input: String): typingsJapgolly.cassandraDriver.libTypesMod.types.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Duration]
  }
  
  @JSImport("cassandra-driver", "types.InetAddress")
  @js.native
  open class InetAddress protected ()
    extends typingsJapgolly.cassandraDriver.libTypesMod.types.InetAddress {
    def this(buffer: Buffer) = this()
  }
  object InetAddress {
    
    @JSImport("cassandra-driver", "types.InetAddress")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromString(value: String): typingsJapgolly.cassandraDriver.libTypesMod.types.InetAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.InetAddress]
  }
  
  @JSImport("cassandra-driver", "types.Integer")
  @js.native
  open class Integer protected ()
    extends typingsJapgolly.cassandraDriver.libTypesMod.types.Integer {
    def this(bits: js.Array[Double], sign: Double) = this()
  }
  object Integer {
    
    @JSImport("cassandra-driver", "types.Integer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.ONE")
    @js.native
    def ONE: typingsJapgolly.cassandraDriver.libTypesMod.types.Integer = js.native
    inline def ONE_=(x: typingsJapgolly.cassandraDriver.libTypesMod.types.Integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.ZERO")
    @js.native
    def ZERO: typingsJapgolly.cassandraDriver.libTypesMod.types.Integer = js.native
    inline def ZERO_=(x: typingsJapgolly.cassandraDriver.libTypesMod.types.Integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def fromBits(bits: js.Array[Double]): typingsJapgolly.cassandraDriver.libTypesMod.types.Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Integer]
    
    /* static member */
    inline def fromBuffer(bits: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Integer]
    
    /* static member */
    inline def fromInt(value: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Integer]
    
    /* static member */
    inline def fromNumber(value: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Integer]
    
    /* static member */
    inline def fromString(str: String): typingsJapgolly.cassandraDriver.libTypesMod.types.Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Integer]
    inline def fromString(str: String, opt_radix: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.Integer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], opt_radix.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Integer]
    
    /* static member */
    inline def toBuffer(value: typingsJapgolly.cassandraDriver.libTypesMod.types.Integer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  @JSImport("cassandra-driver", "types.LocalDate")
  @js.native
  open class LocalDate protected ()
    extends typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate {
    def this(year: Double, month: Double, day: Double) = this()
  }
  object LocalDate {
    
    @JSImport("cassandra-driver", "types.LocalDate")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buffer: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate]
    
    /* static member */
    inline def fromDate(date: js.Date): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate]
    
    /* static member */
    inline def fromString(value: String): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate]
    
    /* static member */
    inline def now(): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate]
    
    /* static member */
    inline def utcNow(): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("utcNow")().asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalDate]
  }
  
  @JSImport("cassandra-driver", "types.LocalTime")
  @js.native
  open class LocalTime protected ()
    extends typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime {
    def this(totalNanoseconds: typingsJapgolly.cassandraDriver.libTypesMod.types.Long) = this()
  }
  object LocalTime {
    
    @JSImport("cassandra-driver", "types.LocalTime")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(value: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime]
    
    /* static member */
    inline def fromDate(date: js.Date, nanoseconds: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], nanoseconds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime]
    
    /* static member */
    inline def fromMilliseconds(milliseconds: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMilliseconds")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime]
    inline def fromMilliseconds(milliseconds: Double, nanoseconds: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMilliseconds")(milliseconds.asInstanceOf[js.Any], nanoseconds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime]
    
    /* static member */
    inline def fromString(value: String): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime]
    
    /* static member */
    inline def now(): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime]
    inline def now(nanoseconds: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(nanoseconds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.LocalTime]
  }
  
  @JSImport("cassandra-driver", "types.Long")
  @js.native
  open class Long protected ()
    extends typingsJapgolly.cassandraDriver.libTypesMod.types.Long {
    /**
      * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
      */
    def this(low: Double) = this()
    def this(low: Double, high: Double) = this()
    def this(low: Double, high: Double, unsigned: Boolean) = this()
    def this(low: Double, high: Unit, unsigned: Boolean) = this()
  }
  
  @JSImport("cassandra-driver", "types.TimeUuid")
  @js.native
  open class TimeUuid protected ()
    extends typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid {
    def this(buffer: Buffer) = this()
  }
  object TimeUuid {
    
    @JSImport("cassandra-driver", "types.TimeUuid")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromDate(date: js.Date): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Double, nodeId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    /* static member */
    inline def fromDate(
      date: js.Date,
      ticks: Double,
      nodeId: String,
      clockId: String,
      callback: ValueCallback[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(
      date: js.Date,
      ticks: Double,
      nodeId: String,
      clockId: Buffer,
      callback: ValueCallback[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fromDate(date: js.Date, ticks: Double, nodeId: Unit, clockId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Double, nodeId: Unit, clockId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Double, nodeId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(
      date: js.Date,
      ticks: Double,
      nodeId: Buffer,
      clockId: String,
      callback: ValueCallback[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(
      date: js.Date,
      ticks: Double,
      nodeId: Buffer,
      clockId: Buffer,
      callback: ValueCallback[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fromDate(date: js.Date, ticks: Unit, nodeId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Unit, nodeId: String, clockId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Unit, nodeId: String, clockId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Unit, nodeId: Unit, clockId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Unit, nodeId: Unit, clockId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Unit, nodeId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Unit, nodeId: Buffer, clockId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def fromDate(date: js.Date, ticks: Unit, nodeId: Buffer, clockId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    
    /* static member */
    inline def fromString(value: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    
    /* static member */
    inline def max(date: js.Date, ticks: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    
    /* static member */
    inline def min(date: js.Date, ticks: Double): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    
    /* static member */
    inline def now(): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    /* static member */
    inline def now(callback: ValueCallback[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /* static member */
    inline def now(nodeId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def now(nodeId: String, clockId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    /* static member */
    inline def now(
      nodeId: String,
      clockId: String,
      callback: ValueCallback[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def now(nodeId: String, clockId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def now(
      nodeId: String,
      clockId: Buffer,
      callback: ValueCallback[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def now(nodeId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def now(nodeId: Buffer, clockId: String): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def now(
      nodeId: Buffer,
      clockId: String,
      callback: ValueCallback[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def now(nodeId: Buffer, clockId: Buffer): typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    inline def now(
      nodeId: Buffer,
      clockId: Buffer,
      callback: ValueCallback[typingsJapgolly.cassandraDriver.libTypesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("cassandra-driver", "types.Tuple")
  @js.native
  open class Tuple protected ()
    extends typingsJapgolly.cassandraDriver.libTypesMod.types.Tuple {
    def this(args: Any*) = this()
  }
  object Tuple {
    
    @JSImport("cassandra-driver", "types.Tuple")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromArray(elements: js.Array[Any]): typingsJapgolly.cassandraDriver.libTypesMod.types.Tuple = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(elements.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Tuple]
  }
  
  @JSImport("cassandra-driver", "types.Uuid")
  @js.native
  open class Uuid protected ()
    extends typingsJapgolly.cassandraDriver.libTypesMod.types.Uuid {
    def this(buffer: Buffer) = this()
  }
  object Uuid {
    
    @JSImport("cassandra-driver", "types.Uuid")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromString(value: String): typingsJapgolly.cassandraDriver.libTypesMod.types.Uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Uuid]
    
    /* static member */
    inline def random(): typingsJapgolly.cassandraDriver.libTypesMod.types.Uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typingsJapgolly.cassandraDriver.libTypesMod.types.Uuid]
    /* static member */
    inline def random(callback: ValueCallback[typingsJapgolly.cassandraDriver.libTypesMod.types.Uuid]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("cassandra-driver", "types.consistencies")
  @js.native
  object consistencies extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies & Double] = js.native
    
    /* 0x05 */ val all: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.all & Double = js.native
    
    /* 0x00 */ val any: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.any & Double = js.native
    
    /* 0x07 */ val eachQuorum: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.eachQuorum & Double = js.native
    
    /* 0x0a */ val localOne: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.localOne & Double = js.native
    
    /* 0x06 */ val localQuorum: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.localQuorum & Double = js.native
    
    /* 0x09 */ val localSerial: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.localSerial & Double = js.native
    
    /* 0x01 */ val one: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.one & Double = js.native
    
    /* 0x04 */ val quorum: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.quorum & Double = js.native
    
    /* 0x08 */ val serial: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.serial & Double = js.native
    
    /* 0x03 */ val three: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.three & Double = js.native
    
    /* 0x02 */ val two: typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies.two & Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.dataTypes")
  @js.native
  object dataTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes & Double] = js.native
    
    /* 0x0001 */ val ascii: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.ascii & Double = js.native
    
    /* 0x0002 */ val bigint: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.bigint & Double = js.native
    
    /* 0x0003 */ val blob: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.blob & Double = js.native
    
    /* 0x0004 */ val boolean: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.boolean & Double = js.native
    
    /* 0x0005 */ val counter: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.counter & Double = js.native
    
    /* 0x0000 */ val custom: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.custom & Double = js.native
    
    /* 0x0011 */ val date: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.date & Double = js.native
    
    /* 0x0006 */ val decimal: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.decimal & Double = js.native
    
    /* 0x0007 */ val double: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.double & Double = js.native
    
    /* 0x0015 */ val duration: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.duration & Double = js.native
    
    /* 0x0008 */ val float: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.float & Double = js.native
    
    /* 0x0010 */ val inet: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.inet & Double = js.native
    
    /* 0x0009 */ val int: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.int & Double = js.native
    
    /* 0x0020 */ val list: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.list & Double = js.native
    
    /* 0x0021 */ val map: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.map & Double = js.native
    
    /* 0x0022 */ val set: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.set & Double = js.native
    
    /* 0x0013 */ val smallint: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.smallint & Double = js.native
    
    /* 0x000a */ val text: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.text & Double = js.native
    
    /* 0x0012 */ val time: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.time & Double = js.native
    
    /* 0x000b */ val timestamp: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.timestamp & Double = js.native
    
    /* 0x000f */ val timeuuid: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.timeuuid & Double = js.native
    
    /* 0x0014 */ val tinyint: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.tinyint & Double = js.native
    
    /* 0x0031 */ val tuple: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.tuple & Double = js.native
    
    /* 0x0030 */ val udt: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.udt & Double = js.native
    
    /* 0x000c */ val uuid: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.uuid & Double = js.native
    
    /* 0x000d */ val varchar: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.varchar & Double = js.native
    
    /* 0x000e */ val varint: typingsJapgolly.cassandraDriver.libTypesMod.types.dataTypes.varint & Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.distance")
  @js.native
  object distance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.cassandraDriver.libTypesMod.types.distance & Double] = js.native
    
    /* 1 */ val ignored: typingsJapgolly.cassandraDriver.libTypesMod.types.distance.ignored & Double = js.native
    
    /* 0 */ val local: typingsJapgolly.cassandraDriver.libTypesMod.types.distance.local & Double = js.native
    
    /* 0 */ val remote: typingsJapgolly.cassandraDriver.libTypesMod.types.distance.remote & Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.protocolVersion")
  @js.native
  object protocolVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion & Double] = js.native
    
    /* 0x41 */ val dseV1: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion.dseV1 & Double = js.native
    
    /* 0x42 */ val dseV2: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion.dseV2 & Double = js.native
    
    def isSupported(version: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion): Boolean = js.native
    
    /* 0x42 */ val maxSupported: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion.maxSupported & Double = js.native
    
    /* 0x01 */ val minSupported: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion.minSupported & Double = js.native
    
    /* 0x01 */ val v1: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion.v1 & Double = js.native
    
    /* 0x02 */ val v2: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion.v2 & Double = js.native
    
    /* 0x03 */ val v3: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion.v3 & Double = js.native
    
    /* 0x04 */ val v4: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion.v4 & Double = js.native
    
    /* 0x05 */ val v5: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion.v5 & Double = js.native
    
    /* 0x06 */ val v6: typingsJapgolly.cassandraDriver.libTypesMod.types.protocolVersion.v6 & Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.responseErrorCodes")
  @js.native
  object responseErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes & Double] = js.native
    
    /* 0x2400 */ val alreadyExists: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.alreadyExists & Double = js.native
    
    /* 0x0100 */ val badCredentials: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.badCredentials & Double = js.native
    
    /* 0x8000 */ val clientWriteFailure: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.clientWriteFailure & Double = js.native
    
    /* 0x2300 */ val configError: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.configError & Double = js.native
    
    /* 0x1400 */ val functionFailure: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.functionFailure & Double = js.native
    
    /* 0x2200 */ val invalid: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.invalid & Double = js.native
    
    /* 0x1002 */ val isBootstrapping: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.isBootstrapping & Double = js.native
    
    /* 0x1001 */ val overloaded: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.overloaded & Double = js.native
    
    /* 0x000A */ val protocolError: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.protocolError & Double = js.native
    
    /* 0x1300 */ val readFailure: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.readFailure & Double = js.native
    
    /* 0x1200 */ val readTimeout: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.readTimeout & Double = js.native
    
    /* 0x0000 */ val serverError: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.serverError & Double = js.native
    
    /* 0x2000 */ val syntaxError: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.syntaxError & Double = js.native
    
    /* 0x1003 */ val truncateError: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.truncateError & Double = js.native
    
    /* 0x2100 */ val unauthorized: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.unauthorized & Double = js.native
    
    /* 0x1000 */ val unavailableException: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.unavailableException & Double = js.native
    
    /* 0x2500 */ val unprepared: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.unprepared & Double = js.native
    
    /* 0x1500 */ val writeFailure: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.writeFailure & Double = js.native
    
    /* 0x1100 */ val writeTimeout: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.writeTimeout & Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.unset")
  @js.native
  val unset: js.Object = js.native
}
