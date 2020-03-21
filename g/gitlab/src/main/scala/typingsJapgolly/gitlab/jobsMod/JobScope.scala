package typingsJapgolly.gitlab.jobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gitlab.gitlabStrings.created
  - typingsJapgolly.gitlab.gitlabStrings.pending
  - typingsJapgolly.gitlab.gitlabStrings.running
  - typingsJapgolly.gitlab.gitlabStrings.failed
  - typingsJapgolly.gitlab.gitlabStrings.success
  - typingsJapgolly.gitlab.gitlabStrings.canceled
  - typingsJapgolly.gitlab.gitlabStrings.skipped
  - typingsJapgolly.gitlab.gitlabStrings.manual
*/
trait JobScope extends js.Object

object JobScope {
  @scala.inline
  def canceled: typingsJapgolly.gitlab.gitlabStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def created: typingsJapgolly.gitlab.gitlabStrings.created = this.cast("created")
  @scala.inline
  def failed: typingsJapgolly.gitlab.gitlabStrings.failed = this.cast("failed")
  @scala.inline
  def manual: typingsJapgolly.gitlab.gitlabStrings.manual = this.cast("manual")
  @scala.inline
  def pending: typingsJapgolly.gitlab.gitlabStrings.pending = this.cast("pending")
  @scala.inline
  def running: typingsJapgolly.gitlab.gitlabStrings.running = this.cast("running")
  @scala.inline
  def skipped: typingsJapgolly.gitlab.gitlabStrings.skipped = this.cast("skipped")
  @scala.inline
  def success: typingsJapgolly.gitlab.gitlabStrings.success = this.cast("success")
}

