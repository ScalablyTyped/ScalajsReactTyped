package typingsJapgolly.jupyterlabServices.libKernelMessagesMod

import typingsJapgolly.jupyterlabServices.anon.Data
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.comm_open
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommOpenMsg[T /* <: shell | iopub */]
  extends StObject
     with IMessage[comm_open] {
  
  @JSName("channel")
  var channel_ICommOpenMsg: T
  
  @JSName("content")
  var content_ICommOpenMsg: Data
}
object ICommOpenMsg {
  
  inline def apply[T /* <: shell | iopub */](
    channel: T,
    content: Data,
    header: IHeader[comm_open],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommOpenMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommOpenMsg[T]]
  }
  
  extension [Self <: ICommOpenMsg[?], T /* <: shell | iopub */](x: Self & ICommOpenMsg[T]) {
    
    inline def setChannel(value: T): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Data): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
