package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.i18nAstMod.Node
import typingsJapgolly.angularCompiler.r3AstMod.TextAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TmplAstContent")
@js.native
class TmplAstContent protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.TmplAstContent {
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    selector: String,
    attributes: js.Array[TextAttribute],
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

