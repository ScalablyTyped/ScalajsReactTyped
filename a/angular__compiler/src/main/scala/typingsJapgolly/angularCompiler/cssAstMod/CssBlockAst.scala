package typingsJapgolly.angularCompiler.cssAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssBlockAst")
@js.native
class CssBlockAst protected () extends CssAst {
  def this(location: ParseSourceSpan, entries: js.Array[CssAst]) = this()
  var entries: js.Array[CssAst] = js.native
}

