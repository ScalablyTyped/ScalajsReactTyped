package typingsJapgolly.zoneDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Task type: `notScheduled`, `scheduling`, `scheduled`, `running`, `canceling`, 'unknown'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.zoneDotJs.zoneDotJsStrings.notScheduled
  - typings.zoneDotJs.zoneDotJsStrings.scheduling
  - typings.zoneDotJs.zoneDotJsStrings.scheduled
  - typings.zoneDotJs.zoneDotJsStrings.running
  - typings.zoneDotJs.zoneDotJsStrings.canceling
  - typings.zoneDotJs.zoneDotJsStrings.unknown
*/
trait TaskState extends js.Object

object TaskState {
  @scala.inline
  def canceling: typingsJapgolly.zoneDotJs.zoneDotJsStrings.canceling = this.cast("canceling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notScheduled: typingsJapgolly.zoneDotJs.zoneDotJsStrings.notScheduled = this.cast("notScheduled")
  @scala.inline
  def running: typingsJapgolly.zoneDotJs.zoneDotJsStrings.running = this.cast("running")
  @scala.inline
  def scheduled: typingsJapgolly.zoneDotJs.zoneDotJsStrings.scheduled = this.cast("scheduled")
  @scala.inline
  def scheduling: typingsJapgolly.zoneDotJs.zoneDotJsStrings.scheduling = this.cast("scheduling")
  @scala.inline
  def unknown: typingsJapgolly.zoneDotJs.zoneDotJsStrings.unknown = this.cast("unknown")
}

