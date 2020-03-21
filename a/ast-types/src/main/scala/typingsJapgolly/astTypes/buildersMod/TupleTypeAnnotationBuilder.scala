package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTypes
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TupleTypeAnnotationBuilder extends js.Object {
  def apply(types: js.Array[FlowTypeKind]): TupleTypeAnnotation = js.native
  def from(params: AnonTypes): TupleTypeAnnotation = js.native
}

