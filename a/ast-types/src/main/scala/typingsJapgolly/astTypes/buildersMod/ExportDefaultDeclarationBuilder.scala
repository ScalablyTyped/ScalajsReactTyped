package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonCommentsDeclaration
import typingsJapgolly.astTypes.kindsMod.DeclarationKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDefaultDeclarationBuilder extends js.Object {
  def apply(declaration: DeclarationKind): ExportDefaultDeclaration = js.native
  def apply(declaration: ExpressionKind): ExportDefaultDeclaration = js.native
  def from(params: AnonCommentsDeclaration): ExportDefaultDeclaration = js.native
}

