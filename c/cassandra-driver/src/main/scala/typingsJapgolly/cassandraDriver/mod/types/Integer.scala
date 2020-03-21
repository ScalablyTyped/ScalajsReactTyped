package typingsJapgolly.cassandraDriver.mod.types

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.Integer")
@js.native
class Integer protected ()
  extends typingsJapgolly.cassandraDriver.typesMod.types.Integer {
  def this(bits: js.Array[Double], sign: Double) = this()
}

/* static members */
@JSImport("cassandra-driver", "types.Integer")
@js.native
object Integer extends js.Object {
  var ONE: typingsJapgolly.cassandraDriver.typesMod.types.Integer = js.native
  var ZERO: typingsJapgolly.cassandraDriver.typesMod.types.Integer = js.native
  def fromBits(bits: js.Array[Double]): typingsJapgolly.cassandraDriver.typesMod.types.Integer = js.native
  def fromBuffer(bits: Buffer): typingsJapgolly.cassandraDriver.typesMod.types.Integer = js.native
  def fromInt(value: Double): typingsJapgolly.cassandraDriver.typesMod.types.Integer = js.native
  def fromNumber(value: Double): typingsJapgolly.cassandraDriver.typesMod.types.Integer = js.native
  def fromString(str: String): typingsJapgolly.cassandraDriver.typesMod.types.Integer = js.native
  def fromString(str: String, opt_radix: Double): typingsJapgolly.cassandraDriver.typesMod.types.Integer = js.native
  def toBuffer(value: typingsJapgolly.cassandraDriver.typesMod.types.Integer): Buffer = js.native
}

