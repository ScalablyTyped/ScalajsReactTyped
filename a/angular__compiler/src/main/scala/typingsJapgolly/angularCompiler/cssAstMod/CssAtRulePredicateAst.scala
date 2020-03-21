package typingsJapgolly.angularCompiler.cssAstMod

import typingsJapgolly.angularCompiler.cssLexerMod.CssToken
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssAtRulePredicateAst")
@js.native
class CssAtRulePredicateAst protected () extends CssAst {
  def this(location: ParseSourceSpan, strValue: String, tokens: js.Array[CssToken]) = this()
  var strValue: String = js.native
  var tokens: js.Array[CssToken] = js.native
}

