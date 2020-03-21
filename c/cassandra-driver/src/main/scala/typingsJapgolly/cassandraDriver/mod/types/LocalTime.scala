package typingsJapgolly.cassandraDriver.mod.types

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.LocalTime")
@js.native
class LocalTime protected ()
  extends typingsJapgolly.cassandraDriver.typesMod.types.LocalTime {
  def this(totalNanoseconds: typingsJapgolly.cassandraDriver.typesMod.types.Long) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.LocalTime")
@js.native
object LocalTime extends js.Object {
  def fromBuffer(value: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.LocalTime = js.native
  def fromDate(date: js.Date, nanoseconds: Double): typingsJapgolly.cassandraDriver.typesMod.types.LocalTime = js.native
  def fromMilliseconds(milliseconds: Double): typingsJapgolly.cassandraDriver.typesMod.types.LocalTime = js.native
  def fromMilliseconds(milliseconds: Double, nanoseconds: Double): typingsJapgolly.cassandraDriver.typesMod.types.LocalTime = js.native
  def fromString(value: String): typingsJapgolly.cassandraDriver.typesMod.types.LocalTime = js.native
  def now(): typingsJapgolly.cassandraDriver.typesMod.types.LocalTime = js.native
  def now(nanoseconds: Double): typingsJapgolly.cassandraDriver.typesMod.types.LocalTime = js.native
}

