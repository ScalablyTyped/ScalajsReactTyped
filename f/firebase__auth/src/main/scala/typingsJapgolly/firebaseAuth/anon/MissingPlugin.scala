package typingsJapgolly.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissingPlugin extends StObject {
  
  var appName: typingsJapgolly.firebaseAuth.distAuthMod.AppName
  
  var missingPlugin: js.UndefOr[String] = js.undefined
}
object MissingPlugin {
  
  inline def apply(appName: typingsJapgolly.firebaseAuth.distAuthMod.AppName): MissingPlugin = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingPlugin]
  }
  
  extension [Self <: MissingPlugin](x: Self) {
    
    inline def setAppName(value: typingsJapgolly.firebaseAuth.distAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setMissingPlugin(value: String): Self = StObject.set(x, "missingPlugin", value.asInstanceOf[js.Any])
    
    inline def setMissingPluginUndefined: Self = StObject.set(x, "missingPlugin", js.undefined)
  }
}
