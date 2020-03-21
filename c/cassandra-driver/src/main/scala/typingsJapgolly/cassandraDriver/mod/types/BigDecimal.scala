package typingsJapgolly.cassandraDriver.mod.types

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.BigDecimal")
@js.native
class BigDecimal protected ()
  extends typingsJapgolly.cassandraDriver.typesMod.types.BigDecimal {
  def this(unscaledValue: Double, scale: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.BigDecimal")
@js.native
object BigDecimal extends js.Object {
  def fromBuffer(buf: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.BigDecimal = js.native
  def fromNumber(value: Double): typingsJapgolly.cassandraDriver.typesMod.types.BigDecimal = js.native
  def fromString(value: String): typingsJapgolly.cassandraDriver.typesMod.types.BigDecimal = js.native
  def toBuffer(value: typingsJapgolly.cassandraDriver.typesMod.types.BigDecimal): Buffer = js.native
}

