package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.abstractMod.Reflection
import typingsJapgolly.typedoc.reflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types", JSImport.Namespace)
@js.native
object modelsTypesMod extends js.Object {
  @js.native
  class ArrayType protected ()
    extends typingsJapgolly.typedoc.typesArrayMod.ArrayType {
    def this(elementType: Type) = this()
  }
  
  @js.native
  class ConditionalType protected ()
    extends typingsJapgolly.typedoc.typesConditionalMod.ConditionalType {
    def this(
      checkType: typingsJapgolly.typedoc.typesAbstractMod.Type,
      extendsType: typingsJapgolly.typedoc.typesAbstractMod.Type,
      trueType: typingsJapgolly.typedoc.typesAbstractMod.Type,
      falseType: typingsJapgolly.typedoc.typesAbstractMod.Type
    ) = this()
  }
  
  @js.native
  class IndexedAccessType protected ()
    extends typingsJapgolly.typedoc.typesIndexedAccessMod.IndexedAccessType {
    def this(objectType: Type, indexType: Type) = this()
  }
  
  @js.native
  class InferredType protected ()
    extends typingsJapgolly.typedoc.typesInferredMod.InferredType {
    def this(name: String) = this()
  }
  
  @js.native
  class IntersectionType protected ()
    extends typingsJapgolly.typedoc.intersectionMod.IntersectionType {
    def this(types: js.Array[typingsJapgolly.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @js.native
  class IntrinsicType protected ()
    extends typingsJapgolly.typedoc.typesIntrinsicMod.IntrinsicType {
    def this(name: String) = this()
  }
  
  @js.native
  class PredicateType protected ()
    extends typingsJapgolly.typedoc.typesPredicateMod.PredicateType {
    def this(name: String, asserts: Boolean) = this()
    def this(name: String, asserts: Boolean, targetType: typingsJapgolly.typedoc.typesAbstractMod.Type) = this()
  }
  
  @js.native
  class ReferenceType protected ()
    extends typingsJapgolly.typedoc.modelsTypesReferenceMod.ReferenceType {
    def this(name: String, symbolID: Double) = this()
    def this(name: String, symbolID: Double, reflection: Reflection) = this()
  }
  
  @js.native
  class ReflectionType protected ()
    extends typingsJapgolly.typedoc.reflectionMod.ReflectionType {
    def this(declaration: DeclarationReflection) = this()
  }
  
  @js.native
  class StringLiteralType protected ()
    extends typingsJapgolly.typedoc.typesStringLiteralMod.StringLiteralType {
    def this(value: String) = this()
  }
  
  @js.native
  class TupleType protected ()
    extends typingsJapgolly.typedoc.typesTupleMod.TupleType {
    def this(elements: js.Array[typingsJapgolly.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @js.native
  abstract class Type ()
    extends typingsJapgolly.typedoc.typesAbstractMod.Type
  
  @js.native
  class TypeOperatorType protected ()
    extends typingsJapgolly.typedoc.typesTypeOperatorMod.TypeOperatorType {
    def this(target: typingsJapgolly.typedoc.typesAbstractMod.Type) = this()
  }
  
  @js.native
  class TypeParameterType protected ()
    extends typingsJapgolly.typedoc.modelsTypesTypeParameterMod.TypeParameterType {
    def this(name: String) = this()
  }
  
  @js.native
  class UnionType protected ()
    extends typingsJapgolly.typedoc.unionMod.UnionType {
    def this(types: js.Array[typingsJapgolly.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @js.native
  class UnknownType protected ()
    extends typingsJapgolly.typedoc.typesUnknownMod.UnknownType {
    def this(name: String) = this()
  }
  
  /* static members */
  @js.native
  object ReferenceType extends js.Object {
    var SYMBOL_ID_RESOLVED: Double = js.native
    var SYMBOL_ID_RESOLVE_BY_NAME: Double = js.native
  }
  
  /* static members */
  @js.native
  object Type extends js.Object {
    def isTypeListEqual(
      a: js.Array[typingsJapgolly.typedoc.typesAbstractMod.Type],
      b: js.Array[typingsJapgolly.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
    def isTypeListSimilar(
      a: js.Array[typingsJapgolly.typedoc.typesAbstractMod.Type],
      b: js.Array[typingsJapgolly.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
  }
  
}

