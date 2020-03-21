package typingsJapgolly.fontfaceobserver.FontFaceObserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontVariant extends js.Object {
  var stretch: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double | String] = js.undefined
}

object FontVariant {
  @scala.inline
  def apply(stretch: String = null, style: String = null, weight: Double | String = null): FontVariant = {
    val __obj = js.Dynamic.literal()
    if (stretch != null) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontVariant]
  }
}

