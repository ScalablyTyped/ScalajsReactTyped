package typingsJapgolly.wepy

import typingsJapgolly.wepy.wepyStrings.loading
import typingsJapgolly.wepy.wepyStrings.none
import typingsJapgolly.wepy.wepyStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[success | loading | none] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var title: String
}

object AnonIcon {
  @scala.inline
  def apply(
    title: String,
    duration: Int | Double = null,
    icon: success | loading | none = null,
    image: String = null,
    mask: js.UndefOr[Boolean] = js.undefined
  ): AnonIcon = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

