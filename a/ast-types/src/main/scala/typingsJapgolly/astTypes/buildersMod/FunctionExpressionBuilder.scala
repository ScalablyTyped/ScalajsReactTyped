package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonDefaults
import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionExpressionBuilder extends js.Object {
  def apply(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def apply(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean
  ): FunctionExpression = js.native
  def apply(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def apply(id: Null, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def apply(id: Null, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression = js.native
  def apply(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression = js.native
  def apply(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def from(params: AnonDefaults): FunctionExpression = js.native
}

