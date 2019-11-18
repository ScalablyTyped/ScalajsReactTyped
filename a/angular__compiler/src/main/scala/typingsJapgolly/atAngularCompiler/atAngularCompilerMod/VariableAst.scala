package typingsJapgolly.atAngularCompiler.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "VariableAst")
@js.native
class VariableAst protected ()
  extends typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod.VariableAst {
  def this(
    name: String,
    value: String,
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedVariable): typingsJapgolly.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.VariableAst = js.native
}

