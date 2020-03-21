package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonArgumentFlowTypeKind
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTypeAnnotationBuilder extends js.Object {
  def apply(argument: FlowTypeKind): TypeofTypeAnnotation = js.native
  def from(params: AnonArgumentFlowTypeKind): TypeofTypeAnnotation = js.native
}

