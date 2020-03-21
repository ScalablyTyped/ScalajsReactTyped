package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsLocTypeAnnotation
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAnnotationBuilder extends js.Object {
  def apply(typeAnnotation: TSTypeAnnotationKind): TSTypeAnnotation = js.native
  def apply(typeAnnotation: TSTypeKind): TSTypeAnnotation = js.native
  def from(params: AnonCommentsLocTypeAnnotation): TSTypeAnnotation = js.native
}

