package typingsJapgolly.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart
  - typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop
*/
trait PollEvent extends js.Object

object PollEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pollColonstart: typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstart = this.cast("poll:start")
  @scala.inline
  def pollColonstop: typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.pollColonstop = this.cast("poll:stop")
}

