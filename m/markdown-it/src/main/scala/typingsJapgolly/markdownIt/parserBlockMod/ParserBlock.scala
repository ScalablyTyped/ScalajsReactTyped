package typingsJapgolly.markdownIt.parserBlockMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.markdownIt.libMod.MarkdownIt
import typingsJapgolly.markdownIt.libMod.RulerBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserBlock extends js.Object {
  var ruler: RulerBlock
  def parse(
    src: String,
    md: MarkdownIt,
    env: js.Any,
    outTokens: js.Array[typingsJapgolly.markdownIt.tokenMod.^]
  ): Unit
}

object ParserBlock {
  @scala.inline
  def apply(
    parse: (String, MarkdownIt, js.Any, js.Array[typingsJapgolly.markdownIt.tokenMod.^]) => Callback,
    ruler: RulerBlock
  ): ParserBlock = {
    val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.markdownIt.libMod.MarkdownIt, t2: js.Any, t3: js.Array[typingsJapgolly.markdownIt.tokenMod.^]) => parse(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ParserBlock]
  }
}

