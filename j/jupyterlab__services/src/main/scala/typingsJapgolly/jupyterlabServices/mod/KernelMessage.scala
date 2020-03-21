package typingsJapgolly.jupyterlabServices.mod

import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IClearOutputMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommCloseMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommInfoReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommInfoRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommMsgMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICommOpenMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICompleteReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.ICompleteRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IDebugEventMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IDebugReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IDebugRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IDisplayDataMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IErrorMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteInputMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteResultMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IHistoryReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IHistoryRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInfoReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInfoRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInputReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInputRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInspectReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IInspectRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteReplyMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IIsCompleteRequestMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IOptions
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IStatusMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IStreamMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IUpdateDisplayDataMsg
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "KernelMessage")
@js.native
object KernelMessage extends js.Object {
  def createMessage[T /* <: ICommOpenMsg[shell] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IClearOutputMsg[T /* <: IClearOutputMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommCloseMsgiopub[T /* <: ICommCloseMsg[iopub] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommCloseMsgshell[T /* <: ICommCloseMsg[shell] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommInfoReplyMsg[T /* <: ICommInfoReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommInfoRequestMsg[T /* <: ICommInfoRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommMsgMsgiopub[T /* <: ICommMsgMsg[iopub] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommMsgMsgshell[T /* <: ICommMsgMsg[shell] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICommOpenMsgiopub[T /* <: ICommOpenMsg[iopub] */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICompleteReplyMsg[T /* <: ICompleteReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_ICompleteRequestMsg[T /* <: ICompleteRequestMsg */](options: IOptions[T]): T = js.native
  /**
    * @hidden
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this function is *NOT* considered
    * part of the public API, and may change without notice.
    */
  @JSName("createMessage")
  def createMessage_T_IDebugEventMsg[T /* <: IDebugEventMsg */](options: IOptions[T]): T = js.native
  /**
    * @hidden
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this function is *NOT* considered
    * part of the public API, and may change without notice.
    */
  @JSName("createMessage")
  def createMessage_T_IDebugReplyMsg[T /* <: IDebugReplyMsg */](options: IOptions[T]): T = js.native
  /**
    * @hidden
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this function is *NOT* considered
    * part of the public API, and may change without notice.
    */
  @JSName("createMessage")
  def createMessage_T_IDebugRequestMsg[T /* <: IDebugRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IDisplayDataMsg[T /* <: IDisplayDataMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IErrorMsg[T /* <: IErrorMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteInputMsg[T /* <: IExecuteInputMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteReplyMsg[T /* <: IExecuteReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteRequestMsg[T /* <: IExecuteRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IExecuteResultMsg[T /* <: IExecuteResultMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IHistoryReplyMsg[T /* <: IHistoryReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IHistoryRequestMsg[T /* <: IHistoryRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInfoReplyMsg[T /* <: IInfoReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInfoRequestMsg[T /* <: IInfoRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInputReplyMsg[T /* <: IInputReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInputRequestMsg[T /* <: IInputRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInspectReplyMsg[T /* <: IInspectReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IInspectRequestMsg[T /* <: IInspectRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IIsCompleteReplyMsg[T /* <: IIsCompleteReplyMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IIsCompleteRequestMsg[T /* <: IIsCompleteRequestMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IStatusMsg[T /* <: IStatusMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IStreamMsg[T /* <: IStreamMsg */](options: IOptions[T]): T = js.native
  @JSName("createMessage")
  def createMessage_T_IUpdateDisplayDataMsg[T /* <: IUpdateDisplayDataMsg */](options: IOptions[T]): T = js.native
  /**
    * Test whether a kernel message is a `'clear_output'` message.
    */
  def isClearOutputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IClearOutputMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_close'` message.
    */
  def isCommCloseMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommCloseMsg<'iopub' | 'shell'> */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_msg'` message.
    */
  def isCommMsgMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommMsgMsg<'iopub' | 'shell'> */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_open'` message.
    */
  def isCommOpenMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommOpenMsg<'iopub' | 'shell'> */ Boolean = js.native
  /**
    * Test whether a kernel message is an experimental `'debug_event'` message.
    *
    * @hidden
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this is *NOT* considered
    * part of the public API, and may change without notice.
    */
  def isDebugEventMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDebugEventMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an experimental `'debug_reply'` message.
    *
    * @hidden
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this is *NOT* considered
    * part of the public API, and may change without notice.
    */
  def isDebugReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDebugReplyMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an experimental `'debug_request'` message.
    *
    * @hidden
    *
    * #### Notes
    * Debug messages are experimental messages that are not in the official
    * kernel message specification. As such, this is *NOT* considered
    * part of the public API, and may change without notice.
    */
  def isDebugRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDebugRequestMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'display_data'` message.
    */
  def isDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'error'` message.
    */
  def isErrorMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IErrorMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_input'` message.
    */
  def isExecuteInputMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteInputMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_reply'` message.
    */
  def isExecuteReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteReplyMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_result'` message.
    */
  def isExecuteResultMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteResultMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'kernel_info_request'` message.
    */
  def isInfoRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInfoRequestMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'input_reply'` message.
    */
  def isInputReplyMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInputReplyMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'input_request'` message.
    */
  def isInputRequestMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInputRequestMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'status'` message.
    */
  def isStatusMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IStatusMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is a `'stream'` message.
    */
  def isStreamMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IStreamMsg */ Boolean = js.native
  /**
    * Test whether a kernel message is an `'update_display_data'` message.
    */
  def isUpdateDisplayDataMsg(msg: IMessage[MessageType]): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IUpdateDisplayDataMsg */ Boolean = js.native
}

