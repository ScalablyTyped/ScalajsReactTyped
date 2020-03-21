package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonRightTypeParameters
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareOpaqueTypeBuilder extends js.Object {
  def apply(id: IdentifierKind): DeclareOpaqueType = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind): DeclareOpaqueType = js.native
  def from(params: AnonRightTypeParameters): DeclareOpaqueType = js.native
}

