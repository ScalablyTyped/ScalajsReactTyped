package typingsJapgolly.rrule.cacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rrule.rruleStrings.before
  - typingsJapgolly.rrule.rruleStrings.after
  - typingsJapgolly.rrule.rruleStrings.between
*/
trait CacheKeys extends js.Object

object CacheKeys {
  @scala.inline
  def after: typingsJapgolly.rrule.rruleStrings.after = this.cast("after")
  @scala.inline
  def before: typingsJapgolly.rrule.rruleStrings.before = this.cast("before")
  @scala.inline
  def between: typingsJapgolly.rrule.rruleStrings.between = this.cast("between")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

