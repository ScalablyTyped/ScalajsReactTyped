package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.AnyTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.ArrayTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.BooleanTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.BooleanLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.NullLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.ExistsTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.FunctionTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.GenericTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.InterfaceTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.IntersectionTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.MixedTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.EmptyTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.NullableTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.NumberLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.NumberTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.ObjectTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.StringLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.StringTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.SymbolTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.ThisTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.TupleTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.TypeofTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.UnionTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.VoidTypeAnnotation_
  - typingsJapgolly.babelTypes.libMod.IndexedAccessType_
  - typingsJapgolly.babelTypes.libMod.OptionalIndexedAccessType_
*/
trait FlowType extends StObject
object FlowType {
  
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
  
  inline def EmptyTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.EmptyTypeAnnotation_]
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
  
  inline def OptionalIndexedAccessType_(indexType: FlowType, objectType: FlowType, optional: Boolean): typingsJapgolly.babelTypes.libMod.OptionalIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalIndexedAccessType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.OptionalIndexedAccessType_]
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
  
  inline def VoidTypeAnnotation_(): typingsJapgolly.babelTypes.libMod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.VoidTypeAnnotation_]
  }
}
