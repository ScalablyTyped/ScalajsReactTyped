package typingsJapgolly.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricProcessingConfig extends StObject {
  
  /**
    * The compute location for the given metric property. 
    */
  var computeLocation: ComputeLocation
}
object MetricProcessingConfig {
  
  inline def apply(computeLocation: ComputeLocation): MetricProcessingConfig = {
    val __obj = js.Dynamic.literal(computeLocation = computeLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricProcessingConfig]
  }
  
  extension [Self <: MetricProcessingConfig](x: Self) {
    
    inline def setComputeLocation(value: ComputeLocation): Self = StObject.set(x, "computeLocation", value.asInstanceOf[js.Any])
  }
}
