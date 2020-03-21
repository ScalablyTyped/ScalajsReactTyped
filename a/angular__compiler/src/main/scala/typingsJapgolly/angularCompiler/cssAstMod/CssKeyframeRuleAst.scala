package typingsJapgolly.angularCompiler.cssAstMod

import typingsJapgolly.angularCompiler.cssLexerMod.CssToken
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssKeyframeRuleAst")
@js.native
class CssKeyframeRuleAst protected () extends CssBlockRuleAst {
  def this(location: ParseSourceSpan, name: CssToken, block: CssBlockAst) = this()
}

