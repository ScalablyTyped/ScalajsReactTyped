package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Telemetry extends StObject {
  
  /** The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object Telemetry {
  
  inline def apply(): Telemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Telemetry]
  }
  
  extension [Self <: Telemetry](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
