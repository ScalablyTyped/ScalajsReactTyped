package typingsJapgolly.jupyterlabServices.libKernelMessagesMod

import typingsJapgolly.jupyterlabServices.anon.Allowstdin
import typingsJapgolly.jupyterlabServices.anon.Arguments
import typingsJapgolly.jupyterlabServices.anon.Body
import typingsJapgolly.jupyterlabServices.anon.Code
import typingsJapgolly.jupyterlabServices.anon.CodeString
import typingsJapgolly.jupyterlabServices.anon.Commid
import typingsJapgolly.jupyterlabServices.anon.Cursorpos
import typingsJapgolly.jupyterlabServices.anon.Data
import typingsJapgolly.jupyterlabServices.anon.Ename
import typingsJapgolly.jupyterlabServices.anon.Event
import typingsJapgolly.jupyterlabServices.anon.Executioncount
import typingsJapgolly.jupyterlabServices.anon.Executionstate
import typingsJapgolly.jupyterlabServices.anon.Metadata
import typingsJapgolly.jupyterlabServices.anon.Name
import typingsJapgolly.jupyterlabServices.anon.Password
import typingsJapgolly.jupyterlabServices.anon.Targetname
import typingsJapgolly.jupyterlabServices.anon.Transient
import typingsJapgolly.jupyterlabServices.anon.TransientDisplayidString
import typingsJapgolly.jupyterlabServices.anon.Wait
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.clear_output
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_info_reply
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.complete_reply
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_event
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_reply
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.debug_request
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.display_data
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.error
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_input
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_reply
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_result
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.history_reply
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.history_request
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.input_reply
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.input_request
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.inspect_reply
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.inspect_request
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.is_complete_reply
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.kernel_info_reply
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.status
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.stream
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.update_display_data
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Message extends StObject
object _Message {
  
  inline def IClearOutputMsg(
    content: Wait,
    header: IHeader[clear_output],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IClearOutputMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IClearOutputMsg]
  }
  
  inline def ICommInfoReplyMsg(
    content: ReplyContent[ICommInfoReply],
    header: IHeader[comm_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[comm_info_request]
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICommInfoReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICommInfoReplyMsg]
  }
  
  inline def ICommInfoRequestMsg(
    content: Targetname,
    header: IHeader[comm_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICommInfoRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICommInfoRequestMsg]
  }
  
  inline def ICompleteReplyMsg(
    content: ReplyContent[ICompleteReply],
    header: IHeader[complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[complete_request]
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICompleteReplyMsg]
  }
  
  inline def ICompleteRequestMsg(
    content: Code,
    header: IHeader[complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICompleteRequestMsg]
  }
  
  inline def IDebugEventMsg(
    content: Event,
    header: IHeader[debug_event],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IDebugEventMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IDebugEventMsg]
  }
  
  inline def IDebugReplyMsg(
    content: Body,
    header: IHeader[debug_reply],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IDebugReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "control", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IDebugReplyMsg]
  }
  
  inline def IDebugRequestMsg(
    content: Arguments,
    header: IHeader[debug_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IDebugRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "control", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IDebugRequestMsg]
  }
  
  inline def IDisplayDataMsg(
    content: Metadata,
    header: IHeader[display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IDisplayDataMsg]
  }
  
  inline def IErrorMsg(
    content: Ename,
    header: IHeader[error],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IErrorMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IErrorMsg]
  }
  
  inline def IExecuteInputMsg(
    content: Executioncount,
    header: IHeader[execute_input],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IExecuteInputMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IExecuteInputMsg]
  }
  
  inline def IExecuteReplyMsg(
    content: ReplyContent[IExecuteReply] & IExecuteCount,
    header: IHeader[execute_reply],
    metadata: JSONObject,
    parent_header: IHeader[execute_request]
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IExecuteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IExecuteReplyMsg]
  }
  
  inline def IExecuteRequestMsg(
    content: Allowstdin,
    header: IHeader[execute_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IExecuteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IExecuteRequestMsg]
  }
  
  inline def IExecuteResultMsg(
    content: Transient,
    header: IHeader[execute_result],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IExecuteResultMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IExecuteResultMsg]
  }
  
  inline def IHistoryReplyMsg(
    content: ReplyContent[IHistoryReply],
    header: IHeader[history_reply],
    metadata: JSONObject,
    parent_header: IHeader[history_request]
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IHistoryReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IHistoryReplyMsg]
  }
  
  inline def IHistoryRequestMsg(
    content: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail,
    header: IHeader[history_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IHistoryRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IHistoryRequestMsg]
  }
  
  inline def IInfoReplyMsg(
    content: ReplyContent[IInfoReply],
    header: IHeader[kernel_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[kernel_info_request]
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInfoReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInfoReplyMsg]
  }
  
  inline def IInfoRequestMsg(
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] & IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) & TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[kernel_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInfoRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInfoRequestMsg]
  }
  
  inline def IInputReplyMsg(
    content: ReplyContent[IInputReply],
    header: IHeader[input_reply],
    metadata: JSONObject,
    parent_header: IHeader[input_request]
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInputReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "stdin", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInputReplyMsg]
  }
  
  inline def IInputRequestMsg(
    content: Password,
    header: IHeader[input_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInputRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "stdin", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInputRequestMsg]
  }
  
  inline def IInspectReplyMsg(
    content: ReplyContent[IInspectReply],
    header: IHeader[inspect_reply],
    metadata: JSONObject,
    parent_header: IHeader[inspect_request]
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInspectReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInspectReplyMsg]
  }
  
  inline def IInspectRequestMsg(
    content: Cursorpos,
    header: IHeader[inspect_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInspectRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInspectRequestMsg]
  }
  
  inline def IIsCompleteReplyMsg(
    content: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther],
    header: IHeader[is_complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[is_complete_request]
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IIsCompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IIsCompleteReplyMsg]
  }
  
  inline def IIsCompleteRequestMsg(
    content: CodeString,
    header: IHeader[is_complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IIsCompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IIsCompleteRequestMsg]
  }
  
  inline def IStatusMsg(
    content: Executionstate,
    header: IHeader[status],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IStatusMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IStatusMsg]
  }
  
  inline def IStreamMsg(
    content: Name,
    header: IHeader[stream],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IStreamMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IStreamMsg]
  }
  
  inline def IUpdateDisplayDataMsg(
    content: Metadata & TransientDisplayidString,
    header: IHeader[update_display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IUpdateDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IUpdateDisplayDataMsg]
  }
}
