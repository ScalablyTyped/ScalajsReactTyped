package typingsJapgolly.winrtUwp.Windows.Networking.Connectivity

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the proxy configuration for the current user. */
trait ProxyConfiguration extends StObject {
  
  /** Gets a value that indicates if this configuration can connect directly. */
  var canConnectDirectly: Boolean
  
  /** Gets a list of URIs for the proxies from the proxy configuration. */
  var proxyUris: IVectorView[Uri]
}
object ProxyConfiguration {
  
  inline def apply(canConnectDirectly: Boolean, proxyUris: IVectorView[Uri]): ProxyConfiguration = {
    val __obj = js.Dynamic.literal(canConnectDirectly = canConnectDirectly.asInstanceOf[js.Any], proxyUris = proxyUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfiguration]
  }
  
  extension [Self <: ProxyConfiguration](x: Self) {
    
    inline def setCanConnectDirectly(value: Boolean): Self = StObject.set(x, "canConnectDirectly", value.asInstanceOf[js.Any])
    
    inline def setProxyUris(value: IVectorView[Uri]): Self = StObject.set(x, "proxyUris", value.asInstanceOf[js.Any])
  }
}
