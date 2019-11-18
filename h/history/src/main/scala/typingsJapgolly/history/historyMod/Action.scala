package typingsJapgolly.history.historyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.history.historyStrings.PUSH
  - typings.history.historyStrings.POP
  - typings.history.historyStrings.REPLACE
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def POP: typingsJapgolly.history.historyStrings.POP = this.cast("POP")
  @scala.inline
  def PUSH: typingsJapgolly.history.historyStrings.PUSH = this.cast("PUSH")
  @scala.inline
  def REPLACE: typingsJapgolly.history.historyStrings.REPLACE = this.cast("REPLACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

