package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExtends
import typingsJapgolly.astTypes.kindsMod.InterfaceExtendsKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceTypeAnnotationBuilder extends js.Object {
  def apply(body: ObjectTypeAnnotationKind): InterfaceTypeAnnotation = js.native
  def apply(body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceTypeAnnotation = js.native
  def from(params: AnonExtends): InterfaceTypeAnnotation = js.native
}

