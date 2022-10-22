package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePushTemplateResponse extends StObject {
  
  var MessageBody: typingsJapgolly.awsSdk.clientsPinpointMod.MessageBody
}
object DeletePushTemplateResponse {
  
  inline def apply(MessageBody: MessageBody): DeletePushTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePushTemplateResponse]
  }
  
  extension [Self <: DeletePushTemplateResponse](x: Self) {
    
    inline def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
