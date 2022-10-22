package typingsJapgolly.webidl2.mod

import typingsJapgolly.webidl2.webidl2Strings.ObservableArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservableArrayTypeDescription
  extends StObject
     with AbstractGenericTypeDescription
     with GenericTypeDescription {
  
  @JSName("generic")
  var generic_ObservableArrayTypeDescription: ObservableArray
}
object ObservableArrayTypeDescription {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): ObservableArrayTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = "ObservableArray", idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[ObservableArrayTypeDescription]
  }
  
  extension [Self <: ObservableArrayTypeDescription](x: Self) {
    
    inline def setGeneric(value: ObservableArray): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
  }
}
