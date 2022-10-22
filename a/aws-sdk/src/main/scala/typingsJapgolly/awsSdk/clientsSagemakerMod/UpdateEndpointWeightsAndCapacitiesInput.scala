package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointWeightsAndCapacitiesInput extends StObject {
  
  /**
    * An object that provides new capacity and weight values for a variant.
    */
  var DesiredWeightsAndCapacities: DesiredWeightAndCapacityList
  
  /**
    * The name of an existing SageMaker endpoint.
    */
  var EndpointName: typingsJapgolly.awsSdk.clientsSagemakerMod.EndpointName
}
object UpdateEndpointWeightsAndCapacitiesInput {
  
  inline def apply(DesiredWeightsAndCapacities: DesiredWeightAndCapacityList, EndpointName: EndpointName): UpdateEndpointWeightsAndCapacitiesInput = {
    val __obj = js.Dynamic.literal(DesiredWeightsAndCapacities = DesiredWeightsAndCapacities.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesInput]
  }
  
  extension [Self <: UpdateEndpointWeightsAndCapacitiesInput](x: Self) {
    
    inline def setDesiredWeightsAndCapacities(value: DesiredWeightAndCapacityList): Self = StObject.set(x, "DesiredWeightsAndCapacities", value.asInstanceOf[js.Any])
    
    inline def setDesiredWeightsAndCapacitiesVarargs(value: DesiredWeightAndCapacity*): Self = StObject.set(x, "DesiredWeightsAndCapacities", js.Array(value*))
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
  }
}
