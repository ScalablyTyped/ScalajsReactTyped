package typingsJapgolly.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionIsEnable extends StObject {
  
  var action: js.Array[String]
  
  var isEnable: Unit
  
  var trigger: String
}
object ActionIsEnable {
  
  inline def apply(action: js.Array[String], isEnable: Unit, trigger: String): ActionIsEnable = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], isEnable = isEnable.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionIsEnable]
  }
  
  extension [Self <: ActionIsEnable](x: Self) {
    
    inline def setAction(value: js.Array[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setIsEnable(value: Unit): Self = StObject.set(x, "isEnable", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
