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
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessage[MSGTYPE /* <: MessageType */] extends StObject {
  
  /**
    * An optional list of binary buffers.
    */
  var buffers: js.UndefOr[js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]] = js.undefined
  
  /**
    * The channel on which the message is transmitted.
    */
  var channel: Channel
  
  /**
    * The content of the message.
    */
  var content: Wait | Commid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] & IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) & TransientDisplayidString) | Arguments | Body | Event
  
  /**
    * The message header.
    */
  var header: IHeader[MSGTYPE]
  
  /**
    * Metadata associated with the message.
    */
  var metadata: JSONObject
  
  /**
    * The parent message
    */
  var parent_header: IHeader[MessageType] | js.Object
}
object IMessage {
  
  inline def apply[MSGTYPE /* <: MessageType */](
    channel: Channel,
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] & IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) & TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[MSGTYPE],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IMessage[MSGTYPE] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage[MSGTYPE]]
  }
  
  extension [Self <: IMessage[?], MSGTYPE /* <: MessageType */](x: Self & IMessage[MSGTYPE]) {
    
    inline def setBuffers(value: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setBuffersUndefined: Self = StObject.set(x, "buffers", js.undefined)
    
    inline def setBuffersVarargs(value: (js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView)*): Self = StObject.set(x, "buffers", js.Array(value*))
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setContent(
      value: Wait | Commid | (ReplyContent[
          ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
        ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] & IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) & TransientDisplayidString) | Arguments | Body | Event
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: IHeader[MSGTYPE]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setParent_header(value: IHeader[MessageType] | js.Object): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}
