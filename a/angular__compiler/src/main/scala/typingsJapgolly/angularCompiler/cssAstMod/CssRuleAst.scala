package typingsJapgolly.angularCompiler.cssAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssRuleAst")
@js.native
abstract class CssRuleAst protected () extends CssAst {
  def this(location: ParseSourceSpan) = this()
}

