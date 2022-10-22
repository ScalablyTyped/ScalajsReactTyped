package typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.TokenMessage
  - typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.TopicMessage
  - typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.ConditionMessage
*/
trait Message extends StObject
object Message {
  
  inline def ConditionMessage(condition: String): typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.ConditionMessage = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.ConditionMessage]
  }
  
  inline def TokenMessage(token: String): typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.TokenMessage = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.TokenMessage]
  }
  
  inline def TopicMessage(topic: String): typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.TopicMessage = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.TopicMessage]
  }
}
