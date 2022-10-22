package typingsJapgolly.autoLaunch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait UseLaunchAgent extends StObject {
    
    /**
      * By default, AppleScript is used to add a Login Item. If this is `true`, Launch Agent will be used to auto-launch your app. Defaults is `false`.
      */
    var useLaunchAgent: js.UndefOr[Boolean] = js.undefined
  }
  object UseLaunchAgent {
    
    inline def apply(): UseLaunchAgent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseLaunchAgent]
    }
    
    extension [Self <: UseLaunchAgent](x: Self) {
      
      inline def setUseLaunchAgent(value: Boolean): Self = StObject.set(x, "useLaunchAgent", value.asInstanceOf[js.Any])
      
      inline def setUseLaunchAgentUndefined: Self = StObject.set(x, "useLaunchAgent", js.undefined)
    }
  }
}
