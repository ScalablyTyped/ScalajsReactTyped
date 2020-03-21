package typingsJapgolly.markdownIt.parserInlineMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.markdownIt.libMod.MarkdownIt
import typingsJapgolly.markdownIt.libMod.RulerInline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserInline extends js.Object {
  var ruler: RulerInline
  var ruler2: RulerInline
  def parse(
    src: String,
    md: MarkdownIt,
    env: js.Any,
    outTokens: js.Array[typingsJapgolly.markdownIt.tokenMod.^]
  ): Unit
  def skipToken(state: typingsJapgolly.markdownIt.stateCoreMod.^): Unit
  def tokenize(state: typingsJapgolly.markdownIt.stateCoreMod.^): Unit
}

object ParserInline {
  @scala.inline
  def apply(
    parse: (String, MarkdownIt, js.Any, js.Array[typingsJapgolly.markdownIt.tokenMod.^]) => Callback,
    ruler: RulerInline,
    ruler2: RulerInline,
    skipToken: typingsJapgolly.markdownIt.stateCoreMod.^ => Callback,
    tokenize: typingsJapgolly.markdownIt.stateCoreMod.^ => Callback
  ): ParserInline = {
    val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.markdownIt.libMod.MarkdownIt, t2: js.Any, t3: js.Array[typingsJapgolly.markdownIt.tokenMod.^]) => parse(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("skipToken")(js.Any.fromFunction1((t0: typingsJapgolly.markdownIt.stateCoreMod.^) => skipToken(t0).runNow()))
    __obj.updateDynamic("tokenize")(js.Any.fromFunction1((t0: typingsJapgolly.markdownIt.stateCoreMod.^) => tokenize(t0).runNow()))
    __obj.asInstanceOf[ParserInline]
  }
}

