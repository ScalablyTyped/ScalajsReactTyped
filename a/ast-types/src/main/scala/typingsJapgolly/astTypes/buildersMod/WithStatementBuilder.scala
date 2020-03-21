package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonObject
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStatementBuilder extends js.Object {
  def apply(`object`: ExpressionKind, body: StatementKind): WithStatement = js.native
  def from(params: AnonObject): WithStatement = js.native
}

