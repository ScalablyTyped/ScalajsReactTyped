package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTypes
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionTypeAnnotationBuilder extends js.Object {
  def apply(types: js.Array[FlowTypeKind]): IntersectionTypeAnnotation = js.native
  def from(params: AnonTypes): IntersectionTypeAnnotation = js.native
}

