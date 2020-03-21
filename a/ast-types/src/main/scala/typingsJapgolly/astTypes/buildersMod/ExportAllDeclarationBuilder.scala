package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExportedLoc
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAllDeclarationBuilder extends js.Object {
  def apply(exported: Null, source: LiteralKind): ExportAllDeclaration = js.native
  def apply(exported: IdentifierKind, source: LiteralKind): ExportAllDeclaration = js.native
  def from(params: AnonExportedLoc): ExportAllDeclaration = js.native
}

