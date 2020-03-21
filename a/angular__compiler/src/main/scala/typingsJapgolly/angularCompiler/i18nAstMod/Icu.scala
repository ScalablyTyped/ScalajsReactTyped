package typingsJapgolly.angularCompiler.i18nAstMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/i18n_ast", "Icu")
@js.native
class Icu protected () extends Node {
  def this(expression: String, `type`: String, cases: StringDictionary[Node], sourceSpan: ParseSourceSpan) = this()
  var cases: StringDictionary[Node] = js.native
  var expression: String = js.native
  var expressionPlaceholder: String = js.native
  var `type`: String = js.native
}

