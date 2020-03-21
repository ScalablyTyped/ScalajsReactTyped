package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.center
  - typingsJapgolly.std.stdStrings.end
  - typingsJapgolly.std.stdStrings.start
*/
trait LineAlignSetting extends js.Object

object LineAlignSetting {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsJapgolly.std.stdStrings.center = this.cast("center")
  @scala.inline
  def end: typingsJapgolly.std.stdStrings.end = this.cast("end")
  @scala.inline
  def start: typingsJapgolly.std.stdStrings.start = this.cast("start")
}

