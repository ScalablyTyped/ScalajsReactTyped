package typingsJapgolly.angularCompiler.outputAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "CommaExpr")
@js.native
class CommaExpr protected () extends Expression {
  def this(parts: js.Array[Expression]) = this()
  def this(parts: js.Array[Expression], sourceSpan: ParseSourceSpan) = this()
  var parts: js.Array[Expression] = js.native
}

