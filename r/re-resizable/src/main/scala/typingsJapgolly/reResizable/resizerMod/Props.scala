package typingsJapgolly.reResizable.resizerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: Node
  var className: js.UndefOr[String] = js.undefined
  var direction: Direction
  var onResizeStart: OnStartCallback
  var replaceStyles: js.UndefOr[CSSProperties] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    direction: Direction,
    onResizeStart: (/* e */ ReactMouseEventFrom[HTMLDivElement] | ReactTouchEventFrom[HTMLDivElement], /* dir */ Direction) => Callback,
    children: VdomNode = null,
    className: String = null,
    replaceStyles: CSSProperties = null
  ): Props = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.updateDynamic("onResizeStart")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement] | japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement], t1: /* dir */ typingsJapgolly.reResizable.resizerMod.Direction) => onResizeStart(t0, t1).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (replaceStyles != null) __obj.updateDynamic("replaceStyles")(replaceStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

