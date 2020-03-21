package typingsJapgolly.angularCompiler.cssAstMod

import typingsJapgolly.angularCompiler.cssLexerMod.CssToken
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssKeyframeDefinitionAst")
@js.native
class CssKeyframeDefinitionAst protected () extends CssBlockRuleAst {
  def this(location: ParseSourceSpan, steps: js.Array[CssToken], block: CssBlockAst) = this()
  var steps: js.Array[CssToken] = js.native
}

