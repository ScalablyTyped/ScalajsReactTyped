package typingsJapgolly.jupyterlabServices.anon

import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.Channel
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICommInfoReply
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICompleteReply
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IExecuteCount
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IExecuteReply
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IHeader
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IHistoryReply
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IHistoryRequestRange
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IHistoryRequestSearch
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IHistoryRequestTail
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInfoReply
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInputReply
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IInspectReply
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IIsCompleteReplyIncomplete
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IIsCompleteReplyOther
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.MessageType
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ReplyContent
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IMessage<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.MessageType>> */
trait ReadonlyIMessageMessageTy extends StObject {
  
  val buffers: js.UndefOr[js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]] = js.undefined
  
  val channel: Channel
  
  val content: Wait | Commid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] & IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata & TransientDisplayidString) | Arguments | Body | Event
  
  val header: IHeader[MessageType]
  
  val metadata: JSONObject
  
  val parent_header: IHeader[MessageType] | js.Object
}
object ReadonlyIMessageMessageTy {
  
  inline def apply(
    channel: Channel,
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] & IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata & TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[MessageType],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ReadonlyIMessageMessageTy = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIMessageMessageTy]
  }
  
  extension [Self <: ReadonlyIMessageMessageTy](x: Self) {
    
    inline def setBuffers(value: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setBuffersUndefined: Self = StObject.set(x, "buffers", js.undefined)
    
    inline def setBuffersVarargs(value: (js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView)*): Self = StObject.set(x, "buffers", js.Array(value*))
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setContent(
      value: Wait | Commid | (ReplyContent[
          ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
        ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] & IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata & TransientDisplayidString) | Arguments | Body | Event
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: IHeader[MessageType]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setParent_header(value: IHeader[MessageType] | js.Object): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
