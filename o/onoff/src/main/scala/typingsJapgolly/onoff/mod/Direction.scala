package typingsJapgolly.onoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.onoff.onoffStrings.in
  - typingsJapgolly.onoff.onoffStrings.out
  - typingsJapgolly.onoff.onoffStrings.high
  - typingsJapgolly.onoff.onoffStrings.low
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.onoff.onoffStrings.high = this.cast("high")
  @scala.inline
  def in: typingsJapgolly.onoff.onoffStrings.in = this.cast("in")
  @scala.inline
  def low: typingsJapgolly.onoff.onoffStrings.low = this.cast("low")
  @scala.inline
  def out: typingsJapgolly.onoff.onoffStrings.out = this.cast("out")
}

