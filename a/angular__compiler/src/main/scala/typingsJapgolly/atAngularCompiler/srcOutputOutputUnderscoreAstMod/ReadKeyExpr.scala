package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ReadKeyExpr")
@js.native
class ReadKeyExpr protected () extends Expression {
  def this(receiver: Expression, index: Expression) = this()
  def this(receiver: Expression, index: Expression, `type`: Type) = this()
  def this(receiver: Expression, index: Expression, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(receiver: Expression, index: Expression, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  var index: Expression = js.native
  var receiver: Expression = js.native
  def set(value: Expression): WriteKeyExpr = js.native
}

