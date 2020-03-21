package typingsJapgolly.cassandraDriver.mod.types

import typingsJapgolly.cassandraDriver.mod.ValueCallback
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Uuid")
@js.native
class Uuid protected ()
  extends typingsJapgolly.cassandraDriver.typesMod.types.Uuid {
  def this(buffer: Buffer) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Uuid")
@js.native
object Uuid extends js.Object {
  def fromString(value: String): typingsJapgolly.cassandraDriver.typesMod.types.Uuid = js.native
  def random(): typingsJapgolly.cassandraDriver.typesMod.types.Uuid = js.native
  def random(callback: ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.Uuid]): Unit = js.native
}

