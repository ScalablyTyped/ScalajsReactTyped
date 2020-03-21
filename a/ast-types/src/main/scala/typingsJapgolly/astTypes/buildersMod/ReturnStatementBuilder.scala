package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonArgument
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ReturnStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnStatementBuilder extends js.Object {
  def apply(): ReturnStatement = js.native
  def apply(argument: ExpressionKind): ReturnStatement = js.native
  def from(params: AnonArgument): ReturnStatement = js.native
}

