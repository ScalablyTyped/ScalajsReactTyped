package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonBodyArray
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.DoExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoExpressionBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): DoExpression = js.native
  def from(params: AnonBodyArray): DoExpression = js.native
}

