package typingsJapgolly.jupyterlabServices.libKernelMessagesMod

import typingsJapgolly.jupyterlabServices.anon.Metadata
import typingsJapgolly.jupyterlabServices.anon.TransientDisplayidString
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.update_display_data
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUpdateDisplayDataMsg
  extends StObject
     with IIOPubMessage[update_display_data]
     with _Message {
  
  @JSName("content")
  var content_IUpdateDisplayDataMsg: Metadata & TransientDisplayidString
}
object IUpdateDisplayDataMsg {
  
  inline def apply(
    content: Metadata & TransientDisplayidString,
    header: IHeader[update_display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IUpdateDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateDisplayDataMsg]
  }
  
  extension [Self <: IUpdateDisplayDataMsg](x: Self) {
    
    inline def setContent(value: Metadata & TransientDisplayidString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
