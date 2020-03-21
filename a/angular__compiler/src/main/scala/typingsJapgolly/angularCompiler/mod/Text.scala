package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Text")
@js.native
class Text protected ()
  extends typingsJapgolly.angularCompiler.publicApiMod.Text {
  def this(value: String, sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    value: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    value: String,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

