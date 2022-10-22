package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.get
import typingsJapgolly.babelTypes.babelTypesStrings.init
import typingsJapgolly.babelTypes.babelTypesStrings.minus
import typingsJapgolly.babelTypes.babelTypesStrings.plus
import typingsJapgolly.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.AnyTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.ArrayTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.BooleanTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.BooleanLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.NullLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.ClassImplements_
  - typingsJapgolly.babelTypes.libMod.DeclareClass_
  - typingsJapgolly.babelTypes.libMod.DeclareFunction_
  - typingsJapgolly.babelTypes.libMod.DeclareInterface_
  - typingsJapgolly.babelTypes.libMod.DeclareModule_
  - typingsJapgolly.babelTypes.libMod.DeclareModuleExports_
  - typingsJapgolly.babelTypes.libMod.DeclareTypeAlias_
  - typingsJapgolly.babelTypes.libMod.DeclareOpaqueType_
  - typingsJapgolly.babelTypes.libMod.DeclareVariable_
  - typingsJapgolly.babelTypes.libMod.DeclareExportDeclaration_
  - typingsJapgolly.babelTypes.libMod.DeclareExportAllDeclaration_
  - typingsJapgolly.babelTypes.libMod.DeclaredPredicate_
  - typingsJapgolly.babelTypes.libMod.ExistsTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.FunctionTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.FunctionTypeParam_
  - typingsJapgolly.babelTypes.libMod.GenericTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.InferredPredicate_
  - typingsJapgolly.babelTypes.libMod.InterfaceExtends_
  - typingsJapgolly.babelTypes.libMod.InterfaceDeclaration_
  - typingsJapgolly.babelTypes.libMod.InterfaceTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.IntersectionTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.MixedTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.EmptyTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.NullableTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.NumberLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.NumberTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.ObjectTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.ObjectTypeInternalSlot_
  - typingsJapgolly.babelTypes.libMod.ObjectTypeCallProperty_
  - typingsJapgolly.babelTypes.libMod.ObjectTypeIndexer_
  - typingsJapgolly.babelTypes.libMod.ObjectTypeProperty_
  - typingsJapgolly.babelTypes.libMod.ObjectTypeSpreadProperty_
  - typingsJapgolly.babelTypes.libMod.OpaqueType_
  - typingsJapgolly.babelTypes.libMod.QualifiedTypeIdentifier_
  - typingsJapgolly.babelTypes.libMod.StringLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.StringTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.SymbolTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.ThisTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.TupleTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.TypeofTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.TypeAlias_
  - typingsJapgolly.babelTypes.libMod.TypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.TypeCastExpression_
  - typingsJapgolly.babelTypes.libMod.TypeParameter_
  - typingsJapgolly.babelTypes.libMod.TypeParameterDeclaration_
  - typingsJapgolly.babelTypes.libMod.TypeParameterInstantiation_
  - typingsJapgolly.babelTypes.libMod.UnionTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.Variance_
  - typingsJapgolly.babelTypes.libMod.VoidTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.EnumDeclaration_
  - typingsJapgolly.babelTypes.libMod.EnumBooleanBody_
  - typingsJapgolly.babelTypes.libMod.EnumNumberBody_
  - typingsJapgolly.babelTypes.libMod.EnumStringBody_
  - typingsJapgolly.babelTypes.libMod.EnumSymbolBody_
  - typingsJapgolly.babelTypes.libMod.EnumBooleanMember_
  - typingsJapgolly.babelTypes.libMod.EnumNumberMember_
  - typingsJapgolly.babelTypes.libMod.EnumStringMember_
  - typingsJapgolly.babelTypes.libMod.EnumDefaultedMember_
  - typingsJapgolly.babelTypes.libMod.IndexedAccessType_
  - typingsJapgolly.babelTypes.libMod.OptionalIndexedAccessType_
*/
trait Flow extends StObject
object Flow {
  
  inline def AnyTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.AnyTypeAnnotation_]
  }
  
  inline def ArrayTypeAnnotation_(elementType: FlowType): typingsJapgolly.babelTypes.libMod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ArrayTypeAnnotation_]
  }
  
  inline def BooleanLiteralTypeAnnotation_(value: Boolean): typingsJapgolly.babelTypes.libMod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BooleanLiteralTypeAnnotation_]
  }
  
  inline def BooleanTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BooleanTypeAnnotation_]
  }
  
  inline def ClassImplements_(id: Identifier_): typingsJapgolly.babelTypes.libMod.ClassImplements_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassImplements")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassImplements_]
  }
  
  inline def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_): typingsJapgolly.babelTypes.libMod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareClass_]
  }
  
  inline def DeclareExportAllDeclaration_(source: StringLiteral_): typingsJapgolly.babelTypes.libMod.DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareExportAllDeclaration_]
  }
  
  inline def DeclareExportDeclaration_(): typingsJapgolly.babelTypes.libMod.DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareExportDeclaration_]
  }
  
  inline def DeclareFunction_(id: Identifier_): typingsJapgolly.babelTypes.libMod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareFunction_]
  }
  
  inline def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_): typingsJapgolly.babelTypes.libMod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareInterface_]
  }
  
  inline def DeclareModuleExports_(typeAnnotation: TypeAnnotation_): typingsJapgolly.babelTypes.libMod.DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareModuleExports_]
  }
  
  inline def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_): typingsJapgolly.babelTypes.libMod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareModule_]
  }
  
  inline def DeclareOpaqueType_(id: Identifier_): typingsJapgolly.babelTypes.libMod.DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareOpaqueType_]
  }
  
  inline def DeclareTypeAlias_(id: Identifier_, right: FlowType): typingsJapgolly.babelTypes.libMod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareTypeAlias_]
  }
  
  inline def DeclareVariable_(id: Identifier_): typingsJapgolly.babelTypes.libMod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclareVariable_]
  }
  
  inline def DeclaredPredicate_(value: Flow): typingsJapgolly.babelTypes.libMod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclaredPredicate")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclaredPredicate_]
  }
  
  inline def EmptyTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EmptyTypeAnnotation_]
  }
  
  inline def EnumBooleanBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumBooleanMember_]): typingsJapgolly.babelTypes.libMod.EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EnumBooleanBody_]
  }
  
  inline def EnumBooleanMember_(id: Identifier_, init: BooleanLiteral_): typingsJapgolly.babelTypes.libMod.EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumBooleanMember")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EnumBooleanMember_]
  }
  
  inline def EnumDeclaration_(body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_, id: Identifier_): typingsJapgolly.babelTypes.libMod.EnumDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EnumDeclaration_]
  }
  
  inline def EnumDefaultedMember_(id: Identifier_): typingsJapgolly.babelTypes.libMod.EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EnumDefaultedMember_]
  }
  
  inline def EnumNumberBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumNumberMember_]): typingsJapgolly.babelTypes.libMod.EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EnumNumberBody_]
  }
  
  inline def EnumNumberMember_(id: Identifier_, init: NumericLiteral_): typingsJapgolly.babelTypes.libMod.EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumNumberMember")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EnumNumberMember_]
  }
  
  inline def EnumStringBody_(
    explicitType: Boolean,
    hasUnknownMembers: Boolean,
    members: js.Array[EnumStringMember_ | EnumDefaultedMember_]
  ): typingsJapgolly.babelTypes.libMod.EnumStringBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EnumStringBody_]
  }
  
  inline def EnumStringMember_(id: Identifier_, init: StringLiteral_): typingsJapgolly.babelTypes.libMod.EnumStringMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumStringMember")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EnumStringMember_]
  }
  
  inline def EnumSymbolBody_(hasUnknownMembers: Boolean, members: js.Array[EnumDefaultedMember_]): typingsJapgolly.babelTypes.libMod.EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EnumSymbolBody_]
  }
  
  inline def ExistsTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExistsTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExistsTypeAnnotation_]
  }
  
  inline def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType): typingsJapgolly.babelTypes.libMod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.FunctionTypeAnnotation_]
  }
  
  inline def FunctionTypeParam_(typeAnnotation: FlowType): typingsJapgolly.babelTypes.libMod.FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.FunctionTypeParam_]
  }
  
  inline def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_): typingsJapgolly.babelTypes.libMod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.GenericTypeAnnotation_]
  }
  
  inline def IndexedAccessType_(indexType: FlowType, objectType: FlowType): typingsJapgolly.babelTypes.libMod.IndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexedAccessType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.IndexedAccessType_]
  }
  
  inline def InferredPredicate_(): typingsJapgolly.babelTypes.libMod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.InferredPredicate_]
  }
  
  inline def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_): typingsJapgolly.babelTypes.libMod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.InterfaceDeclaration_]
  }
  
  inline def InterfaceExtends_(id: Identifier_ | QualifiedTypeIdentifier_): typingsJapgolly.babelTypes.libMod.InterfaceExtends_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceExtends")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.InterfaceExtends_]
  }
  
  inline def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_): typingsJapgolly.babelTypes.libMod.InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.InterfaceTypeAnnotation_]
  }
  
  inline def IntersectionTypeAnnotation_(types: js.Array[FlowType]): typingsJapgolly.babelTypes.libMod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.IntersectionTypeAnnotation_]
  }
  
  inline def MixedTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.MixedTypeAnnotation_]
  }
  
  inline def NullLiteralTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.NullLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.NullLiteralTypeAnnotation_]
  }
  
  inline def NullableTypeAnnotation_(typeAnnotation: FlowType): typingsJapgolly.babelTypes.libMod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.NullableTypeAnnotation_]
  }
  
  inline def NumberLiteralTypeAnnotation_(value: Double): typingsJapgolly.babelTypes.libMod.NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.NumberLiteralTypeAnnotation_]
  }
  
  inline def NumberTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.NumberTypeAnnotation_]
  }
  
  inline def ObjectTypeAnnotation_(exact: Boolean, properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): typingsJapgolly.babelTypes.libMod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectTypeAnnotation_]
  }
  
  inline def ObjectTypeCallProperty_(static: Boolean, value: FlowType): typingsJapgolly.babelTypes.libMod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectTypeCallProperty_]
  }
  
  inline def ObjectTypeIndexer_(key: FlowType, static: Boolean, value: FlowType): typingsJapgolly.babelTypes.libMod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectTypeIndexer_]
  }
  
  inline def ObjectTypeInternalSlot_(id: Identifier_, method: Boolean, optional: Boolean, static: Boolean, value: FlowType): typingsJapgolly.babelTypes.libMod.ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeInternalSlot")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectTypeInternalSlot_]
  }
  
  inline def ObjectTypeProperty_(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    method: Boolean,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    value: FlowType
  ): typingsJapgolly.babelTypes.libMod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectTypeProperty_]
  }
  
  inline def ObjectTypeSpreadProperty_(argument: FlowType): typingsJapgolly.babelTypes.libMod.ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectTypeSpreadProperty_]
  }
  
  inline def OpaqueType_(id: Identifier_, impltype: FlowType): typingsJapgolly.babelTypes.libMod.OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.OpaqueType_]
  }
  
  inline def OptionalIndexedAccessType_(indexType: FlowType, objectType: FlowType, optional: Boolean): typingsJapgolly.babelTypes.libMod.OptionalIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalIndexedAccessType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.OptionalIndexedAccessType_]
  }
  
  inline def QualifiedTypeIdentifier_(
    id: Identifier_,
    qualification: Identifier_ | typingsJapgolly.babelTypes.libMod.QualifiedTypeIdentifier_
  ): typingsJapgolly.babelTypes.libMod.QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("QualifiedTypeIdentifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.QualifiedTypeIdentifier_]
  }
  
  inline def StringLiteralTypeAnnotation_(value: String): typingsJapgolly.babelTypes.libMod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.StringLiteralTypeAnnotation_]
  }
  
  inline def StringTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.StringTypeAnnotation_]
  }
  
  inline def SymbolTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.SymbolTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SymbolTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.SymbolTypeAnnotation_]
  }
  
  inline def ThisTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ThisTypeAnnotation_]
  }
  
  inline def TupleTypeAnnotation_(types: js.Array[FlowType]): typingsJapgolly.babelTypes.libMod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TupleTypeAnnotation_]
  }
  
  inline def TypeAlias_(id: Identifier_, right: FlowType): typingsJapgolly.babelTypes.libMod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TypeAlias_]
  }
  
  inline def TypeAnnotation_(typeAnnotation: FlowType): typingsJapgolly.babelTypes.libMod.TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TypeAnnotation_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typingsJapgolly.babelTypes.libMod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TypeCastExpression_]
  }
  
  inline def TypeParameterDeclaration_(params: js.Array[TypeParameter_]): typingsJapgolly.babelTypes.libMod.TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TypeParameterDeclaration_]
  }
  
  inline def TypeParameterInstantiation_(params: js.Array[FlowType]): typingsJapgolly.babelTypes.libMod.TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterInstantiation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TypeParameterInstantiation_]
  }
  
  inline def TypeParameter_(name: String): typingsJapgolly.babelTypes.libMod.TypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameter")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TypeParameter_]
  }
  
  inline def TypeofTypeAnnotation_(argument: FlowType): typingsJapgolly.babelTypes.libMod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TypeofTypeAnnotation_]
  }
  
  inline def UnionTypeAnnotation_(types: js.Array[FlowType]): typingsJapgolly.babelTypes.libMod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.UnionTypeAnnotation_]
  }
  
  inline def Variance_(kind: minus | plus): typingsJapgolly.babelTypes.libMod.Variance_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Variance")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.Variance_]
  }
  
  inline def VoidTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.VoidTypeAnnotation_]
  }
}
