package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.AmpersandAmpersand
import typingsJapgolly.babelTypes.babelTypesStrings.QuestionmarkQuestionmark
import typingsJapgolly.babelTypes.babelTypesStrings.VerticallineVerticalline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "logicalExpression")
@js.native
object logicalExpression extends js.Object {
  def apply(operator: AmpersandAmpersand, left: Expression, right: Expression): LogicalExpression_ = js.native
  def apply(operator: QuestionmarkQuestionmark, left: Expression, right: Expression): LogicalExpression_ = js.native
  def apply(operator: VerticallineVerticalline, left: Expression, right: Expression): LogicalExpression_ = js.native
}

