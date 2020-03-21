package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExpression
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionStatementBuilder extends js.Object {
  def apply(expression: ExpressionKind): ExpressionStatement = js.native
  def from(params: AnonExpression): ExpressionStatement = js.native
}

