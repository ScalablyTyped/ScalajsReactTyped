package typingsJapgolly.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webidl2.mod.ConstantMemberType
  - typingsJapgolly.webidl2.mod.OperationMemberType
*/
trait IDLCallbackInterfaceMemberType extends StObject
object IDLCallbackInterfaceMemberType {
  
  inline def ConstantMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    nullable: Boolean,
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType,
    value: ValueDescription
  ): typingsJapgolly.webidl2.mod.ConstantMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("const")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.ConstantMemberType]
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
