package typingsJapgolly.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeResque.nodeResqueStrings.start
  - typingsJapgolly.nodeResque.nodeResqueStrings.end
  - typingsJapgolly.nodeResque.nodeResqueStrings.cleaning_worker
  - typingsJapgolly.nodeResque.nodeResqueStrings.poll
  - typingsJapgolly.nodeResque.nodeResqueStrings.ping
  - typingsJapgolly.nodeResque.nodeResqueStrings.job
  - typingsJapgolly.nodeResque.nodeResqueStrings.reEnqueue
  - typingsJapgolly.nodeResque.nodeResqueStrings.success
  - typingsJapgolly.nodeResque.nodeResqueStrings.failure
  - typingsJapgolly.nodeResque.nodeResqueStrings.error
  - typingsJapgolly.nodeResque.nodeResqueStrings.pause
*/
trait WorkerEvent extends js.Object

object WorkerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cleaning_worker: typingsJapgolly.nodeResque.nodeResqueStrings.cleaning_worker = this.cast("cleaning_worker")
  @scala.inline
  def end: typingsJapgolly.nodeResque.nodeResqueStrings.end = this.cast("end")
  @scala.inline
  def error: typingsJapgolly.nodeResque.nodeResqueStrings.error = this.cast("error")
  @scala.inline
  def failure: typingsJapgolly.nodeResque.nodeResqueStrings.failure = this.cast("failure")
  @scala.inline
  def job: typingsJapgolly.nodeResque.nodeResqueStrings.job = this.cast("job")
  @scala.inline
  def pause: typingsJapgolly.nodeResque.nodeResqueStrings.pause = this.cast("pause")
  @scala.inline
  def ping: typingsJapgolly.nodeResque.nodeResqueStrings.ping = this.cast("ping")
  @scala.inline
  def poll: typingsJapgolly.nodeResque.nodeResqueStrings.poll = this.cast("poll")
  @scala.inline
  def reEnqueue: typingsJapgolly.nodeResque.nodeResqueStrings.reEnqueue = this.cast("reEnqueue")
  @scala.inline
  def start: typingsJapgolly.nodeResque.nodeResqueStrings.start = this.cast("start")
  @scala.inline
  def success: typingsJapgolly.nodeResque.nodeResqueStrings.success = this.cast("success")
}

