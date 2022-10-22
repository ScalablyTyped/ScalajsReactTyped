package typingsJapgolly.webidl2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webidl2.mod.FrozenArrayTypeDescription
  - typingsJapgolly.webidl2.mod.ObservableArrayTypeDescription
  - typingsJapgolly.webidl2.mod.PromiseTypeDescription
  - typingsJapgolly.webidl2.mod.RecordTypeDescription
  - typingsJapgolly.webidl2.mod.SequenceTypeDescription
*/
trait GenericTypeDescription
  extends StObject
     with IDLTypeDescription
object GenericTypeDescription {
  
  inline def FrozenArrayTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): typingsJapgolly.webidl2.mod.FrozenArrayTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = "FrozenArray", idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.FrozenArrayTypeDescription]
  }
  
  inline def ObservableArrayTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): typingsJapgolly.webidl2.mod.ObservableArrayTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = "ObservableArray", idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.ObservableArrayTypeDescription]
  }
  
  inline def PromiseTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): typingsJapgolly.webidl2.mod.PromiseTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = "Promise", idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.PromiseTypeDescription]
  }
  
  inline def RecordTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Tuple2[IDLTypeDescription, IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): typingsJapgolly.webidl2.mod.RecordTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = "record", idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.RecordTypeDescription]
  }
  
  inline def SequenceTypeDescription(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    nullable: Boolean,
    parent: Argument | AttributeMemberType | CallbackType | ConstantMemberType | DeclarationMemberType | FieldType | OperationMemberType | TypedefType | UnionTypeDescription
  ): typingsJapgolly.webidl2.mod.SequenceTypeDescription = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], generic = "sequence", idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], union = false)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[typingsJapgolly.webidl2.mod.SequenceTypeDescription]
  }
}
