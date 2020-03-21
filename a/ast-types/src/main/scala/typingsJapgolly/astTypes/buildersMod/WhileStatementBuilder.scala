package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTest
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.WhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhileStatementBuilder extends js.Object {
  def apply(test: ExpressionKind, body: StatementKind): WhileStatement = js.native
  def from(params: AnonTest): WhileStatement = js.native
}

