package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLocTypeAnnotation
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAnnotationBuilder extends js.Object {
  def apply(typeAnnotation: FlowTypeKind): TypeAnnotation = js.native
  def from(params: AnonLocTypeAnnotation): TypeAnnotation = js.native
}

