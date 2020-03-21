package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonOperator
import typingsJapgolly.astTypes.astTypesStrings.Exclamationmark
import typingsJapgolly.astTypes.astTypesStrings.Plussign
import typingsJapgolly.astTypes.astTypesStrings.Tilde
import typingsJapgolly.astTypes.astTypesStrings.`-_`
import typingsJapgolly.astTypes.astTypesStrings.delete
import typingsJapgolly.astTypes.astTypesStrings.typeof
import typingsJapgolly.astTypes.astTypesStrings.void
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.UnaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnaryExpressionBuilder extends js.Object {
  def apply(operator: Exclamationmark, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: Exclamationmark, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: Plussign, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: Plussign, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: Tilde, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: Tilde, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: `-_`, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: `-_`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: delete, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: delete, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: typeof, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: typeof, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: void, argument: ExpressionKind): UnaryExpression = js.native
  def apply(operator: void, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def from(params: AnonOperator): UnaryExpression = js.native
}

