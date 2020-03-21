package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonParameterName
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TSThisTypeKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypePredicateBuilder extends js.Object {
  def apply(parameterName: IdentifierKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def apply(parameterName: TSThisTypeKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def from(params: AnonParameterName): TSTypePredicate = js.native
}

