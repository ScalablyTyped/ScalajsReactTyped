package typingsJapgolly.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderStyle extends js.Object {
  var lowerTrackColor: js.UndefOr[String] = js.undefined
  var upperTrackColor: js.UndefOr[String] = js.undefined
}

object SliderStyle {
  @scala.inline
  def apply(lowerTrackColor: String = null, upperTrackColor: String = null): SliderStyle = {
    val __obj = js.Dynamic.literal()
    if (lowerTrackColor != null) __obj.updateDynamic("lowerTrackColor")(lowerTrackColor.asInstanceOf[js.Any])
    if (upperTrackColor != null) __obj.updateDynamic("upperTrackColor")(upperTrackColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStyle]
  }
}

