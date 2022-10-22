package typingsJapgolly.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cordova extends StObject {
  
  var plugins: CordovaPlugins
}
object Cordova {
  
  inline def apply(plugins: CordovaPlugins): Cordova = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  
  extension [Self <: Cordova](x: Self) {
    
    inline def setPlugins(value: CordovaPlugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
