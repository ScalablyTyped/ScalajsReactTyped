package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "InvokeFunctionExpr")
@js.native
class InvokeFunctionExpr protected () extends Expression {
  def this(fn: Expression, args: js.Array[Expression]) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Null, sourceSpan: Null, pure: Boolean) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: Null,
    sourceSpan: ParseSourceSpan,
    pure: Boolean
  ) = this()
  def this(fn: Expression, args: js.Array[Expression], `type`: Type, sourceSpan: Null, pure: Boolean) = this()
  def this(
    fn: Expression,
    args: js.Array[Expression],
    `type`: Type,
    sourceSpan: ParseSourceSpan,
    pure: Boolean
  ) = this()
  var args: js.Array[Expression] = js.native
  var fn: Expression = js.native
  var pure: Boolean = js.native
}

