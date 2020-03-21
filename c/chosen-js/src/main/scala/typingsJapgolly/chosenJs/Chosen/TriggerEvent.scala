package typingsJapgolly.chosenJs.Chosen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chosenJs.chosenJsStrings.chosenColonupdated
  - typingsJapgolly.chosenJs.chosenJsStrings.chosenColonactivate
  - typingsJapgolly.chosenJs.chosenJsStrings.chosenColonopen
  - typingsJapgolly.chosenJs.chosenJsStrings.chosenColonclose
*/
trait TriggerEvent extends js.Object

object TriggerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chosenColonactivate: typingsJapgolly.chosenJs.chosenJsStrings.chosenColonactivate = this.cast("chosen:activate")
  @scala.inline
  def chosenColonclose: typingsJapgolly.chosenJs.chosenJsStrings.chosenColonclose = this.cast("chosen:close")
  @scala.inline
  def chosenColonopen: typingsJapgolly.chosenJs.chosenJsStrings.chosenColonopen = this.cast("chosen:open")
  @scala.inline
  def chosenColonupdated: typingsJapgolly.chosenJs.chosenJsStrings.chosenColonupdated = this.cast("chosen:updated")
}

