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
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.control
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IControlMessage[T /* <: ControlMessageType */]
  extends StObject
     with IMessage[T] {
  
  @JSName("channel")
  var channel_IControlMessage: control
}
object IControlMessage {
  
  inline def apply[T /* <: ControlMessageType */](
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] & IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) & TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[T],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IControlMessage[T] = {
    val __obj = js.Dynamic.literal(channel = "control", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControlMessage[T]]
  }
  
  extension [Self <: IControlMessage[?], T /* <: ControlMessageType */](x: Self & IControlMessage[T]) {
    
    inline def setChannel(value: control): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
