package typingsJapgolly.reactNativeSwiper.mod

import typingsJapgolly.reactNativeSwiper.AnonX
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.x
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiperState extends js.Object {
  var autoplayEnd: Boolean
  var dir: x | y
  var height: Double
  var index: Double
  var isScrolling: Boolean
  var loopJump: Boolean
  var offset: AnonX
  var total: Double
  var width: Double
}

object SwiperState {
  @scala.inline
  def apply(
    autoplayEnd: Boolean,
    dir: x | y,
    height: Double,
    index: Double,
    isScrolling: Boolean,
    loopJump: Boolean,
    offset: AnonX,
    total: Double,
    width: Double
  ): SwiperState = {
    val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], loopJump = loopJump.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SwiperState]
  }
}

