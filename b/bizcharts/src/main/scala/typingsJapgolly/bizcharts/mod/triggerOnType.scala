package typingsJapgolly.bizcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bizcharts.bizchartsStrings.mousemove
  - typingsJapgolly.bizcharts.bizchartsStrings.click
  - typingsJapgolly.bizcharts.bizchartsStrings.none
*/
trait triggerOnType extends js.Object

object triggerOnType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def click: typingsJapgolly.bizcharts.bizchartsStrings.click = this.cast("click")
  @scala.inline
  def mousemove: typingsJapgolly.bizcharts.bizchartsStrings.mousemove = this.cast("mousemove")
  @scala.inline
  def none: typingsJapgolly.bizcharts.bizchartsStrings.none = this.cast("none")
}

