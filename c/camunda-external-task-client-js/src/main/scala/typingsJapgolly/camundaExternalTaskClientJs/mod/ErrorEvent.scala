package typingsJapgolly.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror
  - typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror
*/
trait ErrorEvent extends js.Object

object ErrorEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completeColonerror: typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.completeColonerror = this.cast("complete:error")
  @scala.inline
  def pollColonerror: typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonerror = this.cast("poll:error")
}

