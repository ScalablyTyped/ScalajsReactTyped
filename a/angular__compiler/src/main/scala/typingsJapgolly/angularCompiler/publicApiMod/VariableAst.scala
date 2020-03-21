package typingsJapgolly.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "VariableAst")
@js.native
class VariableAst protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.VariableAst {
  def this(
    name: String,
    value: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: typingsJapgolly.angularCompiler.astMod.ParsedVariable): typingsJapgolly.angularCompiler.templateAstMod.VariableAst = js.native
}

