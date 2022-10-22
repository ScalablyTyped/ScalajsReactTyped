package typingsJapgolly.backbone.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterOptions extends StObject {
  
  var routes: Result[RoutesHash]
}
object RouterOptions {
  
  inline def apply(routes: Result[RoutesHash]): RouterOptions = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
  
  extension [Self <: RouterOptions](x: Self) {
    
    inline def setRoutes(value: Result[RoutesHash]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesCallbackTo(value: CallbackTo[RoutesHash]): Self = StObject.set(x, "routes", value.toJsFn)
  }
}
