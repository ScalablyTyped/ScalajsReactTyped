package typingsJapgolly.node.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeRuntime {
  
  trait NotifyWhenWaitingForDisconnectParameterType extends StObject {
    
    var enabled: Boolean
  }
  object NotifyWhenWaitingForDisconnectParameterType {
    
    inline def apply(enabled: Boolean): NotifyWhenWaitingForDisconnectParameterType = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotifyWhenWaitingForDisconnectParameterType]
    }
    
    extension [Self <: NotifyWhenWaitingForDisconnectParameterType](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
