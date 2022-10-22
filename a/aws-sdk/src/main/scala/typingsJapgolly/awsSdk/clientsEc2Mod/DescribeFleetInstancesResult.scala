package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetInstancesResult extends StObject {
  
  /**
    * The running instances. This list is refreshed periodically and might be out of date.
    */
  var ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.undefined
  
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.FleetId] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetInstancesResult {
  
  inline def apply(): DescribeFleetInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetInstancesResult]
  }
  
  extension [Self <: DescribeFleetInstancesResult](x: Self) {
    
    inline def setActiveInstances(value: ActiveInstanceSet): Self = StObject.set(x, "ActiveInstances", value.asInstanceOf[js.Any])
    
    inline def setActiveInstancesUndefined: Self = StObject.set(x, "ActiveInstances", js.undefined)
    
    inline def setActiveInstancesVarargs(value: ActiveInstance*): Self = StObject.set(x, "ActiveInstances", js.Array(value*))
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
