package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonDeclarations
import typingsJapgolly.astTypes.astTypesStrings.`var`
import typingsJapgolly.astTypes.astTypesStrings.const
import typingsJapgolly.astTypes.astTypesStrings.let
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.VariableDeclaratorKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarationBuilder extends js.Object {
  def apply(kind: `var`, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: const, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def apply(kind: let, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def from(params: AnonDeclarations): VariableDeclaration = js.native
}

