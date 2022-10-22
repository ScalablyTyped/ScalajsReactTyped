package typingsJapgolly.cassandraDriver.libTypesMod.types

import typingsJapgolly.cassandraDriver.anon.Date
import typingsJapgolly.cassandraDriver.mod.ValueCallback
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.TimeUuid")
@js.native
open class TimeUuid protected () extends Uuid {
  def this(buffer: Buffer) = this()
  
  def getDate(): js.Date = js.native
  
  def getDatePrecision(): Date = js.native
}
object TimeUuid {
  
  @JSImport("cassandra-driver/lib/types", "types.TimeUuid")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromDate(date: js.Date): TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Double): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: String): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: String): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  /* static member */
  inline def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: String, callback: ValueCallback[TimeUuid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: Buffer): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: Unit, clockId: String): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: Unit, clockId: Buffer): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: Buffer): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: String): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: String, callback: ValueCallback[TimeUuid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: Buffer): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fromDate(date: js.Date, ticks: Unit, nodeId: String): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Unit, nodeId: String, clockId: String): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Unit, nodeId: String, clockId: Buffer): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Unit, nodeId: Unit, clockId: String): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Unit, nodeId: Unit, clockId: Buffer): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Unit, nodeId: Buffer): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Unit, nodeId: Buffer, clockId: String): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def fromDate(date: js.Date, ticks: Unit, nodeId: Buffer, clockId: Buffer): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  
  /* static member */
  inline def fromString(value: String): TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[TimeUuid]
  
  /* static member */
  inline def max(date: js.Date, ticks: Double): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  
  /* static member */
  inline def min(date: js.Date, ticks: Double): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  
  /* static member */
  inline def now(): TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[TimeUuid]
  /* static member */
  inline def now(callback: ValueCallback[TimeUuid]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /* static member */
  inline def now(nodeId: String): TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any]).asInstanceOf[TimeUuid]
  inline def now(nodeId: String, clockId: String): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  /* static member */
  inline def now(nodeId: String, clockId: String, callback: ValueCallback[TimeUuid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def now(nodeId: String, clockId: Buffer): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def now(nodeId: String, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def now(nodeId: Buffer): TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any]).asInstanceOf[TimeUuid]
  inline def now(nodeId: Buffer, clockId: String): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def now(nodeId: Buffer, clockId: String, callback: ValueCallback[TimeUuid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def now(nodeId: Buffer, clockId: Buffer): TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[TimeUuid]
  inline def now(nodeId: Buffer, clockId: Buffer, callback: ValueCallback[TimeUuid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
