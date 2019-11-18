package typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod

import typingsJapgolly.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typingsJapgolly.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typingsJapgolly.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundText")
@js.native
class BoundText protected () extends Node {
  def this(value: AST, sourceSpan: ParseSourceSpan) = this()
  def this(value: AST, sourceSpan: ParseSourceSpan, i18n: Message) = this()
  def this(
    value: AST,
    sourceSpan: ParseSourceSpan,
    i18n: typingsJapgolly.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typingsJapgolly.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node] = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: AST = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

