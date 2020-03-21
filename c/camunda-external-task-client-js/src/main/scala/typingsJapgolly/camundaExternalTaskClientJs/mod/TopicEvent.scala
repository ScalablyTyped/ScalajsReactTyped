package typingsJapgolly.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.subscribe
  - typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unsubscribe
*/
trait TopicEvent extends js.Object

object TopicEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def subscribe: typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.subscribe = this.cast("subscribe")
  @scala.inline
  def unsubscribe: typingsJapgolly.camundaExternalTaskClientJs.camundaExternalTaskClientJsStrings.unsubscribe = this.cast("unsubscribe")
}

