package typingsJapgolly.angularCompiler.cssAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssMediaQueryRuleAst")
@js.native
class CssMediaQueryRuleAst protected () extends CssBlockDefinitionRuleAst {
  def this(location: ParseSourceSpan, strValue: String, query: CssAtRulePredicateAst, block: CssBlockAst) = this()
}

