package typingsJapgolly.markdownIt.rendererMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.markdownIt.libMod.TokenRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var rules: StringDictionary[TokenRender]
  def render(tokens: js.Array[typingsJapgolly.markdownIt.tokenMod.^], options: js.Any, env: js.Any): String
  def renderAttrs(token: typingsJapgolly.markdownIt.tokenMod.^): String
  def renderInline(tokens: js.Array[typingsJapgolly.markdownIt.tokenMod.^], options: js.Any, env: js.Any): String
  def renderToken(tokens: js.Array[typingsJapgolly.markdownIt.tokenMod.^], idx: Double, options: js.Any): String
}

object Renderer {
  @scala.inline
  def apply(
    render: (js.Array[typingsJapgolly.markdownIt.tokenMod.^], js.Any, js.Any) => CallbackTo[String],
    renderAttrs: typingsJapgolly.markdownIt.tokenMod.^ => CallbackTo[String],
    renderInline: (js.Array[typingsJapgolly.markdownIt.tokenMod.^], js.Any, js.Any) => CallbackTo[String],
    renderToken: (js.Array[typingsJapgolly.markdownIt.tokenMod.^], Double, js.Any) => CallbackTo[String],
    rules: StringDictionary[TokenRender]
  ): Renderer = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction3((t0: js.Array[typingsJapgolly.markdownIt.tokenMod.^], t1: js.Any, t2: js.Any) => render(t0, t1, t2).runNow()))
    __obj.updateDynamic("renderAttrs")(js.Any.fromFunction1((t0: typingsJapgolly.markdownIt.tokenMod.^) => renderAttrs(t0).runNow()))
    __obj.updateDynamic("renderInline")(js.Any.fromFunction3((t0: js.Array[typingsJapgolly.markdownIt.tokenMod.^], t1: js.Any, t2: js.Any) => renderInline(t0, t1, t2).runNow()))
    __obj.updateDynamic("renderToken")(js.Any.fromFunction3((t0: js.Array[typingsJapgolly.markdownIt.tokenMod.^], t1: scala.Double, t2: js.Any) => renderToken(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Renderer]
  }
}

