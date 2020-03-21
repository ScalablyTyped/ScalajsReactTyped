package typingsJapgolly.mongodb.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Binary")
@js.native
class Binary protected ()
  extends typingsJapgolly.bson.mod.Binary {
  /**
    * @param buffer A buffer object containing the binary data
    * @param subType Binary data subtype
    */
  def this(buffer: Buffer) = this()
  def this(buffer: Buffer, subType: scala.Double) = this()
}

/* static members */
@JSImport("mongodb", "Binary")
@js.native
object Binary extends js.Object {
  val SUBTYPE_BYTE_ARRAY: scala.Double = js.native
  val SUBTYPE_DEFAULT: scala.Double = js.native
  val SUBTYPE_FUNCTION: scala.Double = js.native
  val SUBTYPE_MD5: scala.Double = js.native
  val SUBTYPE_USER_DEFINED: scala.Double = js.native
  val SUBTYPE_UUID: scala.Double = js.native
  val SUBTYPE_UUID_OLD: scala.Double = js.native
}

