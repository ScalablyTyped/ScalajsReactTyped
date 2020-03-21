package typingsJapgolly.webidl2.mod

import typingsJapgolly.webidl2.webidl2Strings.attribute
import typingsJapgolly.webidl2.webidl2Strings.deleter
import typingsJapgolly.webidl2.webidl2Strings.getter
import typingsJapgolly.webidl2.webidl2Strings.operation
import typingsJapgolly.webidl2.webidl2Strings.setter
import typingsJapgolly.webidl2.webidl2Strings.static
import typingsJapgolly.webidl2.webidl2Strings.stringifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webidl2.mod.OperationMemberType
  - typingsJapgolly.webidl2.mod.AttributeMemberType
*/
trait IDLNamespaceMemberType extends js.Object

object IDLNamespaceMemberType {
  @scala.inline
  def OperationMemberType(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    special: getter | setter | deleter | static | stringifier,
    `type`: operation,
    idlType: IDLTypeDescription = null,
    name: String = null
  ): IDLNamespaceMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (idlType != null) __obj.updateDynamic("idlType")(idlType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLNamespaceMemberType]
  }
  @scala.inline
  def AttributeMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    readonly: Boolean,
    special: static | stringifier,
    `type`: attribute
  ): IDLNamespaceMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLNamespaceMemberType]
  }
}

