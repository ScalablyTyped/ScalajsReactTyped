package typingsJapgolly.cassandraDriver.mod.types

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Duration")
@js.native
class Duration protected ()
  extends typingsJapgolly.cassandraDriver.typesMod.types.Duration {
  def this(month: Double, days: Double, nanoseconds: Double) = this()
  def this(month: Double, days: Double, nanoseconds: typingsJapgolly.cassandraDriver.typesMod.types.Long) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Duration")
@js.native
object Duration extends js.Object {
  def fromBuffer(buffer: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.Duration = js.native
  def fromString(input: String): typingsJapgolly.cassandraDriver.typesMod.types.Duration = js.native
}

