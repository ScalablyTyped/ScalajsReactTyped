package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.auto
  - typingsJapgolly.std.stdStrings.ltr
  - typingsJapgolly.std.stdStrings.rtl
*/
trait NotificationDirection extends js.Object

object NotificationDirection {
  @scala.inline
  def auto: typingsJapgolly.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ltr: typingsJapgolly.std.stdStrings.ltr = this.cast("ltr")
  @scala.inline
  def rtl: typingsJapgolly.std.stdStrings.rtl = this.cast("rtl")
}

