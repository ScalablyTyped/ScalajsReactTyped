package typingsJapgolly.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swiper.swiperStrings.autoplayStart
  - typingsJapgolly.swiper.swiperStrings.autoplayStop
  - typingsJapgolly.swiper.swiperStrings.autoplay
*/
trait AutoplayEvent extends js.Object

object AutoplayEvent {
  @scala.inline
  def autoplay: typingsJapgolly.swiper.swiperStrings.autoplay = this.cast("autoplay")
  @scala.inline
  def autoplayStart: typingsJapgolly.swiper.swiperStrings.autoplayStart = this.cast("autoplayStart")
  @scala.inline
  def autoplayStop: typingsJapgolly.swiper.swiperStrings.autoplayStop = this.cast("autoplayStop")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

