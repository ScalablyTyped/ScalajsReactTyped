package typingsJapgolly.cassandraDriver.mod.types

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.LocalDate")
@js.native
class LocalDate protected ()
  extends typingsJapgolly.cassandraDriver.typesMod.types.LocalDate {
  def this(year: Double, month: Double, day: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.LocalDate")
@js.native
object LocalDate extends js.Object {
  def fromBuffer(buffer: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.LocalDate = js.native
  def fromDate(date: js.Date): typingsJapgolly.cassandraDriver.typesMod.types.LocalDate = js.native
  def fromString(value: String): typingsJapgolly.cassandraDriver.typesMod.types.LocalDate = js.native
  def now(): typingsJapgolly.cassandraDriver.typesMod.types.LocalDate = js.native
  def utcNow(): typingsJapgolly.cassandraDriver.typesMod.types.LocalDate = js.native
}

