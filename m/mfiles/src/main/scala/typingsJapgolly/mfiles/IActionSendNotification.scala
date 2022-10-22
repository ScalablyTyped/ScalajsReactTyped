package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionSendNotification extends StObject {
  
  def Clone(): IActionSendNotification
  
  var Message: String
  
  var RecipientsEx: IUserOrUserGroupIDExs
  
  var Subject: String
}
object IActionSendNotification {
  
  inline def apply(
    Clone: CallbackTo[IActionSendNotification],
    Message: String,
    RecipientsEx: IUserOrUserGroupIDExs,
    Subject: String
  ): IActionSendNotification = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Message = Message.asInstanceOf[js.Any], RecipientsEx = RecipientsEx.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSendNotification]
  }
  
  extension [Self <: IActionSendNotification](x: Self) {
    
    inline def setClone(value: CallbackTo[IActionSendNotification]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setRecipientsEx(value: IUserOrUserGroupIDExs): Self = StObject.set(x, "RecipientsEx", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
  }
}
