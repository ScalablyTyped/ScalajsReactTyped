package typingsJapgolly.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swiper.swiperStrings.lazyImageLoad
  - typingsJapgolly.swiper.swiperStrings.lazyImageReady
*/
trait LazyLoadingEvent extends js.Object

object LazyLoadingEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lazyImageLoad: typingsJapgolly.swiper.swiperStrings.lazyImageLoad = this.cast("lazyImageLoad")
  @scala.inline
  def lazyImageReady: typingsJapgolly.swiper.swiperStrings.lazyImageReady = this.cast("lazyImageReady")
}

