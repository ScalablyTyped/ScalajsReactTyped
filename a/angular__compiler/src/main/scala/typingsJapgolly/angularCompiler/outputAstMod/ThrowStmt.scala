package typingsJapgolly.angularCompiler.outputAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ThrowStmt")
@js.native
class ThrowStmt protected () extends Statement {
  def this(error: Expression) = this()
  def this(error: Expression, sourceSpan: ParseSourceSpan) = this()
  var error: Expression = js.native
  def isEquivalent(stmt: ThrowStmt): Boolean = js.native
}

