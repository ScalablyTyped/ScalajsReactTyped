package typingsJapgolly.reduxLittleRouter.mod

import typingsJapgolly.reduxLittleRouter.anon.BaseUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressRouterArgs extends StObject {
  
  var request: BaseUrl
  
  var routes: Routes
}
object ExpressRouterArgs {
  
  inline def apply(request: BaseUrl, routes: Routes): ExpressRouterArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressRouterArgs]
  }
  
  extension [Self <: ExpressRouterArgs](x: Self) {
    
    inline def setRequest(value: BaseUrl): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRoutes(value: Routes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
  }
}
