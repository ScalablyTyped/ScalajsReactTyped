package typingsJapgolly.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "VariableAst")
@js.native
class VariableAst protected ()
  extends typingsJapgolly.angularCompiler.templateAstMod.VariableAst {
  def this(
    name: String,
    value: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/src/compiler", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: typingsJapgolly.angularCompiler.astMod.ParsedVariable): typingsJapgolly.angularCompiler.templateAstMod.VariableAst = js.native
}

