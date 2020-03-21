package typingsJapgolly.cassandraDriver.mod.types

import typingsJapgolly.cassandraDriver.mod.ValueCallback
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.TimeUuid")
@js.native
class TimeUuid ()
  extends typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid

/* static members */
@JSImport("cassandra-driver", "types.TimeUuid")
@js.native
object TimeUuid extends js.Object {
  def fromDate(date: js.Date): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: String): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: js.Date,
    ticks: Double,
    nodeId: String,
    clockId: String,
    callback: ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: String, clockId: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: js.Date,
    ticks: Double,
    nodeId: String,
    clockId: Buffer,
    callback: ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: String): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: js.Date,
    ticks: Double,
    nodeId: Buffer,
    clockId: String,
    callback: ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromDate(date: js.Date, ticks: Double, nodeId: Buffer, clockId: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def fromDate(
    date: js.Date,
    ticks: Double,
    nodeId: Buffer,
    clockId: Buffer,
    callback: ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def fromString(value: String): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def max(date: js.Date, ticks: Double): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def min(date: js.Date, ticks: Double): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(callback: ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid]): Unit = js.native
  def now(nodeId: String): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(nodeId: String, clockId: String): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: String,
    clockId: String,
    callback: ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: String, clockId: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: String,
    clockId: Buffer,
    callback: ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(nodeId: Buffer, clockId: String): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: Buffer,
    clockId: String,
    callback: ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
  def now(nodeId: Buffer, clockId: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid = js.native
  def now(
    nodeId: Buffer,
    clockId: Buffer,
    callback: ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.TimeUuid]
  ): Unit = js.native
}

