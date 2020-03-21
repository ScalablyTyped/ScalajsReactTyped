package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonIdLoc
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterInstantiationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericTypeAnnotationBuilder extends js.Object {
  def apply(id: IdentifierKind): GenericTypeAnnotation = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  def apply(id: QualifiedTypeIdentifierKind): GenericTypeAnnotation = js.native
  def apply(id: QualifiedTypeIdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  def from(params: AnonIdLoc): GenericTypeAnnotation = js.native
}

