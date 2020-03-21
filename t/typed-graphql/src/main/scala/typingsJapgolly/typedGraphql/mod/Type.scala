package typingsJapgolly.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type Reference
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typedGraphql.mod.NamedType
  - typingsJapgolly.typedGraphql.mod.ListType
  - typingsJapgolly.typedGraphql.mod.NonNullType
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def NamedType(kind: String, name: Name, loc: Location = null): Type = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def ListType(kind: String, `type`: Type, loc: Location = null): Type = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def NonNullType(kind: String, `type`: NamedType | ListType, loc: Location = null): Type = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

