package typingsJapgolly.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacityUndefined extends js.Object {
  var opacity: js.UndefOr[scala.Nothing] = js.undefined
  var transform: js.Array[AnonTranslateXAnimatedInterpolation]
}

object AnonOpacityUndefined {
  @scala.inline
  def apply(
    transform: js.Array[AnonTranslateXAnimatedInterpolation],
    opacity: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonOpacityUndefined = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacityUndefined]
  }
}

