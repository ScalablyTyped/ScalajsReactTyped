package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.cytoscape.mod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimateOptions extends AnimationOptions {
  /** complete - A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** queue - A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[Boolean] = js.undefined
  /** step - A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnimateOptions {
  @scala.inline
  def apply(
    center: CenterOptions = null,
    complete: js.UndefOr[Callback] = js.undefined,
    duration: Int | Double = null,
    easing: TransitionTimingFunction = null,
    fit: AnimationFitOptions = null,
    pan: Position = null,
    panBy: Position = null,
    queue: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Callback] = js.undefined,
    zoom: ZoomOptions = null
  ): AnimateOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (panBy != null) __obj.updateDynamic("panBy")(panBy.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    step.foreach(p => __obj.updateDynamic("step")(p.toJsFn))
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateOptions]
  }
}

