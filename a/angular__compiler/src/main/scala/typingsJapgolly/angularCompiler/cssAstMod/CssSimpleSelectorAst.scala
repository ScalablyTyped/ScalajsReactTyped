package typingsJapgolly.angularCompiler.cssAstMod

import typingsJapgolly.angularCompiler.cssLexerMod.CssToken
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssSimpleSelectorAst")
@js.native
class CssSimpleSelectorAst protected () extends CssSelectorPartAst {
  def this(
    location: ParseSourceSpan,
    tokens: js.Array[CssToken],
    strValue: String,
    pseudoSelectors: js.Array[CssPseudoSelectorAst],
    operator: CssToken
  ) = this()
  var operator: CssToken = js.native
  var pseudoSelectors: js.Array[CssPseudoSelectorAst] = js.native
  var strValue: String = js.native
  var tokens: js.Array[CssToken] = js.native
}

