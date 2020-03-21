package typingsJapgolly.zoneJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Task type: `notScheduled`, `scheduling`, `scheduled`, `running`, `canceling`, 'unknown'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.zoneJs.zoneJsStrings.notScheduled
  - typingsJapgolly.zoneJs.zoneJsStrings.scheduling
  - typingsJapgolly.zoneJs.zoneJsStrings.scheduled
  - typingsJapgolly.zoneJs.zoneJsStrings.running
  - typingsJapgolly.zoneJs.zoneJsStrings.canceling
  - typingsJapgolly.zoneJs.zoneJsStrings.unknown
*/
trait TaskState extends js.Object

object TaskState {
  @scala.inline
  def canceling: typingsJapgolly.zoneJs.zoneJsStrings.canceling = this.cast("canceling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notScheduled: typingsJapgolly.zoneJs.zoneJsStrings.notScheduled = this.cast("notScheduled")
  @scala.inline
  def running: typingsJapgolly.zoneJs.zoneJsStrings.running = this.cast("running")
  @scala.inline
  def scheduled: typingsJapgolly.zoneJs.zoneJsStrings.scheduled = this.cast("scheduled")
  @scala.inline
  def scheduling: typingsJapgolly.zoneJs.zoneJsStrings.scheduling = this.cast("scheduling")
  @scala.inline
  def unknown: typingsJapgolly.zoneJs.zoneJsStrings.unknown = this.cast("unknown")
}

