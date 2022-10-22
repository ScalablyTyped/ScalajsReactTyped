package typingsJapgolly.hapiHapi.mod

import typingsJapgolly.hapiHapi.hapiHapiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptions
  extends StObject
     with CommonRouteProperties {
  
  /**
    * Route authentication configuration. Value can be:
    * false to disable authentication if a default strategy is set.
    * a string with the name of an authentication strategy registered with server.auth.strategy(). The strategy will be set to 'required' mode.
    * an authentication configuration object.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsapp)
    */
  var auth: js.UndefOr[`false` | String | RouteOptionsAccess] = js.undefined
}
object RouteOptions {
  
  inline def apply(): RouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptions]
  }
  
  extension [Self <: RouteOptions](x: Self) {
    
    inline def setAuth(value: `false` | String | RouteOptionsAccess): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
