package typingsJapgolly.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxTouchOptions extends js.Object {
  /**
    * Continue movement after releasing mouse/touch when panning
    */
  var momentum: js.UndefOr[Boolean] = js.undefined
  /**
    *  Allow to drag content vertically
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object FancyBoxTouchOptions {
  @scala.inline
  def apply(momentum: js.UndefOr[Boolean] = js.undefined, vertical: js.UndefOr[Boolean] = js.undefined): FancyBoxTouchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(momentum)) __obj.updateDynamic("momentum")(momentum.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxTouchOptions]
  }
}

