package typingsJapgolly.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCropbottom extends js.Object {
  var crop_bottom: Double
  var crop_left: Double
  var crop_right: Double
  var crop_top: Double
}

object AnonCropbottom {
  @scala.inline
  def apply(crop_bottom: Double, crop_left: Double, crop_right: Double, crop_top: Double): AnonCropbottom = {
    val __obj = js.Dynamic.literal(crop_bottom = crop_bottom.asInstanceOf[js.Any], crop_left = crop_left.asInstanceOf[js.Any], crop_right = crop_right.asInstanceOf[js.Any], crop_top = crop_top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCropbottom]
  }
}

