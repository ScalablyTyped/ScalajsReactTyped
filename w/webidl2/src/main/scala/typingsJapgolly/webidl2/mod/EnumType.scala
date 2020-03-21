package typingsJapgolly.webidl2.mod

import typingsJapgolly.webidl2.AnonType
import typingsJapgolly.webidl2.webidl2Strings.enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** The enum's name. */
  var name: String
  var `type`: enum
  /** An array of values (strings). */
  var values: js.Array[AnonType]
}

object EnumType {
  @scala.inline
  def apply(extAttrs: js.Array[ExtendedAttribute], name: String, `type`: enum, values: js.Array[AnonType]): EnumType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumType]
  }
}

