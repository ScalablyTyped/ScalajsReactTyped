package typingsJapgolly.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataflowEndpointGroupResponse extends StObject {
  
  /**
    * ARN of a dataflow endpoint group.
    */
  var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.undefined
  
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Details of a dataflow endpoint.
    */
  var endpointsDetails: js.UndefOr[EndpointDetailsList] = js.undefined
  
  /**
    * Tags assigned to a dataflow endpoint group.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object GetDataflowEndpointGroupResponse {
  
  inline def apply(): GetDataflowEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataflowEndpointGroupResponse]
  }
  
  extension [Self <: GetDataflowEndpointGroupResponse](x: Self) {
    
    inline def setDataflowEndpointGroupArn(value: DataflowEndpointGroupArn): Self = StObject.set(x, "dataflowEndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDataflowEndpointGroupArnUndefined: Self = StObject.set(x, "dataflowEndpointGroupArn", js.undefined)
    
    inline def setDataflowEndpointGroupId(value: String): Self = StObject.set(x, "dataflowEndpointGroupId", value.asInstanceOf[js.Any])
    
    inline def setDataflowEndpointGroupIdUndefined: Self = StObject.set(x, "dataflowEndpointGroupId", js.undefined)
    
    inline def setEndpointsDetails(value: EndpointDetailsList): Self = StObject.set(x, "endpointsDetails", value.asInstanceOf[js.Any])
    
    inline def setEndpointsDetailsUndefined: Self = StObject.set(x, "endpointsDetails", js.undefined)
    
    inline def setEndpointsDetailsVarargs(value: EndpointDetails*): Self = StObject.set(x, "endpointsDetails", js.Array(value*))
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
