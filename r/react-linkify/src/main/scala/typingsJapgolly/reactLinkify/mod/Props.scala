package typingsJapgolly.reactLinkify.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: Node
  /**
    * Custom anchor tag creator
    * Default to using exisint <a> tag with the provided href={decoratedHref}, key={key}
    * and children={decoratedText}, without additional styling
    */
  var componentDecorator: js.UndefOr[
    js.Function3[/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double, Node]
  ] = js.undefined
  /**
    * Custom href decorator or mapper on the matched (url) href
    * Default to no transformation
    */
  var hrefDecorator: js.UndefOr[js.Function1[/* urlHref */ String, String]] = js.undefined
  /**
    * Custom matcher for (url), that returns each match with the matching information
    * Default to https://github.com/markdown-it/linkify-it's LinkifyIt().tlds(tlds).match
    */
  var matchDecorator: js.UndefOr[js.Function1[/* text */ String, js.Array[MatchInfo] | Null]] = js.undefined
  /**
    * Custom text decorator or mapper on the matched (url) text
    * Default to no transformation
    */
  var textDecorator: js.UndefOr[js.Function1[/* urlText */ String, String]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: VdomNode = null,
    componentDecorator: (/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double) => CallbackTo[Node] = null,
    hrefDecorator: /* urlHref */ String => CallbackTo[String] = null,
    matchDecorator: /* text */ String => CallbackTo[js.Array[MatchInfo] | Null] = null,
    textDecorator: /* urlText */ String => CallbackTo[String] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (componentDecorator != null) __obj.updateDynamic("componentDecorator")(js.Any.fromFunction3((t0: /* decoratedHref */ java.lang.String, t1: /* decoratedText */ java.lang.String, t2: /* key */ scala.Double) => componentDecorator(t0, t1, t2).runNow()))
    if (hrefDecorator != null) __obj.updateDynamic("hrefDecorator")(js.Any.fromFunction1((t0: /* urlHref */ java.lang.String) => hrefDecorator(t0).runNow()))
    if (matchDecorator != null) __obj.updateDynamic("matchDecorator")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => matchDecorator(t0).runNow()))
    if (textDecorator != null) __obj.updateDynamic("textDecorator")(js.Any.fromFunction1((t0: /* urlText */ java.lang.String) => textDecorator(t0).runNow()))
    __obj.asInstanceOf[Props]
  }
}

