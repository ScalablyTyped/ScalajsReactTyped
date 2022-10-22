package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PIN
import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PUK
import typingsJapgolly.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typingsJapgolly.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INVALIDPIN extends StObject {
  
  var INVALID_PIN: typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PIN
  
  var INVALID_PUK: typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_PUK
  
  var MAX_ATTEMPTS_EXCEEDED: typingsJapgolly.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
  
  var UNKNOWN_ERROR: typingsJapgolly.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
}
object INVALIDPIN {
  
  inline def apply(): INVALIDPIN = {
    val __obj = js.Dynamic.literal(INVALID_PIN = "INVALID_PIN", INVALID_PUK = "INVALID_PUK", MAX_ATTEMPTS_EXCEEDED = "MAX_ATTEMPTS_EXCEEDED", UNKNOWN_ERROR = "UNKNOWN_ERROR")
    __obj.asInstanceOf[INVALIDPIN]
  }
  
  extension [Self <: INVALIDPIN](x: Self) {
    
    inline def setINVALID_PIN(value: INVALID_PIN): Self = StObject.set(x, "INVALID_PIN", value.asInstanceOf[js.Any])
    
    inline def setINVALID_PUK(value: INVALID_PUK): Self = StObject.set(x, "INVALID_PUK", value.asInstanceOf[js.Any])
    
    inline def setMAX_ATTEMPTS_EXCEEDED(value: MAX_ATTEMPTS_EXCEEDED): Self = StObject.set(x, "MAX_ATTEMPTS_EXCEEDED", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN_ERROR(value: UNKNOWN_ERROR): Self = StObject.set(x, "UNKNOWN_ERROR", value.asInstanceOf[js.Any])
  }
}
