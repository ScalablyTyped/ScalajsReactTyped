package typingsJapgolly.jupyterlabServices.libKernelMessagesMod

import typingsJapgolly.jupyterlabServices.anon.Metadata
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.display_data
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisplayDataMsg
  extends StObject
     with IIOPubMessage[display_data]
     with _Message {
  
  @JSName("content")
  var content_IDisplayDataMsg: Metadata
}
object IDisplayDataMsg {
  
  inline def apply(
    content: Metadata,
    header: IHeader[display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayDataMsg]
  }
  
  extension [Self <: IDisplayDataMsg](x: Self) {
    
    inline def setContent(value: Metadata): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
