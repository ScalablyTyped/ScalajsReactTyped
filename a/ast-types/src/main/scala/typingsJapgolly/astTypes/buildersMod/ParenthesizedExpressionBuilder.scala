package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExpression
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParenthesizedExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind): ParenthesizedExpression = js.native
  def from(params: AnonExpression): ParenthesizedExpression = js.native
}

