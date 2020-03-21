package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.fundamentalReact.iconMod.IconSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLink extends js.Object {
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[Node] = js.undefined
  var size: js.UndefOr[IconSize] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonLink {
  @scala.inline
  def apply(
    callback: /* repeated */ js.Any => Callback = null,
    glyph: String = null,
    link: String = null,
    name: VdomNode = null,
    size: IconSize = null,
    url: String = null
  ): AnonLink = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => callback(t0).runNow()))
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.rawNode.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLink]
  }
}

