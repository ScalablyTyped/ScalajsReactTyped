package typingsJapgolly.typedoc.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.typedoc.distLibModelsTypesMod.ArrayType
import typingsJapgolly.typedoc.distLibModelsTypesMod.ConditionalType
import typingsJapgolly.typedoc.distLibModelsTypesMod.IndexedAccessType
import typingsJapgolly.typedoc.distLibModelsTypesMod.InferredType
import typingsJapgolly.typedoc.distLibModelsTypesMod.IntersectionType
import typingsJapgolly.typedoc.distLibModelsTypesMod.IntrinsicType
import typingsJapgolly.typedoc.distLibModelsTypesMod.LiteralType
import typingsJapgolly.typedoc.distLibModelsTypesMod.MappedType
import typingsJapgolly.typedoc.distLibModelsTypesMod.NamedTupleMember
import typingsJapgolly.typedoc.distLibModelsTypesMod.OptionalType
import typingsJapgolly.typedoc.distLibModelsTypesMod.PredicateType
import typingsJapgolly.typedoc.distLibModelsTypesMod.QueryType
import typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType
import typingsJapgolly.typedoc.distLibModelsTypesMod.ReflectionType
import typingsJapgolly.typedoc.distLibModelsTypesMod.RestType
import typingsJapgolly.typedoc.distLibModelsTypesMod.TemplateLiteralType
import typingsJapgolly.typedoc.distLibModelsTypesMod.TupleType
import typingsJapgolly.typedoc.distLibModelsTypesMod.TypeOperatorType
import typingsJapgolly.typedoc.distLibModelsTypesMod.UnionType
import typingsJapgolly.typedoc.distLibModelsTypesMod.UnknownType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/models/types.TypeVisitor<void>> */
trait PartialTypeVisitorvoid extends StObject {
  
  var array: js.UndefOr[js.Function1[/* type */ ArrayType, Unit]] = js.undefined
  
  var conditional: js.UndefOr[js.Function1[/* type */ ConditionalType, Unit]] = js.undefined
  
  var indexedAccess: js.UndefOr[js.Function1[/* type */ IndexedAccessType, Unit]] = js.undefined
  
  var inferred: js.UndefOr[js.Function1[/* type */ InferredType, Unit]] = js.undefined
  
  var intersection: js.UndefOr[js.Function1[/* type */ IntersectionType, Unit]] = js.undefined
  
  var intrinsic: js.UndefOr[js.Function1[/* type */ IntrinsicType, Unit]] = js.undefined
  
  var literal: js.UndefOr[js.Function1[/* type */ LiteralType, Unit]] = js.undefined
  
  var mapped: js.UndefOr[js.Function1[/* type */ MappedType, Unit]] = js.undefined
  
  var `named-tuple-member`: js.UndefOr[js.Function1[/* type */ NamedTupleMember, Unit]] = js.undefined
  
  var optional: js.UndefOr[js.Function1[/* type */ OptionalType, Unit]] = js.undefined
  
  var predicate: js.UndefOr[js.Function1[/* type */ PredicateType, Unit]] = js.undefined
  
  var query: js.UndefOr[js.Function1[/* type */ QueryType, Unit]] = js.undefined
  
  var reference: js.UndefOr[js.Function1[/* type */ ReferenceType, Unit]] = js.undefined
  
  var reflection: js.UndefOr[js.Function1[/* type */ ReflectionType, Unit]] = js.undefined
  
  var rest: js.UndefOr[js.Function1[/* type */ RestType, Unit]] = js.undefined
  
  var `template-literal`: js.UndefOr[js.Function1[/* type */ TemplateLiteralType, Unit]] = js.undefined
  
  var tuple: js.UndefOr[js.Function1[/* type */ TupleType, Unit]] = js.undefined
  
  var typeOperator: js.UndefOr[js.Function1[/* type */ TypeOperatorType, Unit]] = js.undefined
  
  var union: js.UndefOr[js.Function1[/* type */ UnionType, Unit]] = js.undefined
  
  var unknown: js.UndefOr[js.Function1[/* type */ UnknownType, Unit]] = js.undefined
}
object PartialTypeVisitorvoid {
  
  inline def apply(): PartialTypeVisitorvoid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeVisitorvoid]
  }
  
  extension [Self <: PartialTypeVisitorvoid](x: Self) {
    
    inline def setArray(value: /* type */ ArrayType => Callback): Self = StObject.set(x, "array", js.Any.fromFunction1((t0: /* type */ ArrayType) => value(t0).runNow()))
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setConditional(value: /* type */ ConditionalType => Callback): Self = StObject.set(x, "conditional", js.Any.fromFunction1((t0: /* type */ ConditionalType) => value(t0).runNow()))
    
    inline def setConditionalUndefined: Self = StObject.set(x, "conditional", js.undefined)
    
    inline def setIndexedAccess(value: /* type */ IndexedAccessType => Callback): Self = StObject.set(x, "indexedAccess", js.Any.fromFunction1((t0: /* type */ IndexedAccessType) => value(t0).runNow()))
    
    inline def setIndexedAccessUndefined: Self = StObject.set(x, "indexedAccess", js.undefined)
    
    inline def setInferred(value: /* type */ InferredType => Callback): Self = StObject.set(x, "inferred", js.Any.fromFunction1((t0: /* type */ InferredType) => value(t0).runNow()))
    
    inline def setInferredUndefined: Self = StObject.set(x, "inferred", js.undefined)
    
    inline def setIntersection(value: /* type */ IntersectionType => Callback): Self = StObject.set(x, "intersection", js.Any.fromFunction1((t0: /* type */ IntersectionType) => value(t0).runNow()))
    
    inline def setIntersectionUndefined: Self = StObject.set(x, "intersection", js.undefined)
    
    inline def setIntrinsic(value: /* type */ IntrinsicType => Callback): Self = StObject.set(x, "intrinsic", js.Any.fromFunction1((t0: /* type */ IntrinsicType) => value(t0).runNow()))
    
    inline def setIntrinsicUndefined: Self = StObject.set(x, "intrinsic", js.undefined)
    
    inline def setLiteral(value: /* type */ LiteralType => Callback): Self = StObject.set(x, "literal", js.Any.fromFunction1((t0: /* type */ LiteralType) => value(t0).runNow()))
    
    inline def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
    
    inline def setMapped(value: /* type */ MappedType => Callback): Self = StObject.set(x, "mapped", js.Any.fromFunction1((t0: /* type */ MappedType) => value(t0).runNow()))
    
    inline def setMappedUndefined: Self = StObject.set(x, "mapped", js.undefined)
    
    inline def `setNamed-tuple-member`(value: /* type */ NamedTupleMember => Callback): Self = StObject.set(x, "named-tuple-member", js.Any.fromFunction1((t0: /* type */ NamedTupleMember) => value(t0).runNow()))
    
    inline def `setNamed-tuple-memberUndefined`: Self = StObject.set(x, "named-tuple-member", js.undefined)
    
    inline def setOptional(value: /* type */ OptionalType => Callback): Self = StObject.set(x, "optional", js.Any.fromFunction1((t0: /* type */ OptionalType) => value(t0).runNow()))
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setPredicate(value: /* type */ PredicateType => Callback): Self = StObject.set(x, "predicate", js.Any.fromFunction1((t0: /* type */ PredicateType) => value(t0).runNow()))
    
    inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    inline def setQuery(value: /* type */ QueryType => Callback): Self = StObject.set(x, "query", js.Any.fromFunction1((t0: /* type */ QueryType) => value(t0).runNow()))
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReference(value: /* type */ ReferenceType => Callback): Self = StObject.set(x, "reference", js.Any.fromFunction1((t0: /* type */ ReferenceType) => value(t0).runNow()))
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setReflection(value: /* type */ ReflectionType => Callback): Self = StObject.set(x, "reflection", js.Any.fromFunction1((t0: /* type */ ReflectionType) => value(t0).runNow()))
    
    inline def setReflectionUndefined: Self = StObject.set(x, "reflection", js.undefined)
    
    inline def setRest(value: /* type */ RestType => Callback): Self = StObject.set(x, "rest", js.Any.fromFunction1((t0: /* type */ RestType) => value(t0).runNow()))
    
    inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    inline def `setTemplate-literal`(value: /* type */ TemplateLiteralType => Callback): Self = StObject.set(x, "template-literal", js.Any.fromFunction1((t0: /* type */ TemplateLiteralType) => value(t0).runNow()))
    
    inline def `setTemplate-literalUndefined`: Self = StObject.set(x, "template-literal", js.undefined)
    
    inline def setTuple(value: /* type */ TupleType => Callback): Self = StObject.set(x, "tuple", js.Any.fromFunction1((t0: /* type */ TupleType) => value(t0).runNow()))
    
    inline def setTupleUndefined: Self = StObject.set(x, "tuple", js.undefined)
    
    inline def setTypeOperator(value: /* type */ TypeOperatorType => Callback): Self = StObject.set(x, "typeOperator", js.Any.fromFunction1((t0: /* type */ TypeOperatorType) => value(t0).runNow()))
    
    inline def setTypeOperatorUndefined: Self = StObject.set(x, "typeOperator", js.undefined)
    
    inline def setUnion(value: /* type */ UnionType => Callback): Self = StObject.set(x, "union", js.Any.fromFunction1((t0: /* type */ UnionType) => value(t0).runNow()))
    
    inline def setUnionUndefined: Self = StObject.set(x, "union", js.undefined)
    
    inline def setUnknown(value: /* type */ UnknownType => Callback): Self = StObject.set(x, "unknown", js.Any.fromFunction1((t0: /* type */ UnknownType) => value(t0).runNow()))
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
