package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonConsequent
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.SwitchCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchCaseBuilder extends js.Object {
  def apply(test: Null, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def apply(test: ExpressionKind, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def from(params: AnonConsequent): SwitchCase = js.native
}

