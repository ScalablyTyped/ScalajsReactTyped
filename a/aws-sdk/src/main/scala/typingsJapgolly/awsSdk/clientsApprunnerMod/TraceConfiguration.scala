package typingsJapgolly.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceConfiguration extends StObject {
  
  /**
    * The implementation provider chosen for tracing App Runner services.
    */
  var Vendor: TracingVendor
}
object TraceConfiguration {
  
  inline def apply(Vendor: TracingVendor): TraceConfiguration = {
    val __obj = js.Dynamic.literal(Vendor = Vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceConfiguration]
  }
  
  extension [Self <: TraceConfiguration](x: Self) {
    
    inline def setVendor(value: TracingVendor): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
  }
}
