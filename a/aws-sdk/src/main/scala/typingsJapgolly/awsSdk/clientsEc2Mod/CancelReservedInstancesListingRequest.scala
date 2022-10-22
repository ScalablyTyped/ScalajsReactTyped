package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelReservedInstancesListingRequest extends StObject {
  
  /**
    * The ID of the Reserved Instance listing.
    */
  var ReservedInstancesListingId: typingsJapgolly.awsSdk.clientsEc2Mod.ReservedInstancesListingId
}
object CancelReservedInstancesListingRequest {
  
  inline def apply(ReservedInstancesListingId: ReservedInstancesListingId): CancelReservedInstancesListingRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesListingId = ReservedInstancesListingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReservedInstancesListingRequest]
  }
  
  extension [Self <: CancelReservedInstancesListingRequest](x: Self) {
    
    inline def setReservedInstancesListingId(value: ReservedInstancesListingId): Self = StObject.set(x, "ReservedInstancesListingId", value.asInstanceOf[js.Any])
  }
}
