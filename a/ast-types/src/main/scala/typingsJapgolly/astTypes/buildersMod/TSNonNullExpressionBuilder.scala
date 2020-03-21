package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExpression
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSNonNullExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind): TSNonNullExpression = js.native
  def from(params: AnonExpression): TSNonNullExpression = js.native
}

