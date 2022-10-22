package typingsJapgolly.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataflowEndpointConfig extends StObject {
  
  /**
    * Name of a dataflow endpoint.
    */
  var dataflowEndpointName: String
  
  /**
    * Region of a dataflow endpoint.
    */
  var dataflowEndpointRegion: js.UndefOr[String] = js.undefined
}
object DataflowEndpointConfig {
  
  inline def apply(dataflowEndpointName: String): DataflowEndpointConfig = {
    val __obj = js.Dynamic.literal(dataflowEndpointName = dataflowEndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataflowEndpointConfig]
  }
  
  extension [Self <: DataflowEndpointConfig](x: Self) {
    
    inline def setDataflowEndpointName(value: String): Self = StObject.set(x, "dataflowEndpointName", value.asInstanceOf[js.Any])
    
    inline def setDataflowEndpointRegion(value: String): Self = StObject.set(x, "dataflowEndpointRegion", value.asInstanceOf[js.Any])
    
    inline def setDataflowEndpointRegionUndefined: Self = StObject.set(x, "dataflowEndpointRegion", js.undefined)
  }
}
