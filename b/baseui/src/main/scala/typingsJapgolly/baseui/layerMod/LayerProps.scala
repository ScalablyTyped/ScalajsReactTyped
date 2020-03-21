package typingsJapgolly.baseui.layerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerProps extends js.Object {
  var children: Node
  var host: js.UndefOr[HTMLElement] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onMount: js.UndefOr[js.Function0[_]] = js.undefined
  var onUnmount: js.UndefOr[js.Function0[_]] = js.undefined
}

object LayerProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    host: HTMLElement = null,
    index: Int | Double = null,
    mountNode: HTMLElement = null,
    onMount: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onUnmount: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): LayerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    onMount.foreach(p => __obj.updateDynamic("onMount")(p.toJsFn))
    onUnmount.foreach(p => __obj.updateDynamic("onUnmount")(p.toJsFn))
    __obj.asInstanceOf[LayerProps]
  }
}

