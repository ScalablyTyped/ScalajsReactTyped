package typingsJapgolly.atAngularCompiler.atAngularCompilerMod

import typingsJapgolly.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsJapgolly.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Text")
@js.native
class Text protected ()
  extends typingsJapgolly.atAngularCompiler.publicUnderscoreApiMod.Text {
  def this(
    value: String,
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    value: String,
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    value: String,
    sourceSpan: typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

