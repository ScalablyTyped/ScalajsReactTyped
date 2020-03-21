package typingsJapgolly.markdownIt.parserBlockMod

import typingsJapgolly.markdownIt.libMod.MarkdownIt
import typingsJapgolly.markdownIt.libMod.RulerBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib/parser_block", JSImport.Namespace)
@js.native
class ^ () extends ParserBlock {
  /* CompleteClass */
  override var ruler: RulerBlock = js.native
  /* CompleteClass */
  override def parse(
    src: String,
    md: MarkdownIt,
    env: js.Any,
    outTokens: js.Array[typingsJapgolly.markdownIt.tokenMod.^]
  ): Unit = js.native
}

