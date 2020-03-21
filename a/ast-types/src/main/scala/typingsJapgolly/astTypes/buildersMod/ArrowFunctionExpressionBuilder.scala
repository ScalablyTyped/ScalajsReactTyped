package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonGenerator
import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowFunctionExpressionBuilder extends js.Object {
  def apply(params: js.Array[PatternKind], body: BlockStatementKind): ArrowFunctionExpression = js.native
  def apply(params: js.Array[PatternKind], body: BlockStatementKind, expression: Boolean): ArrowFunctionExpression = js.native
  def apply(params: js.Array[PatternKind], body: ExpressionKind): ArrowFunctionExpression = js.native
  def apply(params: js.Array[PatternKind], body: ExpressionKind, expression: Boolean): ArrowFunctionExpression = js.native
  def from(params: AnonGenerator): ArrowFunctionExpression = js.native
}

