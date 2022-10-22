package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallLogConfig extends StObject {
  
  /** This field denotes whether to enable logging for a particular firewall rule. */
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /** This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs. */
  var metadata: js.UndefOr[String] = js.undefined
}
object FirewallLogConfig {
  
  inline def apply(): FirewallLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallLogConfig]
  }
  
  extension [Self <: FirewallLogConfig](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
