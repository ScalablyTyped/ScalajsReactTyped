package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "NotExpr")
@js.native
class NotExpr protected () extends Expression {
  def this(condition: Expression) = this()
  def this(condition: Expression, sourceSpan: ParseSourceSpan) = this()
  var condition: Expression = js.native
}

