package typingsJapgolly.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var appName: typingsJapgolly.firebaseAuth.distNodeSrcModelAuthMod.AppName
  
  var missingPlugin: js.UndefOr[String] = js.undefined
}
object `21` {
  
  inline def apply(appName: typingsJapgolly.firebaseAuth.distNodeSrcModelAuthMod.AppName): `21` = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setAppName(value: typingsJapgolly.firebaseAuth.distNodeSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setMissingPlugin(value: String): Self = StObject.set(x, "missingPlugin", value.asInstanceOf[js.Any])
    
    inline def setMissingPluginUndefined: Self = StObject.set(x, "missingPlugin", js.undefined)
  }
}
