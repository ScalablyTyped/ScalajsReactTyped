package typingsJapgolly.reactWow.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactWOWProps extends js.Object {
  /**
    * Animation css class.
    * @default animated
    */
  var animateClass: js.UndefOr[String] = js.undefined
  /**
    * Animation name.
    * @see https://daneden.github.io/animate.css/
    */
  var animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any
  /**
    * The callback is fired every time an animation is stoped.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Content you want to apply the animation to.
    */
  var children: Element
  /**
    * Animation delay.
    */
  var delay: js.UndefOr[String] = js.undefined
  /**
    * Disable the animation.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation duration.
    */
  var duration: js.UndefOr[String] = js.undefined
  /**
    * Animation iteration count.
    */
  var iteration: js.UndefOr[String] = js.undefined
  /**
    * Distance to the element when triggering the animation.
    * @default 0
    */
  var offset: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * If your components inside a overflow container, set this to true.
    * @default false
    */
  var overflow: js.UndefOr[Boolean] = js.undefined
  /**
    * Listen and react to resize event.
    * @default true
    */
  var resize: js.UndefOr[Boolean] = js.undefined
  /**
    * Listen and react to scroll event.
    * @default true
    */
  var scroll: js.UndefOr[Boolean] = js.undefined
}

object ReactWOWProps {
  @scala.inline
  def apply(
    animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any,
    children: VdomElement,
    animateClass: String = null,
    callback: js.UndefOr[Callback] = js.undefined,
    delay: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    duration: String = null,
    iteration: String = null,
    offset: Double | js.Array[Double] = null,
    overflow: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined
  ): ReactWOWProps = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (animateClass != null) __obj.updateDynamic("animateClass")(animateClass.asInstanceOf[js.Any])
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (iteration != null) __obj.updateDynamic("iteration")(iteration.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactWOWProps]
  }
}

