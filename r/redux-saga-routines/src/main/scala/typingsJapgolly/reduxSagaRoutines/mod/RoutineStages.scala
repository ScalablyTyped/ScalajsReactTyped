package typingsJapgolly.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER
  - typingsJapgolly.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST
  - typingsJapgolly.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS
  - typingsJapgolly.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE
  - typingsJapgolly.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL
*/
trait RoutineStages extends js.Object

object RoutineStages {
  @scala.inline
  def FAILURE: typingsJapgolly.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE = this.cast("FAILURE")
  @scala.inline
  def FULFILL: typingsJapgolly.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL = this.cast("FULFILL")
  @scala.inline
  def REQUEST: typingsJapgolly.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST = this.cast("REQUEST")
  @scala.inline
  def SUCCESS: typingsJapgolly.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  def TRIGGER: typingsJapgolly.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER = this.cast("TRIGGER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

