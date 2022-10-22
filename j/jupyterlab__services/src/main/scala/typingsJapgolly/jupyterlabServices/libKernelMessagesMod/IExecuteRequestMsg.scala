package typingsJapgolly.jupyterlabServices.libKernelMessagesMod

import typingsJapgolly.jupyterlabServices.anon.Allowstdin
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteRequestMsg
  extends StObject
     with IShellMessage[execute_request]
     with _Message {
  
  @JSName("content")
  var content_IExecuteRequestMsg: Allowstdin
}
object IExecuteRequestMsg {
  
  inline def apply(
    content: Allowstdin,
    header: IHeader[execute_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IExecuteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteRequestMsg]
  }
  
  extension [Self <: IExecuteRequestMsg](x: Self) {
    
    inline def setContent(value: Allowstdin): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
