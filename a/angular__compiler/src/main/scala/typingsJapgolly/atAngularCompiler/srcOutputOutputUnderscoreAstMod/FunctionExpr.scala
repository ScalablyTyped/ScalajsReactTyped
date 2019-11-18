package typingsJapgolly.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "FunctionExpr")
@js.native
class FunctionExpr protected () extends Expression {
  def this(params: js.Array[FnParam], statements: js.Array[Statement]) = this()
  def this(params: js.Array[FnParam], statements: js.Array[Statement], `type`: Type) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Type,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Null,
    sourceSpan: Null,
    name: String
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Null,
    sourceSpan: ParseSourceSpan,
    name: String
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Type,
    sourceSpan: Null,
    name: String
  ) = this()
  def this(
    params: js.Array[FnParam],
    statements: js.Array[Statement],
    `type`: Type,
    sourceSpan: ParseSourceSpan,
    name: String
  ) = this()
  var name: js.UndefOr[String | Null] = js.native
  var params: js.Array[FnParam] = js.native
  var statements: js.Array[Statement] = js.native
  def toDeclStmt(name: String): DeclareFunctionStmt = js.native
  def toDeclStmt(name: String, modifiers: js.Array[StmtModifier]): DeclareFunctionStmt = js.native
}

