package typingsJapgolly.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreAstMod

import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssInlineRuleAst")
@js.native
class CssInlineRuleAst protected () extends CssRuleAst {
  def this(location: ParseSourceSpan, `type`: BlockType, value: CssStyleValueAst) = this()
  var `type`: BlockType = js.native
  var value: CssStyleValueAst = js.native
}

