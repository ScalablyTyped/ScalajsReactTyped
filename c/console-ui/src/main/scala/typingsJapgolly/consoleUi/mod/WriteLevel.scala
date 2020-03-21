package typingsJapgolly.consoleUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.consoleUi.consoleUiStrings.DEBUG
  - typingsJapgolly.consoleUi.consoleUiStrings.INFO
  - typingsJapgolly.consoleUi.consoleUiStrings.WARNING
  - typingsJapgolly.consoleUi.consoleUiStrings.ERROR
*/
trait WriteLevel extends js.Object

object WriteLevel {
  @scala.inline
  def DEBUG: typingsJapgolly.consoleUi.consoleUiStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typingsJapgolly.consoleUi.consoleUiStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typingsJapgolly.consoleUi.consoleUiStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARNING: typingsJapgolly.consoleUi.consoleUiStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

