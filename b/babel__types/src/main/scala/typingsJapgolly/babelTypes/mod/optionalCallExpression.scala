package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "optionalCallExpression")
@js.native
object optionalCallExpression extends js.Object {
  def apply(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_],
    optional: Boolean
  ): OptionalCallExpression_ = js.native
}

