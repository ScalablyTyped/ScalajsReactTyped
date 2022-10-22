package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInAppTemplateResponse extends StObject {
  
  var MessageBody: typingsJapgolly.awsSdk.clientsPinpointMod.MessageBody
}
object DeleteInAppTemplateResponse {
  
  inline def apply(MessageBody: MessageBody): DeleteInAppTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInAppTemplateResponse]
  }
  
  extension [Self <: DeleteInAppTemplateResponse](x: Self) {
    
    inline def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
