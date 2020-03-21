package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonImportKind
import typingsJapgolly.astTypes.astTypesStrings.`type`
import typingsJapgolly.astTypes.astTypesStrings.value
import typingsJapgolly.astTypes.kindsMod.ImportDefaultSpecifierKind
import typingsJapgolly.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typingsJapgolly.astTypes.kindsMod.ImportSpecifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDeclarationBuilder extends js.Object {
  def apply(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind): ImportDeclaration = js.native
  def apply(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: `type`): ImportDeclaration = js.native
  def apply(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: value): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: `type`
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: value
  ): ImportDeclaration = js.native
  def from(params: AnonImportKind): ImportDeclaration = js.native
}

