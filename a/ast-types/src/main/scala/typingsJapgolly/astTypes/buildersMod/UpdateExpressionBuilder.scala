package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonPrefix
import typingsJapgolly.astTypes.astTypesStrings.PlussignPlussign
import typingsJapgolly.astTypes.astTypesStrings.`--`
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.UpdateExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExpressionBuilder extends js.Object {
  def apply(operator: PlussignPlussign, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def apply(operator: `--`, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def from(params: AnonPrefix): UpdateExpression = js.native
}

