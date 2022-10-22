package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.adaptive_
import typingsJapgolly.chromeApps.chromeAppsStrings.asynchronous_
import typingsJapgolly.chromeApps.chromeAppsStrings.synchronous_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ADAPTIVE extends StObject {
  
  var ADAPTIVE: adaptive_
  
  var ASYNCHRONOUS: asynchronous_
  
  var SYNCHRONOUS: synchronous_
}
object ADAPTIVE {
  
  inline def apply(): ADAPTIVE = {
    val __obj = js.Dynamic.literal(ADAPTIVE = "adaptive", ASYNCHRONOUS = "asynchronous", SYNCHRONOUS = "synchronous")
    __obj.asInstanceOf[ADAPTIVE]
  }
  
  extension [Self <: ADAPTIVE](x: Self) {
    
    inline def setADAPTIVE(value: adaptive_): Self = StObject.set(x, "ADAPTIVE", value.asInstanceOf[js.Any])
    
    inline def setASYNCHRONOUS(value: asynchronous_): Self = StObject.set(x, "ASYNCHRONOUS", value.asInstanceOf[js.Any])
    
    inline def setSYNCHRONOUS(value: synchronous_): Self = StObject.set(x, "SYNCHRONOUS", value.asInstanceOf[js.Any])
  }
}
