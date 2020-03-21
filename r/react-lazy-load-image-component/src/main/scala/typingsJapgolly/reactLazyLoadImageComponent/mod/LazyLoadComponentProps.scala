package typingsJapgolly.reactLazyLoadImageComponent.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyLoadComponentProps extends CommonProps {
  var children: Node
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LazyLoadComponentProps {
  @scala.inline
  def apply(
    afterLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    beforeLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    children: VdomNode = null,
    delayMethod: DelayMethod = null,
    delayTime: Int | Double = null,
    placeholder: VdomElement = null,
    scrollPosition: ScrollPosition = null,
    style: CSSProperties = null,
    threshold: Int | Double = null,
    useIntersectionObserver: js.UndefOr[Boolean] = js.undefined,
    visibleByDefault: js.UndefOr[Boolean] = js.undefined
  ): LazyLoadComponentProps = {
    val __obj = js.Dynamic.literal()
    afterLoad.foreach(p => __obj.updateDynamic("afterLoad")(p.toJsFn))
    beforeLoad.foreach(p => __obj.updateDynamic("beforeLoad")(p.toJsFn))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (delayMethod != null) __obj.updateDynamic("delayMethod")(delayMethod.asInstanceOf[js.Any])
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.rawElement.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntersectionObserver)) __obj.updateDynamic("useIntersectionObserver")(useIntersectionObserver.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleByDefault)) __obj.updateDynamic("visibleByDefault")(visibleByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLoadComponentProps]
  }
}

