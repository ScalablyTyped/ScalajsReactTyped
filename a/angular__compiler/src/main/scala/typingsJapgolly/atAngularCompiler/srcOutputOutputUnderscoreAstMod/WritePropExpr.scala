package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "WritePropExpr")
@js.native
class WritePropExpr protected () extends Expression {
  def this(receiver: Expression, name: String, value: Expression) = this()
  def this(receiver: Expression, name: String, value: Expression, `type`: Type) = this()
  def this(receiver: Expression, name: String, value: Expression, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(receiver: Expression, name: String, value: Expression, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  var name: String = js.native
  var receiver: Expression = js.native
  var value: Expression = js.native
}

