package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.fixed_
import typingsJapgolly.chromeApps.chromeAppsStrings.removable_
import typingsJapgolly.chromeApps.chromeAppsStrings.unknown__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FIXED extends StObject {
  
  var FIXED: fixed_
  
  var REMOVABLE: removable_
  
  var UNKNOWN: unknown__
}
object FIXED {
  
  inline def apply(): FIXED = {
    val __obj = js.Dynamic.literal(FIXED = "fixed", REMOVABLE = "removable", UNKNOWN = "unknown")
    __obj.asInstanceOf[FIXED]
  }
  
  extension [Self <: FIXED](x: Self) {
    
    inline def setFIXED(value: fixed_): Self = StObject.set(x, "FIXED", value.asInstanceOf[js.Any])
    
    inline def setREMOVABLE(value: removable_): Self = StObject.set(x, "REMOVABLE", value.asInstanceOf[js.Any])
    
    inline def setUNKNOWN(value: unknown__): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
  }
}
