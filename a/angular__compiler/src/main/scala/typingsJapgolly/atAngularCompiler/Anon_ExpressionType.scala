package typingsJapgolly.atAngularCompiler

import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExpressionType
import typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod.InvokeFunctionExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpressionType extends js.Object {
  var expression: InvokeFunctionExpr
  var `type`: ExpressionType
}

object Anon_ExpressionType {
  @scala.inline
  def apply(expression: InvokeFunctionExpr, `type`: ExpressionType): Anon_ExpressionType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExpressionType]
  }
}

