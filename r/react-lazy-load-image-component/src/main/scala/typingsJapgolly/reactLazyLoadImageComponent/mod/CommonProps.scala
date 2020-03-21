package typingsJapgolly.reactLazyLoadImageComponent.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  /** Function called after the image has been completely loaded. */
  var afterLoad: js.UndefOr[js.Function0[_]] = js.undefined
  /** Function called right before the placeholder is replaced with the image element. */
  var beforeLoad: js.UndefOr[js.Function0[_]] = js.undefined
  /* Method from lodash to use to delay the scroll/resize events. */
  var delayMethod: js.UndefOr[DelayMethod] = js.undefined
  /** Time in ms sent to the delayMethod. */
  var delayTime: js.UndefOr[Double] = js.undefined
  /** React element to use as a placeholder. Default is <span>. */
  var placeholder: js.UndefOr[Element | Null] = js.undefined
  /** See trackWindowScroll(). */
  var scrollPosition: js.UndefOr[ScrollPosition] = js.undefined
  /** Threshold in pixels. So the image starts loading before it appears in the viewport. */
  var threshold: js.UndefOr[Double] = js.undefined
  /** Whether to use browser's IntersectionObserver when available. */
  var useIntersectionObserver: js.UndefOr[Boolean] = js.undefined
  /** Whether the image must be visible from the beginning. */
  var visibleByDefault: js.UndefOr[Boolean] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    afterLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    beforeLoad: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    delayMethod: DelayMethod = null,
    delayTime: Int | Double = null,
    placeholder: VdomElement = null,
    scrollPosition: ScrollPosition = null,
    threshold: Int | Double = null,
    useIntersectionObserver: js.UndefOr[Boolean] = js.undefined,
    visibleByDefault: js.UndefOr[Boolean] = js.undefined
  ): CommonProps = {
    val __obj = js.Dynamic.literal()
    afterLoad.foreach(p => __obj.updateDynamic("afterLoad")(p.toJsFn))
    beforeLoad.foreach(p => __obj.updateDynamic("beforeLoad")(p.toJsFn))
    if (delayMethod != null) __obj.updateDynamic("delayMethod")(delayMethod.asInstanceOf[js.Any])
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.rawElement.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntersectionObserver)) __obj.updateDynamic("useIntersectionObserver")(useIntersectionObserver.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleByDefault)) __obj.updateDynamic("visibleByDefault")(visibleByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps]
  }
}

