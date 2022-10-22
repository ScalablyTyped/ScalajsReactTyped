package typingsJapgolly.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webidl2.mod.IterableDeclarationMemberType
  - typingsJapgolly.webidl2.mod.MaplikeDeclarationMemberType
  - typingsJapgolly.webidl2.mod.SetlikeDeclarationMemberType
*/
trait DeclarationMemberType
  extends StObject
     with IDLInterfaceMemberType
object DeclarationMemberType {
  
  inline def IterableDeclarationMemberType(
    arguments: js.Array[Argument],
    async: Boolean,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription] | (js.Tuple2[IDLTypeDescription, IDLTypeDescription]),
    parent: InterfaceMixinType | InterfaceType
  ): typingsJapgolly.webidl2.mod.IterableDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = false)
    __obj.updateDynamic("type")("iterable")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.IterableDeclarationMemberType]
  }
  
  inline def MaplikeDeclarationMemberType(
    arguments: js.Array[Any],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean
  ): typingsJapgolly.webidl2.mod.MaplikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = false, extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("maplike")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.MaplikeDeclarationMemberType]
  }
  
  inline def SetlikeDeclarationMemberType(
    arguments: js.Array[Any],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean
  ): typingsJapgolly.webidl2.mod.SetlikeDeclarationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = false, extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setlike")
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.SetlikeDeclarationMemberType]
  }
}
