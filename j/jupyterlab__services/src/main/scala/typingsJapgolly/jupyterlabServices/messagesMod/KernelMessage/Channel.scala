package typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid Jupyter channel names in a message to a frontend.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.control
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdin
*/
trait Channel extends js.Object

object Channel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def control: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.control = this.cast("control")
  @scala.inline
  def iopub: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub = this.cast("iopub")
  @scala.inline
  def shell: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell = this.cast("shell")
  @scala.inline
  def stdin: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stdin = this.cast("stdin")
}

