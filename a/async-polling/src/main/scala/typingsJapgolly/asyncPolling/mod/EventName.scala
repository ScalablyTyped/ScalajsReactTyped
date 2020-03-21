package typingsJapgolly.asyncPolling.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.asyncPolling.asyncPollingStrings.run
  - typingsJapgolly.asyncPolling.asyncPollingStrings.start
  - typingsJapgolly.asyncPolling.asyncPollingStrings.error
  - typingsJapgolly.asyncPolling.asyncPollingStrings.result
  - typingsJapgolly.asyncPolling.asyncPollingStrings.end
  - typingsJapgolly.asyncPolling.asyncPollingStrings.schedule
  - typingsJapgolly.asyncPolling.asyncPollingStrings.stop
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typingsJapgolly.asyncPolling.asyncPollingStrings.end = this.cast("end")
  @scala.inline
  def error: typingsJapgolly.asyncPolling.asyncPollingStrings.error = this.cast("error")
  @scala.inline
  def result: typingsJapgolly.asyncPolling.asyncPollingStrings.result = this.cast("result")
  @scala.inline
  def run: typingsJapgolly.asyncPolling.asyncPollingStrings.run = this.cast("run")
  @scala.inline
  def schedule: typingsJapgolly.asyncPolling.asyncPollingStrings.schedule = this.cast("schedule")
  @scala.inline
  def start: typingsJapgolly.asyncPolling.asyncPollingStrings.start = this.cast("start")
  @scala.inline
  def stop: typingsJapgolly.asyncPolling.asyncPollingStrings.stop = this.cast("stop")
}

