package typingsJapgolly.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DELETED extends StObject {
  
  var CHANGED: typingsJapgolly.chromeApps.chromeAppsStrings.CHANGED
  
  var DELETED: typingsJapgolly.chromeApps.chromeAppsStrings.DELETED
}
object DELETED {
  
  inline def apply(): DELETED = {
    val __obj = js.Dynamic.literal(CHANGED = "CHANGED", DELETED = "DELETED")
    __obj.asInstanceOf[DELETED]
  }
  
  extension [Self <: DELETED](x: Self) {
    
    inline def setCHANGED(value: typingsJapgolly.chromeApps.chromeAppsStrings.CHANGED): Self = StObject.set(x, "CHANGED", value.asInstanceOf[js.Any])
    
    inline def setDELETED(value: typingsJapgolly.chromeApps.chromeAppsStrings.DELETED): Self = StObject.set(x, "DELETED", value.asInstanceOf[js.Any])
  }
}
