package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTypes
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionTypeAnnotationBuilder extends js.Object {
  def apply(types: js.Array[FlowTypeKind]): UnionTypeAnnotation = js.native
  def from(params: AnonTypes): UnionTypeAnnotation = js.native
}

