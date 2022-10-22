package typingsJapgolly.angularRouter.mod

import typingsJapgolly.angularCore.mod.EnvironmentInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadedRouterConfig extends StObject {
  
  var injector: js.UndefOr[EnvironmentInjector] = js.undefined
  
  var routes: js.Array[Route]
}
object LoadedRouterConfig {
  
  inline def apply(routes: js.Array[Route]): LoadedRouterConfig = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadedRouterConfig]
  }
  
  extension [Self <: LoadedRouterConfig](x: Self) {
    
    inline def setInjector(value: EnvironmentInjector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
    
    inline def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
    
    inline def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value*))
  }
}
