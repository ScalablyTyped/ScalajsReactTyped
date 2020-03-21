package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsDeclare
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeAliasDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, typeAnnotation: TSTypeKind): TSTypeAliasDeclaration = js.native
  def from(params: AnonCommentsDeclare): TSTypeAliasDeclaration = js.native
}

