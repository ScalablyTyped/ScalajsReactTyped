package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.PlussignPlussign
import typingsJapgolly.babelTypes.babelTypesStrings.`--`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "updateExpression")
@js.native
object updateExpression extends js.Object {
  def apply(): UpdateExpression_ = js.native
  def apply(operator: PlussignPlussign): UpdateExpression_ = js.native
  def apply(operator: PlussignPlussign, argument: Expression): UpdateExpression_ = js.native
  def apply(operator: PlussignPlussign, argument: Expression, prefix: Boolean): UpdateExpression_ = js.native
  def apply(operator: `--`): UpdateExpression_ = js.native
  def apply(operator: `--`, argument: Expression): UpdateExpression_ = js.native
  def apply(operator: `--`, argument: Expression, prefix: Boolean): UpdateExpression_ = js.native
}

