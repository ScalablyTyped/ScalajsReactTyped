package typingsJapgolly.jupyterlabServices.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KernelMessage {
  /**
    * A convenience type for a base for an execute reply content.
    */
  type IExecuteReplyBase = typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteCount with typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IReplyOkContent
  /**
    * A message type for shell or control messages.
    *
    * #### Notes
    * This convenience is so we can use it as a generic type constraint.
    */
  type IShellControlMessage = typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IShellMessage[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ShellMessageType] | typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IControlMessage[typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ControlMessageType]
  /**
    * Message types.
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, debug message types are *NOT*
    * considered part of the public API, and may change without notice.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IClearOutputMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommCloseMsg[
  typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommInfoReplyMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommInfoRequestMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommMsgMsg[
  typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommOpenMsg[
  typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell]
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICompleteReplyMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICompleteRequestMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IDisplayDataMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IErrorMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteInputMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteRequestMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteResultMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IHistoryReplyMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IHistoryRequestMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInfoReplyMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInfoRequestMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInputReplyMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInputRequestMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInspectReplyMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInspectRequestMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteReplyMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteRequestMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IStatusMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IStreamMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IUpdateDisplayDataMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IDebugRequestMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IDebugReplyMsg
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IDebugEventMsg
  */
  type Message = typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage._Message | (typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommCloseMsg[
    typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
  ]) | (typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommMsgMsg[
    typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
  ]) | (typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommOpenMsg[
    typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub | typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
  ])
  /**
    * A convenience type for reply content.
    *
    * This automatically unions the necessary error and abort replies required in
    * the [message spec](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply).
    */
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IReplyErrorContent
    - typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IReplyAbortContent
  */
  type ReplyContent[T] = typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage._ReplyContent[T] | T
}
