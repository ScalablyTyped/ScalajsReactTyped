package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.denied_
import typingsJapgolly.chromeApps.chromeAppsStrings.granted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DENIED extends StObject {
  
  var DENIED: denied_
  
  var GRANTED: granted_
}
object DENIED {
  
  inline def apply(): DENIED = {
    val __obj = js.Dynamic.literal(DENIED = "denied", GRANTED = "granted")
    __obj.asInstanceOf[DENIED]
  }
  
  extension [Self <: DENIED](x: Self) {
    
    inline def setDENIED(value: denied_): Self = StObject.set(x, "DENIED", value.asInstanceOf[js.Any])
    
    inline def setGRANTED(value: granted_): Self = StObject.set(x, "GRANTED", value.asInstanceOf[js.Any])
  }
}
