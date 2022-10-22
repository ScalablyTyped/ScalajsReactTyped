package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.AnyTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.ArrayTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.BooleanTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.BooleanLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.NullLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.ExistsTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.FunctionTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.GenericTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.InterfaceTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.IntersectionTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.MixedTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.EmptyTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.NullableTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.NumberLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.NumberTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.ObjectTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.StringLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.StringTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.SymbolTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.ThisTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.TupleTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.TypeofTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.UnionTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.VoidTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.IndexedAccessType_
  - typingsJapgolly.babelTypes.mod.OptionalIndexedAccessType_
*/
trait FlowType
  extends StObject
     with _Node
object FlowType {
  
  inline def AnyTypeAnnotation_(): typingsJapgolly.babelTypes.mod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.AnyTypeAnnotation_]
  }
  
  inline def ArrayTypeAnnotation_(elementType: FlowType): typingsJapgolly.babelTypes.mod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ArrayTypeAnnotation_]
  }
  
  inline def BooleanLiteralTypeAnnotation_(value: Boolean): typingsJapgolly.babelTypes.mod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BooleanLiteralTypeAnnotation_]
  }
  
  inline def BooleanTypeAnnotation_(): typingsJapgolly.babelTypes.mod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BooleanTypeAnnotation_]
  }
  
  inline def EmptyTypeAnnotation_(): typingsJapgolly.babelTypes.mod.EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.EmptyTypeAnnotation_]
  }
  
  inline def ExistsTypeAnnotation_(): typingsJapgolly.babelTypes.mod.ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExistsTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExistsTypeAnnotation_]
  }
  
  inline def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType): typingsJapgolly.babelTypes.mod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, rest = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.updateDynamic("this")(null)
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.FunctionTypeAnnotation_]
  }
  
  inline def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_): typingsJapgolly.babelTypes.mod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.GenericTypeAnnotation_]
  }
  
  inline def IndexedAccessType_(indexType: FlowType, objectType: FlowType): typingsJapgolly.babelTypes.mod.IndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IndexedAccessType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.IndexedAccessType_]
  }
  
  inline def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_): typingsJapgolly.babelTypes.mod.InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.InterfaceTypeAnnotation_]
  }
  
  inline def IntersectionTypeAnnotation_(types: js.Array[FlowType]): typingsJapgolly.babelTypes.mod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.IntersectionTypeAnnotation_]
  }
  
  inline def MixedTypeAnnotation_(): typingsJapgolly.babelTypes.mod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.MixedTypeAnnotation_]
  }
  
  inline def NullLiteralTypeAnnotation_(): typingsJapgolly.babelTypes.mod.NullLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NullLiteralTypeAnnotation_]
  }
  
  inline def NullableTypeAnnotation_(typeAnnotation: FlowType): typingsJapgolly.babelTypes.mod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NullableTypeAnnotation_]
  }
  
  inline def NumberLiteralTypeAnnotation_(value: Double): typingsJapgolly.babelTypes.mod.NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NumberLiteralTypeAnnotation_]
  }
  
  inline def NumberTypeAnnotation_(): typingsJapgolly.babelTypes.mod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NumberTypeAnnotation_]
  }
  
  inline def ObjectTypeAnnotation_(
    callProperties: js.Array[ObjectTypeCallProperty_],
    exact: Boolean,
    indexers: js.Array[ObjectTypeIndexer_],
    internalSlots: js.Array[ObjectTypeInternalSlot_],
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]
  ): typingsJapgolly.babelTypes.mod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], internalSlots = internalSlots.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], end = null, inexact = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectTypeAnnotation_]
  }
  
  inline def OptionalIndexedAccessType_(indexType: FlowType, objectType: FlowType, optional: Boolean): typingsJapgolly.babelTypes.mod.OptionalIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("OptionalIndexedAccessType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.OptionalIndexedAccessType_]
  }
  
  inline def StringLiteralTypeAnnotation_(value: String): typingsJapgolly.babelTypes.mod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.StringLiteralTypeAnnotation_]
  }
  
  inline def StringTypeAnnotation_(): typingsJapgolly.babelTypes.mod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.StringTypeAnnotation_]
  }
  
  inline def SymbolTypeAnnotation_(): typingsJapgolly.babelTypes.mod.SymbolTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SymbolTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.SymbolTypeAnnotation_]
  }
  
  inline def ThisTypeAnnotation_(): typingsJapgolly.babelTypes.mod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ThisTypeAnnotation_]
  }
  
  inline def TupleTypeAnnotation_(types: js.Array[FlowType]): typingsJapgolly.babelTypes.mod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TupleTypeAnnotation_]
  }
  
  inline def TypeofTypeAnnotation_(argument: FlowType): typingsJapgolly.babelTypes.mod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TypeofTypeAnnotation_]
  }
  
  inline def UnionTypeAnnotation_(types: js.Array[FlowType]): typingsJapgolly.babelTypes.mod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.UnionTypeAnnotation_]
  }
  
  inline def VoidTypeAnnotation_(): typingsJapgolly.babelTypes.mod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.VoidTypeAnnotation_]
  }
}
