package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.beforebegin
  - typingsJapgolly.std.stdStrings.afterbegin
  - typingsJapgolly.std.stdStrings.beforeend
  - typingsJapgolly.std.stdStrings.afterend
*/
trait InsertPosition extends js.Object

object InsertPosition {
  @scala.inline
  def afterbegin: typingsJapgolly.std.stdStrings.afterbegin = this.cast("afterbegin")
  @scala.inline
  def afterend: typingsJapgolly.std.stdStrings.afterend = this.cast("afterend")
  @scala.inline
  def beforebegin: typingsJapgolly.std.stdStrings.beforebegin = this.cast("beforebegin")
  @scala.inline
  def beforeend: typingsJapgolly.std.stdStrings.beforeend = this.cast("beforeend")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

