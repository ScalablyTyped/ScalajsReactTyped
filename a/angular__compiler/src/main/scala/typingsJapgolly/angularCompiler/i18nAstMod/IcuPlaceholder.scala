package typingsJapgolly.angularCompiler.i18nAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/i18n_ast", "IcuPlaceholder")
@js.native
class IcuPlaceholder protected () extends Node {
  def this(value: Icu, name: String, sourceSpan: ParseSourceSpan) = this()
  var name: String = js.native
  var value: Icu = js.native
}

