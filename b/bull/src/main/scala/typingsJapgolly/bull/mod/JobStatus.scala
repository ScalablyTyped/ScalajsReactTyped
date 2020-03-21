package typingsJapgolly.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bull.bullStrings.completed
  - typingsJapgolly.bull.bullStrings.waiting
  - typingsJapgolly.bull.bullStrings.active
  - typingsJapgolly.bull.bullStrings.delayed
  - typingsJapgolly.bull.bullStrings.failed
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def active: typingsJapgolly.bull.bullStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsJapgolly.bull.bullStrings.completed = this.cast("completed")
  @scala.inline
  def delayed: typingsJapgolly.bull.bullStrings.delayed = this.cast("delayed")
  @scala.inline
  def failed: typingsJapgolly.bull.bullStrings.failed = this.cast("failed")
  @scala.inline
  def waiting: typingsJapgolly.bull.bullStrings.waiting = this.cast("waiting")
}

