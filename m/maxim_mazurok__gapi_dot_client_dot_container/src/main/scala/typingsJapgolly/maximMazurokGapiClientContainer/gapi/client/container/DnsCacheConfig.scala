package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsCacheConfig extends StObject {
  
  /** Whether NodeLocal DNSCache is enabled for this cluster. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object DnsCacheConfig {
  
  inline def apply(): DnsCacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsCacheConfig]
  }
  
  extension [Self <: DnsCacheConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
