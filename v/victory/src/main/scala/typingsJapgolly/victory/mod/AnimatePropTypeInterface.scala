package typingsJapgolly.victory.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.victory.AnonAfter
import typingsJapgolly.victory.AnonBefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatePropTypeInterface extends js.Object {
  /**
    * Animation duration
    */
  var duration: Double
  /**
    * The easing prop specifies an easing function name to use for tweening.
    * @default "quadInOut"
    */
  var easing: js.UndefOr[AnimationEasing] = js.undefined
  /**
    * Animation end callback
    */
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Animation enter transition configuration
    */
  var onEnter: js.UndefOr[AnonAfter] = js.undefined
  /**
    * Animation exit transition configuration
    */
  var onExit: js.UndefOr[AnonBefore] = js.undefined
  /**
    * Animation load transition configuration
    */
  var onLoad: js.UndefOr[AnonAfter] = js.undefined
}

object AnimatePropTypeInterface {
  @scala.inline
  def apply(
    duration: Double,
    easing: AnimationEasing = null,
    onEnd: js.UndefOr[Callback] = js.undefined,
    onEnter: AnonAfter = null,
    onExit: AnonBefore = null,
    onLoad: AnonAfter = null
  ): AnimatePropTypeInterface = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    onEnd.foreach(p => __obj.updateDynamic("onEnd")(p.toJsFn))
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatePropTypeInterface]
  }
}

