package typingsJapgolly.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReturnShippingLabelRequest extends StObject {
  
  /**
    * The ID for a job that you want to create the return shipping label for; for example, JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typingsJapgolly.awsSdk.clientsSnowballMod.JobId
  
  /**
    * The shipping speed for a particular job. This speed doesn't dictate how soon the device is returned to Amazon Web Services. This speed represents how quickly it moves to its destination while in transit. Regional shipping speeds are as follows:
    */
  var ShippingOption: js.UndefOr[typingsJapgolly.awsSdk.clientsSnowballMod.ShippingOption] = js.undefined
}
object CreateReturnShippingLabelRequest {
  
  inline def apply(JobId: JobId): CreateReturnShippingLabelRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReturnShippingLabelRequest]
  }
  
  extension [Self <: CreateReturnShippingLabelRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setShippingOption(value: ShippingOption): Self = StObject.set(x, "ShippingOption", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionUndefined: Self = StObject.set(x, "ShippingOption", js.undefined)
  }
}
