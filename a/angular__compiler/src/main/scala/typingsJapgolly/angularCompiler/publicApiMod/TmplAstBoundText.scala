package typingsJapgolly.angularCompiler.publicApiMod

import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TmplAstBoundText")
@js.native
class TmplAstBoundText protected ()
  extends typingsJapgolly.angularCompiler.srcCompilerMod.TmplAstBoundText {
  def this(
    value: typingsJapgolly.angularCompiler.astMod.AST,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    value: typingsJapgolly.angularCompiler.astMod.AST,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    value: typingsJapgolly.angularCompiler.astMod.AST,
    sourceSpan: typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    i18n: Node
  ) = this()
}

