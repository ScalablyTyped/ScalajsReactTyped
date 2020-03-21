package typingsJapgolly.angularCompiler.r3AstMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Icu")
@js.native
class Icu protected () extends Node {
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[Text | BoundText],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[Text | BoundText],
    sourceSpan: ParseSourceSpan,
    i18n: Message
  ) = this()
  def this(
    vars: StringDictionary[BoundText],
    placeholders: StringDictionary[Text | BoundText],
    sourceSpan: ParseSourceSpan,
    i18n: typingsJapgolly.angularCompiler.i18nAstMod.Node
  ) = this()
  var i18n: js.UndefOr[Message | typingsJapgolly.angularCompiler.i18nAstMod.Node] = js.native
  var placeholders: StringDictionary[Text | BoundText] = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var vars: StringDictionary[BoundText] = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

