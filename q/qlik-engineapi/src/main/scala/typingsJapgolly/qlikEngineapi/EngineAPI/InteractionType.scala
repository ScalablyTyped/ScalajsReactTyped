package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - IT_SCRIPTLINE; the engine returns the statement that will be executed next.
  * - IT_MSGBOX; the engine returns a script execution error message. This type can only be returned if the parameter qInteractOnError was set to true when calling the ConfigureReload method.
  * - IT_BREAK; the engine breaks and waits for a response on what to do next.
  * - IT_END; the engine has finished to execute all statements in the script.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_SCRIPTLINE
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_MSGBOX
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_BREAK
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_END
*/
trait InteractionType extends js.Object

object InteractionType {
  @scala.inline
  def IT_BREAK: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_BREAK = this.cast("IT_BREAK")
  @scala.inline
  def IT_END: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_END = this.cast("IT_END")
  @scala.inline
  def IT_MSGBOX: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_MSGBOX = this.cast("IT_MSGBOX")
  @scala.inline
  def IT_SCRIPTLINE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.IT_SCRIPTLINE = this.cast("IT_SCRIPTLINE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

