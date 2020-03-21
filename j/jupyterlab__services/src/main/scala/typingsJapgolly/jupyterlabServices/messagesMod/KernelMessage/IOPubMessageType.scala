package typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IOPub message types.
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, debug message types are *NOT*
  * considered part of the public API, and may change without notice.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.clear_output
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_close
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_msg
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_open
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.display_data
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.error
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_input
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_result
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.status
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stream
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.update_display_data
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_event
*/
trait IOPubMessageType extends js.Object

object IOPubMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear_output: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.clear_output = this.cast("clear_output")
  @scala.inline
  def comm_close: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_close = this.cast("comm_close")
  @scala.inline
  def comm_msg: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_msg = this.cast("comm_msg")
  @scala.inline
  def comm_open: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_open = this.cast("comm_open")
  @scala.inline
  def debug_event: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_event = this.cast("debug_event")
  @scala.inline
  def display_data: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.display_data = this.cast("display_data")
  @scala.inline
  def error: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.error = this.cast("error")
  @scala.inline
  def execute_input: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_input = this.cast("execute_input")
  @scala.inline
  def execute_result: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_result = this.cast("execute_result")
  @scala.inline
  def status: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.status = this.cast("status")
  @scala.inline
  def stream: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stream = this.cast("stream")
  @scala.inline
  def update_display_data: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.update_display_data = this.cast("update_display_data")
}

