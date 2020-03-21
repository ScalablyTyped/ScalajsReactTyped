package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonTest
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoWhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoWhileStatementBuilder extends js.Object {
  def apply(body: StatementKind, test: ExpressionKind): DoWhileStatement = js.native
  def from(params: AnonTest): DoWhileStatement = js.native
}

