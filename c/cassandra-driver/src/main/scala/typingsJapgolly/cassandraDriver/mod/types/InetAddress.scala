package typingsJapgolly.cassandraDriver.mod.types

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.InetAddress")
@js.native
class InetAddress protected ()
  extends typingsJapgolly.cassandraDriver.typesMod.types.InetAddress {
  def this(buffer: Buffer) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.InetAddress")
@js.native
object InetAddress extends js.Object {
  def fromString(value: String): typingsJapgolly.cassandraDriver.typesMod.types.InetAddress = js.native
}

