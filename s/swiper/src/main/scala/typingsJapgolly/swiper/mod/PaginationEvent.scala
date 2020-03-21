package typingsJapgolly.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swiper.swiperStrings.paginationRender
  - typingsJapgolly.swiper.swiperStrings.paginationUpdate
*/
trait PaginationEvent extends js.Object

object PaginationEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def paginationRender: typingsJapgolly.swiper.swiperStrings.paginationRender = this.cast("paginationRender")
  @scala.inline
  def paginationUpdate: typingsJapgolly.swiper.swiperStrings.paginationUpdate = this.cast("paginationUpdate")
}

