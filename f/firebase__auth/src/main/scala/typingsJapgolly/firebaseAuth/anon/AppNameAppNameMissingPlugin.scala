package typingsJapgolly.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameAppNameMissingPlugin extends StObject {
  
  var appName: typingsJapgolly.firebaseAuth.distEsm2017SrcModelAuthMod.AppName
  
  var missingPlugin: js.UndefOr[String] = js.undefined
}
object AppNameAppNameMissingPlugin {
  
  inline def apply(appName: typingsJapgolly.firebaseAuth.distEsm2017SrcModelAuthMod.AppName): AppNameAppNameMissingPlugin = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNameAppNameMissingPlugin]
  }
  
  extension [Self <: AppNameAppNameMissingPlugin](x: Self) {
    
    inline def setAppName(value: typingsJapgolly.firebaseAuth.distEsm2017SrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setMissingPlugin(value: String): Self = StObject.set(x, "missingPlugin", value.asInstanceOf[js.Any])
    
    inline def setMissingPluginUndefined: Self = StObject.set(x, "missingPlugin", js.undefined)
  }
}
