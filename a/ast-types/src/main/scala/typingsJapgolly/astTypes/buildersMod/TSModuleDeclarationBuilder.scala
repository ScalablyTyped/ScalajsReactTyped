package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonGlobal
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.StringLiteralKind
import typingsJapgolly.astTypes.kindsMod.TSModuleBlockKind
import typingsJapgolly.astTypes.kindsMod.TSModuleDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSModuleDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind): TSModuleDeclaration = js.native
  def apply(id: IdentifierKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: IdentifierKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def from(params: AnonGlobal): TSModuleDeclaration = js.native
}

