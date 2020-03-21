package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonRightTypeParameters
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeAliasBuilder extends js.Object {
  def apply(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): TypeAlias = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): TypeAlias = js.native
  def from(params: AnonRightTypeParameters): TypeAlias = js.native
}

