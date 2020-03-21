package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonImported
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSpecifierBuilder extends js.Object {
  def apply(imported: IdentifierKind): ImportSpecifier = js.native
  def apply(imported: IdentifierKind, local: IdentifierKind): ImportSpecifier = js.native
  def from(params: AnonImported): ImportSpecifier = js.native
}

