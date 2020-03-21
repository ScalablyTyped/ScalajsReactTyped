package typingsJapgolly.wepy

import japgolly.scalajs.react.Callback
import typingsJapgolly.wepy.wxEnhancedMod.LagLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationEnd extends js.Object {
  var autoRotate: Boolean
  var destination: LagLng
  var duration: Double
  var markerId: Double
  def animationEnd(): Unit
}

object AnonAnimationEnd {
  @scala.inline
  def apply(
    animationEnd: Callback,
    autoRotate: Boolean,
    destination: LagLng,
    duration: Double,
    markerId: Double
  ): AnonAnimationEnd = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any])
    __obj.updateDynamic("animationEnd")(animationEnd.toJsFn)
    __obj.asInstanceOf[AnonAnimationEnd]
  }
}

