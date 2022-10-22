package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.AnyTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.ArrayTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.BooleanTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.BooleanLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.FunctionTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.GenericTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.IntersectionTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.MixedTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.NullableTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.NumericLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.NumberTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.StringLiteralTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.StringTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.ThisTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.TupleTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.TypeofTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.TypeAnnotation_
  - typingsJapgolly.babelTypes.mod.ObjectTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.UnionTypeAnnotation_
  - typingsJapgolly.babelTypes.mod.VoidTypeAnnotation_
*/
trait FlowTypeAnnotation extends StObject
object FlowTypeAnnotation {
  
  inline def AnyTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.AnyTypeAnnotation_]
  }
  
  inline def ArrayTypeAnnotation_(elementType: FlowTypeAnnotation, end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ArrayTypeAnnotation_]
  }
  
  inline def BooleanLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BooleanLiteralTypeAnnotation_]
  }
  
  inline def BooleanTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.BooleanTypeAnnotation_]
  }
  
  inline def FunctionTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    params: js.Array[FunctionTypeParam_],
    rest: FunctionTypeParam_,
    returnType: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typingsJapgolly.babelTypes.mod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.FunctionTypeAnnotation_]
  }
  
  inline def GenericTypeAnnotation_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterInstantiation_
  ): typingsJapgolly.babelTypes.mod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.GenericTypeAnnotation_]
  }
  
  inline def IntersectionTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typingsJapgolly.babelTypes.mod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.IntersectionTypeAnnotation_]
  }
  
  inline def MixedTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.MixedTypeAnnotation_]
  }
  
  inline def NullableTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, typeAnnotation: FlowTypeAnnotation): typingsJapgolly.babelTypes.mod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NullableTypeAnnotation_]
  }
  
  inline def NumberTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NumberTypeAnnotation_]
  }
  
  inline def NumericLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.NumericLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.NumericLiteralTypeAnnotation_]
  }
  
  inline def ObjectTypeAnnotation_(
    callProperties: js.Array[ObjectTypeCallProperty_],
    end: Double,
    indexers: js.Array[ObjectTypeIndexer_],
    loc: SourceLocation,
    properties: js.Array[ObjectTypeProperty_],
    start: Double
  ): typingsJapgolly.babelTypes.mod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectTypeAnnotation_]
  }
  
  inline def StringLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.StringLiteralTypeAnnotation_]
  }
  
  inline def StringTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.StringTypeAnnotation_]
  }
  
  inline def ThisTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ThisTypeAnnotation_]
  }
  
  inline def TupleTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typingsJapgolly.babelTypes.mod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TupleTypeAnnotation_]
  }
  
  inline def TypeAnnotation_(end: Double, loc: SourceLocation, start: Double, typeAnnotation: FlowTypeAnnotation): typingsJapgolly.babelTypes.mod.TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TypeAnnotation_]
  }
  
  inline def TypeofTypeAnnotation_(argument: FlowTypeAnnotation, end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TypeofTypeAnnotation_]
  }
  
  inline def UnionTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typingsJapgolly.babelTypes.mod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.UnionTypeAnnotation_]
  }
  
  inline def VoidTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.VoidTypeAnnotation_]
  }
}
