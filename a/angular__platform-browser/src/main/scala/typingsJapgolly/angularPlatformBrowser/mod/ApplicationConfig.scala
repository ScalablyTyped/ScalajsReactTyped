package typingsJapgolly.angularPlatformBrowser.mod

import typingsJapgolly.angularCore.mod.ImportedNgModuleProviders
import typingsJapgolly.angularCore.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationConfig extends StObject {
  
  /**
    * List of providers that should be available to the root component and all its children.
    */
  var providers: js.Array[Provider | ImportedNgModuleProviders]
}
object ApplicationConfig {
  
  inline def apply(providers: js.Array[Provider | ImportedNgModuleProviders]): ApplicationConfig = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationConfig]
  }
  
  extension [Self <: ApplicationConfig](x: Self) {
    
    inline def setProviders(value: js.Array[Provider | ImportedNgModuleProviders]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: (Provider | ImportedNgModuleProviders)*): Self = StObject.set(x, "providers", js.Array(value*))
  }
}
