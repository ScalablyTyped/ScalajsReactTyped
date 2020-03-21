package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonArgumentComments
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ThrowStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrowStatementBuilder extends js.Object {
  def apply(argument: ExpressionKind): ThrowStatement = js.native
  def from(params: AnonArgumentComments): ThrowStatement = js.native
}

