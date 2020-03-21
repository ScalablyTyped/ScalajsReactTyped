package typingsJapgolly.onoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.onoff.onoffStrings.none
  - typingsJapgolly.onoff.onoffStrings.rising
  - typingsJapgolly.onoff.onoffStrings.falling
  - typingsJapgolly.onoff.onoffStrings.both
*/
trait Edge extends js.Object

object Edge {
  @scala.inline
  def both: typingsJapgolly.onoff.onoffStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def falling: typingsJapgolly.onoff.onoffStrings.falling = this.cast("falling")
  @scala.inline
  def none: typingsJapgolly.onoff.onoffStrings.none = this.cast("none")
  @scala.inline
  def rising: typingsJapgolly.onoff.onoffStrings.rising = this.cast("rising")
}

