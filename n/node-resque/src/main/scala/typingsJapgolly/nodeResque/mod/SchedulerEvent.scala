package typingsJapgolly.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeResque.nodeResqueStrings.start
  - typingsJapgolly.nodeResque.nodeResqueStrings.end
  - typingsJapgolly.nodeResque.nodeResqueStrings.poll
  - typingsJapgolly.nodeResque.nodeResqueStrings.master
  - typingsJapgolly.nodeResque.nodeResqueStrings.cleanStuckWorker
  - typingsJapgolly.nodeResque.nodeResqueStrings.error
  - typingsJapgolly.nodeResque.nodeResqueStrings.workingTimestamp
  - typingsJapgolly.nodeResque.nodeResqueStrings.transferredJob
*/
trait SchedulerEvent extends js.Object

object SchedulerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cleanStuckWorker: typingsJapgolly.nodeResque.nodeResqueStrings.cleanStuckWorker = this.cast("cleanStuckWorker")
  @scala.inline
  def end: typingsJapgolly.nodeResque.nodeResqueStrings.end = this.cast("end")
  @scala.inline
  def error: typingsJapgolly.nodeResque.nodeResqueStrings.error = this.cast("error")
  @scala.inline
  def master: typingsJapgolly.nodeResque.nodeResqueStrings.master = this.cast("master")
  @scala.inline
  def poll: typingsJapgolly.nodeResque.nodeResqueStrings.poll = this.cast("poll")
  @scala.inline
  def start: typingsJapgolly.nodeResque.nodeResqueStrings.start = this.cast("start")
  @scala.inline
  def transferredJob: typingsJapgolly.nodeResque.nodeResqueStrings.transferredJob = this.cast("transferredJob")
  @scala.inline
  def workingTimestamp: typingsJapgolly.nodeResque.nodeResqueStrings.workingTimestamp = this.cast("workingTimestamp")
}

