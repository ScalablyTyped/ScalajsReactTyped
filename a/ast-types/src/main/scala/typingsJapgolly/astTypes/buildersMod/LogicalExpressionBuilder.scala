package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonLeftLoc
import typingsJapgolly.astTypes.astTypesStrings.AmpersandAmpersand
import typingsJapgolly.astTypes.astTypesStrings.QuestionmarkQuestionmark
import typingsJapgolly.astTypes.astTypesStrings.VerticallineVerticalline
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.LogicalExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalExpressionBuilder extends js.Object {
  def apply(operator: AmpersandAmpersand, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: QuestionmarkQuestionmark, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def apply(operator: VerticallineVerticalline, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def from(params: AnonLeftLoc): LogicalExpression = js.native
}

