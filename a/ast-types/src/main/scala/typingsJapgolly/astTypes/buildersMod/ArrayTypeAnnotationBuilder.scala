package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonElementType
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayTypeAnnotationBuilder extends js.Object {
  def apply(elementType: FlowTypeKind): ArrayTypeAnnotation = js.native
  def from(params: AnonElementType): ArrayTypeAnnotation = js.native
}

