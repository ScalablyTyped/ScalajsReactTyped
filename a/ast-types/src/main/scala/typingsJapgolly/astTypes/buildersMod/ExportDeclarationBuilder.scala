package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonDefault
import typingsJapgolly.astTypes.kindsMod.DeclarationKind
import typingsJapgolly.astTypes.kindsMod.ExportBatchSpecifierKind
import typingsJapgolly.astTypes.kindsMod.ExportSpecifierKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDeclarationBuilder extends js.Object {
  def apply(defaultParam: Boolean): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: DeclarationKind): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def apply(defaultParam: Boolean, declaration: ExpressionKind): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def apply(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def from(params: AnonDefault): ExportDeclaration = js.native
}

