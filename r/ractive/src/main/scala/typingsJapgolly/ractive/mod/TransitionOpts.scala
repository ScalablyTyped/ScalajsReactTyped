package typingsJapgolly.ractive.mod

import typingsJapgolly.ractive.ractiveStrings.fast
import typingsJapgolly.ractive.ractiveStrings.slow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionOpts extends js.Object {
  /** The delay in milliseconds to wait before triggering the transition. */
  var delay: js.UndefOr[Double] = js.undefined
  /** The duration for the transition in milliseconds, slow for 600ms, fast for 200ms, and any other string for 400ms. */
  var duration: js.UndefOr[Double | slow | fast | String] = js.undefined
  /** The easing to use for the transition. */
  var easing: js.UndefOr[String] = js.undefined
}

object TransitionOpts {
  @scala.inline
  def apply(delay: Int | Double = null, duration: Double | slow | fast | String = null, easing: String = null): TransitionOpts = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOpts]
  }
}

