package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntraNodeVisibilityConfig extends StObject {
  
  /** Enables intra node visibility for this cluster. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object IntraNodeVisibilityConfig {
  
  inline def apply(): IntraNodeVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntraNodeVisibilityConfig]
  }
  
  extension [Self <: IntraNodeVisibilityConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
