package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonSpecifiers
import typingsJapgolly.astTypes.kindsMod.DeclarationKind
import typingsJapgolly.astTypes.kindsMod.ExportSpecifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportNamedDeclarationBuilder extends js.Object {
  def apply(): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def from(params: AnonSpecifiers): ExportNamedDeclaration = js.native
}

