package typingsJapgolly.mongodb.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Decimal128")
@js.native
class Decimal128 protected ()
  extends typingsJapgolly.bson.mod.Decimal128 {
  /**
    * @param bytes A buffer containing the raw Decimal128 bytes.
    */
  def this(bytes: Buffer) = this()
}

/* static members */
@JSImport("mongodb", "Decimal128")
@js.native
object Decimal128 extends js.Object {
  /** Create a Decimal128 instance from a string representation. */
  def fromString(s: String): typingsJapgolly.bson.mod.Decimal128 = js.native
}

