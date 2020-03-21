package typingsJapgolly.angularCompiler.srcCompilerMod

import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.i18nAstMod.Node
import typingsJapgolly.angularCompiler.r3AstMod.BoundText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TmplAstBoundText")
@js.native
class TmplAstBoundText protected () extends BoundText {
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

