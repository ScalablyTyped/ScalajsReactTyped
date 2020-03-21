package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExpression
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.Decorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorBuilder extends js.Object {
  def apply(expression: ExpressionKind): Decorator = js.native
  def from(params: AnonExpression): Decorator = js.native
}

