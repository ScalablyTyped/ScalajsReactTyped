package typingsJapgolly.angularCompiler.outputAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ExpressionStatement")
@js.native
class ExpressionStatement protected () extends Statement {
  def this(expr: Expression) = this()
  def this(expr: Expression, sourceSpan: ParseSourceSpan) = this()
  var expr: Expression = js.native
}

