package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlyph extends js.Object {
  var callback: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  var glyph: String
  var label: js.UndefOr[String] = js.undefined
  var menu: js.UndefOr[Node] = js.undefined
  var notificationCount: Double
}

object AnonGlyph {
  @scala.inline
  def apply(
    glyph: String,
    notificationCount: Double,
    callback: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    label: String = null,
    menu: VdomNode = null
  ): AnonGlyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], notificationCount = notificationCount.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => callback(t0).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlyph]
  }
}

