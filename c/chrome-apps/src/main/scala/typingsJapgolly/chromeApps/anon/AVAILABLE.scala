package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.available
import typingsJapgolly.chromeApps.chromeAppsStrings.enabled_
import typingsJapgolly.chromeApps.chromeAppsStrings.unknown__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AVAILABLE extends StObject {
  
  var AVAILABLE: available
  
  var ENABLED: enabled_
  
  var UNKNOWN: unknown__
}
object AVAILABLE {
  
  inline def apply(): AVAILABLE = {
    val __obj = js.Dynamic.literal(AVAILABLE = "available", ENABLED = "enabled", UNKNOWN = "unknown")
    __obj.asInstanceOf[AVAILABLE]
  }
  
  extension [Self <: AVAILABLE](x: Self) {
    
    inline def setAVAILABLE(value: available): Self = StObject.set(x, "AVAILABLE", value.asInstanceOf[js.Any])
    
    inline def setENABLED(value: enabled_): Self = StObject.set(x, "ENABLED", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN(value: unknown__): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
  }
}
