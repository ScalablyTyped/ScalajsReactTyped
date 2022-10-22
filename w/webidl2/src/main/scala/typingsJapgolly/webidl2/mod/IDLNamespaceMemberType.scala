package typingsJapgolly.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webidl2.mod.AttributeMemberType
  - typingsJapgolly.webidl2.mod.OperationMemberType
*/
trait IDLNamespaceMemberType extends StObject
object IDLNamespaceMemberType {
  
  inline def AttributeMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    parent: InterfaceMixinType | InterfaceType | NamespaceType,
    readonly: Boolean
  ): typingsJapgolly.webidl2.mod.AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], special = null)
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.AttributeMemberType]
  }
  
  inline def OperationMemberType(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType
  ): typingsJapgolly.webidl2.mod.OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], idlType = null, name = null, special = null)
    __obj.updateDynamic("type")("operation")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.OperationMemberType]
  }
}
