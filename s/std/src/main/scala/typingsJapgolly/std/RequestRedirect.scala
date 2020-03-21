package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.error
  - typingsJapgolly.std.stdStrings.follow
  - typingsJapgolly.std.stdStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.std.stdStrings.error = this.cast("error")
  @scala.inline
  def follow: typingsJapgolly.std.stdStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typingsJapgolly.std.stdStrings.manual = this.cast("manual")
}

