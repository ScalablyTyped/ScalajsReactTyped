package typingsJapgolly.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror
  - typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror
  - typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror
  - typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror
*/
trait ErrorWithTaskEvent extends js.Object

object ErrorWithTaskEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extendLockColonerror: typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.extendLockColonerror = this.cast("extendLock:error")
  @scala.inline
  def handleBpmnErrorColonerror: typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleBpmnErrorColonerror = this.cast("handleBpmnError:error")
  @scala.inline
  def handleFailureColonerror: typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.handleFailureColonerror = this.cast("handleFailure:error")
  @scala.inline
  def unlockColonerror: typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unlockColonerror = this.cast("unlock:error")
}

