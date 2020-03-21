package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonRightTypeParameters
import typingsJapgolly.astTypes.kindsMod.FlowTypeKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareTypeAliasBuilder extends js.Object {
  def apply(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): DeclareTypeAlias = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): DeclareTypeAlias = js.native
  def from(params: AnonRightTypeParameters): DeclareTypeAlias = js.native
}

