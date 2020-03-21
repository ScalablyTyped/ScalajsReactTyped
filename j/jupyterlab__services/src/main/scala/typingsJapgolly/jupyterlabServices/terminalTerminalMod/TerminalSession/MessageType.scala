package typingsJapgolly.jupyterlabServices.terminalTerminalMod.TerminalSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Valid message types for the terminal.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdout
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.disconnect
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.set_size
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdin
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnect: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def set_size: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.set_size = this.cast("set_size")
  @scala.inline
  def stdin: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdin = this.cast("stdin")
  @scala.inline
  def stdout: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdout = this.cast("stdout")
}

