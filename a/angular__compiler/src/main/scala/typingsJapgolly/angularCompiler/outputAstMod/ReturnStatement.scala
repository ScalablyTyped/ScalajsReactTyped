package typingsJapgolly.angularCompiler.outputAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ReturnStatement")
@js.native
class ReturnStatement protected () extends Statement {
  def this(value: Expression) = this()
  def this(value: Expression, sourceSpan: ParseSourceSpan) = this()
  var value: Expression = js.native
}

