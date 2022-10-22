package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.failed_
import typingsJapgolly.chromeApps.chromeAppsStrings.rejected_
import typingsJapgolly.chromeApps.chromeAppsStrings.succeeded_
import typingsJapgolly.chromeApps.chromeAppsStrings.unhandled_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FAILED extends StObject {
  
  var FAILED: failed_
  
  var REJECTED: rejected_
  
  var SUCCEEDED: succeeded_
  
  var UNHANDLED: unhandled_
}
object FAILED {
  
  inline def apply(): FAILED = {
    val __obj = js.Dynamic.literal(FAILED = "failed", REJECTED = "rejected", SUCCEEDED = "succeeded", UNHANDLED = "unhandled")
    __obj.asInstanceOf[FAILED]
  }
  
  extension [Self <: FAILED](x: Self) {
    
    inline def setFAILED(value: failed_): Self = StObject.set(x, "FAILED", value.asInstanceOf[js.Any])
    
    inline def setREJECTED(value: rejected_): Self = StObject.set(x, "REJECTED", value.asInstanceOf[js.Any])
    
    inline def setSUCCEEDED(value: succeeded_): Self = StObject.set(x, "SUCCEEDED", value.asInstanceOf[js.Any])
    
    inline def setUNHANDLED(value: unhandled_): Self = StObject.set(x, "UNHANDLED", value.asInstanceOf[js.Any])
  }
}
