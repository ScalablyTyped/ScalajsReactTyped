package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWirelessGatewayTaskDefinitionsRequest extends StObject {
  
  /**
    * The maximum number of results to return in this operation.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.MaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
  
  /**
    * A filter to list only the wireless gateway task definitions that use this task definition type.
    */
  var TaskDefinitionType: js.UndefOr[WirelessGatewayTaskDefinitionType] = js.undefined
}
object ListWirelessGatewayTaskDefinitionsRequest {
  
  inline def apply(): ListWirelessGatewayTaskDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWirelessGatewayTaskDefinitionsRequest]
  }
  
  extension [Self <: ListWirelessGatewayTaskDefinitionsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTaskDefinitionType(value: WirelessGatewayTaskDefinitionType): Self = StObject.set(x, "TaskDefinitionType", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionTypeUndefined: Self = StObject.set(x, "TaskDefinitionType", js.undefined)
  }
}
