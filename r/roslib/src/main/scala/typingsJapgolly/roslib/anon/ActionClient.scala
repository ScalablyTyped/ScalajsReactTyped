package typingsJapgolly.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionClient extends StObject {
  
  var actionClient: typingsJapgolly.roslib.mod.ActionClient
  
  var goalMessage: Any
}
object ActionClient {
  
  inline def apply(actionClient: typingsJapgolly.roslib.mod.ActionClient, goalMessage: Any): ActionClient = {
    val __obj = js.Dynamic.literal(actionClient = actionClient.asInstanceOf[js.Any], goalMessage = goalMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionClient]
  }
  
  extension [Self <: ActionClient](x: Self) {
    
    inline def setActionClient(value: typingsJapgolly.roslib.mod.ActionClient): Self = StObject.set(x, "actionClient", value.asInstanceOf[js.Any])
    
    inline def setGoalMessage(value: Any): Self = StObject.set(x, "goalMessage", value.asInstanceOf[js.Any])
  }
}
