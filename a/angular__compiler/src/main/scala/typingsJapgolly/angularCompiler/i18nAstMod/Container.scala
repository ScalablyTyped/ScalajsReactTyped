package typingsJapgolly.angularCompiler.i18nAstMod

import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/i18n_ast", "Container")
@js.native
class Container protected () extends Node {
  def this(children: js.Array[Node], sourceSpan: ParseSourceSpan) = this()
  var children: js.Array[Node] = js.native
}

