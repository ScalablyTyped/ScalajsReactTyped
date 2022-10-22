package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.`extension`
import typingsJapgolly.chromeApps.chromeAppsStrings.hosted_app
import typingsJapgolly.chromeApps.chromeAppsStrings.legacy_packaged_app
import typingsJapgolly.chromeApps.chromeAppsStrings.packaged_app
import typingsJapgolly.chromeApps.chromeAppsStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EXTENSION extends StObject {
  
  var EXTENSION: `extension`
  
  var HOSTED_APP: hosted_app
  
  var LEGACY_PACKAGED_APP: legacy_packaged_app
  
  var PACKAGED_APP: packaged_app
  
  var THEME: theme
}
object EXTENSION {
  
  inline def apply(): EXTENSION = {
    val __obj = js.Dynamic.literal(EXTENSION = "extension", HOSTED_APP = "hosted_app", LEGACY_PACKAGED_APP = "legacy_packaged_app", PACKAGED_APP = "packaged_app", THEME = "theme")
    __obj.asInstanceOf[EXTENSION]
  }
  
  extension [Self <: EXTENSION](x: Self) {
    
    inline def setEXTENSION(value: `extension`): Self = StObject.set(x, "EXTENSION", value.asInstanceOf[js.Any])
    
    inline def setHOSTED_APP(value: hosted_app): Self = StObject.set(x, "HOSTED_APP", value.asInstanceOf[js.Any])
    
    inline def setLEGACY_PACKAGED_APP(value: legacy_packaged_app): Self = StObject.set(x, "LEGACY_PACKAGED_APP", value.asInstanceOf[js.Any])
    
    inline def setPACKAGED_APP(value: packaged_app): Self = StObject.set(x, "PACKAGED_APP", value.asInstanceOf[js.Any])
    
    inline def setTHEME(value: theme): Self = StObject.set(x, "THEME", value.asInstanceOf[js.Any])
  }
}
