package typingsJapgolly.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDiscovererRequest extends StObject {
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: string
}
object StopDiscovererRequest {
  
  inline def apply(DiscovererId: string): StopDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDiscovererRequest]
  }
  
  extension [Self <: StopDiscovererRequest](x: Self) {
    
    inline def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
  }
}
