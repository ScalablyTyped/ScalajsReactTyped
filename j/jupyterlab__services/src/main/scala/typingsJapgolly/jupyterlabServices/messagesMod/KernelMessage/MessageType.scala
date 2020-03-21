package typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Jupyter message types.
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
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_info_reply
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.complete_reply
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.complete_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_reply
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.history_reply
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.history_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.inspect_reply
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.inspect_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.interrupt_reply
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.interrupt_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.is_complete_reply
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.kernel_info_reply
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shutdown_reply
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shutdown_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_reply
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.input_request
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.input_reply
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear_output: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.clear_output = this.cast("clear_output")
  @scala.inline
  def comm_close: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_close = this.cast("comm_close")
  @scala.inline
  def comm_info_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_info_reply = this.cast("comm_info_reply")
  @scala.inline
  def comm_info_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_info_request = this.cast("comm_info_request")
  @scala.inline
  def comm_msg: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_msg = this.cast("comm_msg")
  @scala.inline
  def comm_open: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_open = this.cast("comm_open")
  @scala.inline
  def complete_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.complete_reply = this.cast("complete_reply")
  @scala.inline
  def complete_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.complete_request = this.cast("complete_request")
  @scala.inline
  def debug_event: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_event = this.cast("debug_event")
  @scala.inline
  def debug_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_reply = this.cast("debug_reply")
  @scala.inline
  def debug_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_request = this.cast("debug_request")
  @scala.inline
  def display_data: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.display_data = this.cast("display_data")
  @scala.inline
  def error: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.error = this.cast("error")
  @scala.inline
  def execute_input: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_input = this.cast("execute_input")
  @scala.inline
  def execute_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_reply = this.cast("execute_reply")
  @scala.inline
  def execute_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_request = this.cast("execute_request")
  @scala.inline
  def execute_result: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_result = this.cast("execute_result")
  @scala.inline
  def history_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.history_reply = this.cast("history_reply")
  @scala.inline
  def history_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.history_request = this.cast("history_request")
  @scala.inline
  def input_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.input_reply = this.cast("input_reply")
  @scala.inline
  def input_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.input_request = this.cast("input_request")
  @scala.inline
  def inspect_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.inspect_reply = this.cast("inspect_reply")
  @scala.inline
  def inspect_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.inspect_request = this.cast("inspect_request")
  @scala.inline
  def interrupt_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.interrupt_reply = this.cast("interrupt_reply")
  @scala.inline
  def interrupt_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.interrupt_request = this.cast("interrupt_request")
  @scala.inline
  def is_complete_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.is_complete_reply = this.cast("is_complete_reply")
  @scala.inline
  def is_complete_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.is_complete_request = this.cast("is_complete_request")
  @scala.inline
  def kernel_info_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.kernel_info_reply = this.cast("kernel_info_reply")
  @scala.inline
  def kernel_info_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request = this.cast("kernel_info_request")
  @scala.inline
  def shutdown_reply: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shutdown_reply = this.cast("shutdown_reply")
  @scala.inline
  def shutdown_request: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shutdown_request = this.cast("shutdown_request")
  @scala.inline
  def status: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.status = this.cast("status")
  @scala.inline
  def stream: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stream = this.cast("stream")
  @scala.inline
  def update_display_data: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.update_display_data = this.cast("update_display_data")
}

