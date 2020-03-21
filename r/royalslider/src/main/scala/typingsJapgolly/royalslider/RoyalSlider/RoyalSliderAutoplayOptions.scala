package typingsJapgolly.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderAutoplayOptions extends js.Object {
  /**
    * Delay between items in ms. (default: 300)
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Enable autoplay or not. (default: false)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Pause autoplay on hover. (default: true)
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * Stop autoplay at first user action. (default: true)
    */
  var stopAtAction: js.UndefOr[Boolean] = js.undefined
}

object RoyalSliderAutoplayOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    stopAtAction: js.UndefOr[Boolean] = js.undefined
  ): RoyalSliderAutoplayOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAtAction)) __obj.updateDynamic("stopAtAction")(stopAtAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoyalSliderAutoplayOptions]
  }
}

