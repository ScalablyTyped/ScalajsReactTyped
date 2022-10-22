package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcPeeringConnectionsInput extends StObject {
  
  /**
    * A unique identifier for the fleet. You can use either the fleet ID or ARN value.
    */
  var FleetId: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.FleetId] = js.undefined
}
object DescribeVpcPeeringConnectionsInput {
  
  inline def apply(): DescribeVpcPeeringConnectionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsInput]
  }
  
  extension [Self <: DescribeVpcPeeringConnectionsInput](x: Self) {
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
