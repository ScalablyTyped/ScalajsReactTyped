package typingsJapgolly.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestUserScripts extends StObject {
  
  var api_script: js.UndefOr[ExtensionURL] = js.undefined
}
object WebExtensionManifestUserScripts {
  
  inline def apply(): WebExtensionManifestUserScripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestUserScripts]
  }
  
  extension [Self <: WebExtensionManifestUserScripts](x: Self) {
    
    inline def setApi_script(value: ExtensionURL): Self = StObject.set(x, "api_script", value.asInstanceOf[js.Any])
    
    inline def setApi_scriptUndefined: Self = StObject.set(x, "api_script", js.undefined)
  }
}
