package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.app_update_
import typingsJapgolly.chromeApps.chromeAppsStrings.os_update_
import typingsJapgolly.chromeApps.chromeAppsStrings.periodic_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APPUPDATE extends StObject {
  
  var APP_UPDATE: app_update_
  
  var OS_UPDATE: os_update_
  
  var PERIODIC: periodic_
}
object APPUPDATE {
  
  inline def apply(): APPUPDATE = {
    val __obj = js.Dynamic.literal(APP_UPDATE = "app_update", OS_UPDATE = "os_update", PERIODIC = "periodic")
    __obj.asInstanceOf[APPUPDATE]
  }
  
  extension [Self <: APPUPDATE](x: Self) {
    
    inline def setAPP_UPDATE(value: app_update_): Self = StObject.set(x, "APP_UPDATE", value.asInstanceOf[js.Any])
    
    inline def setOS_UPDATE(value: os_update_): Self = StObject.set(x, "OS_UPDATE", value.asInstanceOf[js.Any])
    
    inline def setPERIODIC(value: periodic_): Self = StObject.set(x, "PERIODIC", value.asInstanceOf[js.Any])
  }
}
