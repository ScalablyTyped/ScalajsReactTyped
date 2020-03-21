package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimateOpts extends js.Object {
  /** This is called when the animation is complete.
  	 * @param value the final value of the animation
  	 */
  var complete: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /** The duration for the transition in milliseconds. */
  var duration: js.UndefOr[Double] = js.undefined
  /** An easing name e.g. 'ease' or an easing function. */
  var easing: js.UndefOr[String | Easing] = js.undefined
  /** An interpolator name or function. */
  var interpolator: js.UndefOr[String | Interpolator] = js.undefined
  /** This is called when an animation frame is applied.
  	 * @param time the current time code as a number between 0 and 1
  	 * @param value the value computed for the current time code
  	 */
  var step: js.UndefOr[js.Function2[/* time */ Double, /* value */ js.Any, Unit]] = js.undefined
}

object AnimateOpts {
  @scala.inline
  def apply(
    complete: /* value */ js.Any => Callback = null,
    duration: Int | Double = null,
    easing: String | Easing = null,
    interpolator: String | Interpolator = null,
    step: (/* time */ Double, /* value */ js.Any) => Callback = null
  ): AnimateOpts = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* value */ js.Any) => complete(t0).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (interpolator != null) __obj.updateDynamic("interpolator")(interpolator.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction2((t0: /* time */ scala.Double, t1: /* value */ js.Any) => step(t0, t1).runNow()))
    __obj.asInstanceOf[AnimateOpts]
  }
}

