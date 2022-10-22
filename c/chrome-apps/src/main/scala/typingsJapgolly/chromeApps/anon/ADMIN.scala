package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.admin_
import typingsJapgolly.chromeApps.chromeAppsStrings.development_
import typingsJapgolly.chromeApps.chromeAppsStrings.normal_
import typingsJapgolly.chromeApps.chromeAppsStrings.other_
import typingsJapgolly.chromeApps.chromeAppsStrings.sideload_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ADMIN extends StObject {
  
  var ADMIN: admin_
  
  var DEVELOPMENT: development_
  
  var NORMAL: normal_
  
  var OTHER: other_
  
  var SIDELOAD: sideload_
}
object ADMIN {
  
  inline def apply(): ADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = "admin", DEVELOPMENT = "development", NORMAL = "normal", OTHER = "other", SIDELOAD = "sideload")
    __obj.asInstanceOf[ADMIN]
  }
  
  extension [Self <: ADMIN](x: Self) {
    
    inline def setADMIN(value: admin_): Self = StObject.set(x, "ADMIN", value.asInstanceOf[js.Any])
    
    inline def setDEVELOPMENT(value: development_): Self = StObject.set(x, "DEVELOPMENT", value.asInstanceOf[js.Any])
    
    inline def setNORMAL(value: normal_): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
    
    inline def setOTHER(value: other_): Self = StObject.set(x, "OTHER", value.asInstanceOf[js.Any])
    
    inline def setSIDELOAD(value: sideload_): Self = StObject.set(x, "SIDELOAD", value.asInstanceOf[js.Any])
  }
}
