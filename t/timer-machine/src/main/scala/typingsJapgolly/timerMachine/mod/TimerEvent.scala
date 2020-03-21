package typingsJapgolly.timerMachine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.timerMachine.timerMachineStrings.start
  - typingsJapgolly.timerMachine.timerMachineStrings.stop
  - typingsJapgolly.timerMachine.timerMachineStrings.time
*/
trait TimerEvent extends js.Object

object TimerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def start: typingsJapgolly.timerMachine.timerMachineStrings.start = this.cast("start")
  @scala.inline
  def stop: typingsJapgolly.timerMachine.timerMachineStrings.stop = this.cast("stop")
  @scala.inline
  def time: typingsJapgolly.timerMachine.timerMachineStrings.time = this.cast("time")
}

