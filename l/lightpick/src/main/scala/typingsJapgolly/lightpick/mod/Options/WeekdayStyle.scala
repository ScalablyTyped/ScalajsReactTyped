package typingsJapgolly.lightpick.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.lightpick.lightpickStrings.long
  - typingsJapgolly.lightpick.lightpickStrings.short
  - typingsJapgolly.lightpick.lightpickStrings.narrow
*/
trait WeekdayStyle extends js.Object

object WeekdayStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typingsJapgolly.lightpick.lightpickStrings.long = this.cast("long")
  @scala.inline
  def narrow: typingsJapgolly.lightpick.lightpickStrings.narrow = this.cast("narrow")
  @scala.inline
  def short: typingsJapgolly.lightpick.lightpickStrings.short = this.cast("short")
}

