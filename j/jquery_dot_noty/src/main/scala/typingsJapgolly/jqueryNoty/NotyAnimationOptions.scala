package typingsJapgolly.jqueryNoty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotyAnimationOptions extends js.Object {
  var close: js.UndefOr[js.Any] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[js.Any] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object NotyAnimationOptions {
  @scala.inline
  def apply(close: js.Any = null, easing: String = null, open: js.Any = null, speed: Int | Double = null): NotyAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotyAnimationOptions]
  }
}

