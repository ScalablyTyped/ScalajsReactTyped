package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTypeArguments
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.SpreadElementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalCallExpressionBuilder extends js.Object {
  def apply(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): OptionalCallExpression = js.native
  def apply(
    callee: ExpressionKind,
    argumentsParam: js.Array[ExpressionKind | SpreadElementKind],
    optional: Boolean
  ): OptionalCallExpression = js.native
  def from(params: AnonTypeArguments): OptionalCallExpression = js.native
}

