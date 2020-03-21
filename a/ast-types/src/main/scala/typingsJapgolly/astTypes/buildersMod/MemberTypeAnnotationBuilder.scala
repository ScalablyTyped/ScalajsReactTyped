package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLocObject
import typingsJapgolly.astTypes.kindsMod.GenericTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.MemberTypeAnnotationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberTypeAnnotationBuilder extends js.Object {
  def apply(`object`: IdentifierKind, property: GenericTypeAnnotationKind): MemberTypeAnnotation = js.native
  def apply(`object`: IdentifierKind, property: MemberTypeAnnotationKind): MemberTypeAnnotation = js.native
  def from(params: AnonLocObject): MemberTypeAnnotation = js.native
}

