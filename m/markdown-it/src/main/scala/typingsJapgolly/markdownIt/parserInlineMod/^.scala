package typingsJapgolly.markdownIt.parserInlineMod

import typingsJapgolly.markdownIt.libMod.MarkdownIt
import typingsJapgolly.markdownIt.libMod.RulerInline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/parser_inline", JSImport.Namespace)
@js.native
class ^ () extends ParserInline {
  /* CompleteClass */
  override var ruler: RulerInline = js.native
  /* CompleteClass */
  override var ruler2: RulerInline = js.native
  /* CompleteClass */
  override def parse(
    src: String,
    md: MarkdownIt,
    env: js.Any,
    outTokens: js.Array[typingsJapgolly.markdownIt.tokenMod.^]
  ): Unit = js.native
  /* CompleteClass */
  override def skipToken(state: typingsJapgolly.markdownIt.stateCoreMod.^): Unit = js.native
  /* CompleteClass */
  override def tokenize(state: typingsJapgolly.markdownIt.stateCoreMod.^): Unit = js.native
}

