package typingsJapgolly.reactLazyload.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyLoadProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var debounce: js.UndefOr[Double | Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var offset: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var once: js.UndefOr[Boolean] = js.undefined
  var overflow: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[Node] = js.undefined
  var preventLoading: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[Boolean] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
  var scrollContainer: js.UndefOr[String | Element] = js.undefined
  var throttle: js.UndefOr[Double | Boolean] = js.undefined
  var unmountIfInvisible: js.UndefOr[Boolean] = js.undefined
}

object LazyLoadProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    debounce: Double | Boolean = null,
    height: Double | String = null,
    offset: Double | js.Array[Double] = null,
    once: js.UndefOr[Boolean] = js.undefined,
    overflow: js.UndefOr[Boolean] = js.undefined,
    placeholder: VdomNode = null,
    preventLoading: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollContainer: String | Element = null,
    throttle: Double | Boolean = null,
    unmountIfInvisible: js.UndefOr[Boolean] = js.undefined
  ): LazyLoadProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(preventLoading)) __obj.updateDynamic("preventLoading")(preventLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollContainer != null) __obj.updateDynamic("scrollContainer")(scrollContainer.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountIfInvisible)) __obj.updateDynamic("unmountIfInvisible")(unmountIfInvisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLoadProps]
  }
}

