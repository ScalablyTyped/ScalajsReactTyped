package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.Exclamationmark
import typingsJapgolly.babelTypes.babelTypesStrings.Plussign
import typingsJapgolly.babelTypes.babelTypesStrings.Tilde
import typingsJapgolly.babelTypes.babelTypesStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "unaryExpression")
@js.native
object unaryExpression extends js.Object {
  def apply(operator: Exclamationmark, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Exclamationmark, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: Plussign, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Plussign, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: Tilde, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Tilde, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: `-_`, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: `-_`, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
}

