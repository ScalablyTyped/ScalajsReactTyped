package typingsJapgolly.angularCompiler.cssAstMod

import typingsJapgolly.angularCompiler.cssLexerMod.CssToken
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssStyleValueAst")
@js.native
class CssStyleValueAst protected () extends CssAst {
  def this(location: ParseSourceSpan, tokens: js.Array[CssToken], strValue: String) = this()
  var strValue: String = js.native
  var tokens: js.Array[CssToken] = js.native
}

