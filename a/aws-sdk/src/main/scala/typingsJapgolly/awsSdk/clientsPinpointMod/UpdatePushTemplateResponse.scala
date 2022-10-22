package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePushTemplateResponse extends StObject {
  
  var MessageBody: typingsJapgolly.awsSdk.clientsPinpointMod.MessageBody
}
object UpdatePushTemplateResponse {
  
  inline def apply(MessageBody: MessageBody): UpdatePushTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePushTemplateResponse]
  }
  
  extension [Self <: UpdatePushTemplateResponse](x: Self) {
    
    inline def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
