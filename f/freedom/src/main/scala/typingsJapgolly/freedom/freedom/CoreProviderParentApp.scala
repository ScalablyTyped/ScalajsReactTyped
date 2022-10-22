package typingsJapgolly.freedom.freedom

import typingsJapgolly.freedom.anon.RemoveEventListener
import typingsJapgolly.freedom.anon.Views
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This is the first argument given to a core provider's constructor. It is an
// object that describes the parent module the core provider instance has been
// created for.
trait CoreProviderParentApp extends StObject {
  
  var config: Views
  
  var global: RemoveEventListener
  
  var manifestId: String
}
object CoreProviderParentApp {
  
  inline def apply(config: Views, global: RemoveEventListener, manifestId: String): CoreProviderParentApp = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], manifestId = manifestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreProviderParentApp]
  }
  
  extension [Self <: CoreProviderParentApp](x: Self) {
    
    inline def setConfig(value: Views): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setGlobal(value: RemoveEventListener): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setManifestId(value: String): Self = StObject.set(x, "manifestId", value.asInstanceOf[js.Any])
  }
}
