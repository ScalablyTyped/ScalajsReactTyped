package typingsJapgolly.angularCompiler.outputAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "assertNotNull")
@js.native
object assertNotNull extends js.Object {
  def apply(expr: Expression): AssertNotNull_ = js.native
  def apply(expr: Expression, sourceSpan: ParseSourceSpan): AssertNotNull_ = js.native
}

