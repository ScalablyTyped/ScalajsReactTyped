package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonAsync
import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionDeclaration = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionDeclaration = js.native
  def apply(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionDeclaration = js.native
  def from(params: AnonAsync): FunctionDeclaration = js.native
}

