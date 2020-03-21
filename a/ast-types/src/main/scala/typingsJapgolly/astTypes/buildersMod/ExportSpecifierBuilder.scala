package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExported
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSpecifierBuilder extends js.Object {
  def apply(local: js.UndefOr[scala.Nothing], exported: IdentifierKind): ExportSpecifier = js.native
  def apply(local: Null, exported: IdentifierKind): ExportSpecifier = js.native
  def apply(local: IdentifierKind, exported: IdentifierKind): ExportSpecifier = js.native
  def from(params: AnonExported): ExportSpecifier = js.native
}

