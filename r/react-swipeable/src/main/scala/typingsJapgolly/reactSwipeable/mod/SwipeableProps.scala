package typingsJapgolly.reactSwipeable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var innerRef: js.UndefOr[js.Function1[/* element */ HTMLElement | Null, Unit]] = js.undefined
  var nodeName: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SwipeableProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    className: String = null,
    innerRef: /* element */ HTMLElement | Null => Callback = null,
    nodeName: String = null,
    style: CSSProperties = null
  ): SwipeableProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1((t0: /* element */ org.scalajs.dom.raw.HTMLElement | scala.Null) => innerRef(t0).runNow()))
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableProps]
  }
}

