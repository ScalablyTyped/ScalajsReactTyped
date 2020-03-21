package typingsJapgolly.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object for specifying the animation properties when scrolling the view.
  */
trait ScrollViewAnimationProperties extends js.Object {
  /**
  	 * When set to `true` it will scroll smoothly to the destination.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
}

object ScrollViewAnimationProperties {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined): ScrollViewAnimationProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewAnimationProperties]
  }
}

