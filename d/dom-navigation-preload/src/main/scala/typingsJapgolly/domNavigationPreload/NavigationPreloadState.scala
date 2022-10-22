package typingsJapgolly.domNavigationPreload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://w3c.github.io/ServiceWorker/#dictdef-navigationpreloadstate */
trait NavigationPreloadState extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var headerValue: js.UndefOr[String] = js.undefined
}
object NavigationPreloadState {
  
  inline def apply(): NavigationPreloadState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationPreloadState]
  }
  
  extension [Self <: NavigationPreloadState](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeaderValue(value: String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    inline def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
  }
}
