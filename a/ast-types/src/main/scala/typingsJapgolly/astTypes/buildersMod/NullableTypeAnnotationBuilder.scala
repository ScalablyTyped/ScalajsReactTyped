package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLocTypeAnnotation
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NullableTypeAnnotationBuilder extends js.Object {
  def apply(typeAnnotation: FlowTypeKind): NullableTypeAnnotation = js.native
  def from(params: AnonLocTypeAnnotation): NullableTypeAnnotation = js.native
}

