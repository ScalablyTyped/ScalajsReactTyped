package typingsJapgolly.progressjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressJsOptions extends js.Object {
  /**
    * to consider CSS3 transitions in events
    */
  var considerTransition: js.UndefOr[Boolean] = js.undefined
  /**
    * overlay mode makes an overlay layer in the target element
    */
  var overlayMode: js.UndefOr[Boolean] = js.undefined
  /**
    * progress bar theme
    */
  var theme: js.UndefOr[String] = js.undefined
}

object ProgressJsOptions {
  @scala.inline
  def apply(
    considerTransition: js.UndefOr[Boolean] = js.undefined,
    overlayMode: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): ProgressJsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(considerTransition)) __obj.updateDynamic("considerTransition")(considerTransition.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayMode)) __obj.updateDynamic("overlayMode")(overlayMode.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressJsOptions]
  }
}

