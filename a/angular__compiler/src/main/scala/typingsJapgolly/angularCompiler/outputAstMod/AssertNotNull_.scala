package typingsJapgolly.angularCompiler.outputAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "AssertNotNull")
@js.native
class AssertNotNull_ protected () extends Expression {
  def this(condition: Expression) = this()
  def this(condition: Expression, sourceSpan: ParseSourceSpan) = this()
  var condition: Expression = js.native
}

