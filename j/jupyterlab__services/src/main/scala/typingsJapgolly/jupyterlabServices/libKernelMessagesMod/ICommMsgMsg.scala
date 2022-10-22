package typingsJapgolly.jupyterlabServices.libKernelMessagesMod

import typingsJapgolly.jupyterlabServices.anon.Commid
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_msg
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommMsgMsg[T /* <: iopub | shell */]
  extends StObject
     with IMessage[comm_msg] {
  
  @JSName("channel")
  var channel_ICommMsgMsg: T
  
  @JSName("content")
  var content_ICommMsgMsg: Commid
}
object ICommMsgMsg {
  
  inline def apply[T /* <: iopub | shell */](
    channel: T,
    content: Commid,
    header: IHeader[comm_msg],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommMsgMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommMsgMsg[T]]
  }
  
  extension [Self <: ICommMsgMsg[?], T /* <: iopub | shell */](x: Self & ICommMsgMsg[T]) {
    
    inline def setChannel(value: T): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Commid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
