package typingsJapgolly.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.alexaSdk.alexaSdkStrings.STARTED
  - typingsJapgolly.alexaSdk.alexaSdkStrings.IN_PROGRESS
  - typingsJapgolly.alexaSdk.alexaSdkStrings.COMPLETED
*/
trait DialogStates extends js.Object

object DialogStates {
  @scala.inline
  def COMPLETED: typingsJapgolly.alexaSdk.alexaSdkStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def IN_PROGRESS: typingsJapgolly.alexaSdk.alexaSdkStrings.IN_PROGRESS = this.cast("IN_PROGRESS")
  @scala.inline
  def STARTED: typingsJapgolly.alexaSdk.alexaSdkStrings.STARTED = this.cast("STARTED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

