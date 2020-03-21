package typingsJapgolly.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types", JSImport.Namespace)
@js.native
object serializersTypesMod extends js.Object {
  @js.native
  class ArrayTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesArrayMod.ArrayTypeSerializer
  
  @js.native
  class ConditionalTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesConditionalMod.ConditionalTypeSerializer
  
  @js.native
  class IndexedAccessTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesIndexedAccessMod.IndexedAccessTypeSerializer
  
  @js.native
  class InferredTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesInferredMod.InferredTypeSerializer
  
  @js.native
  class IntersectionTypeSerializer ()
    extends typingsJapgolly.typedoc.intersectionUnionMod.IntersectionTypeSerializer
  
  @js.native
  class IntrinsicTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesIntrinsicMod.IntrinsicTypeSerializer
  
  @js.native
  class PredicateTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesPredicateMod.PredicateTypeSerializer
  
  @js.native
  class ReferenceTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesReferenceMod.ReferenceTypeSerializer
  
  @js.native
  class ReflectionTypeSerializer ()
    extends typingsJapgolly.typedoc.typesReflectionMod.ReflectionTypeSerializer
  
  @js.native
  class StringLiteralTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesStringLiteralMod.StringLiteralTypeSerializer
  
  @js.native
  class TupleTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesTupleMod.TupleTypeSerializer
  
  @js.native
  class TypeOperatorTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesTypeOperatorMod.TypeOperatorTypeSerializer
  
  @js.native
  class TypeParameterTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesTypeParameterMod.TypeParameterTypeSerializer
  
  @js.native
  class TypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesAbstractMod.TypeSerializer
  
  @js.native
  class UnknownTypeSerializer ()
    extends typingsJapgolly.typedoc.serializersTypesUnknownMod.UnknownTypeSerializer
  
  /* static members */
  @js.native
  object TypeSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

