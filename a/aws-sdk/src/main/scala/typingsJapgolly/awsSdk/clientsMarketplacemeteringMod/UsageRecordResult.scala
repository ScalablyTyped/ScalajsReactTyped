package typingsJapgolly.awsSdk.clientsMarketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageRecordResult extends StObject {
  
  /**
    * The MeteringRecordId is a unique identifier for this metering event.
    */
  var MeteringRecordId: js.UndefOr[String] = js.undefined
  
  /**
    * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.    Success- The UsageRecord was accepted and honored by BatchMeterUsage.    CustomerNotSubscribed- The CustomerIdentifier specified is not able to use your product. The UsageRecord was not honored. There are three causes for this result:   The customer identifier is invalid.   The customer identifier provided in the metering record does not have an active agreement or subscription with this product. Future UsageRecords for this customer will fail until the customer subscribes to your product.   The customer's AWS account was suspended.      DuplicateRecord- Indicates that the UsageRecord was invalid and not honored. A previously metered UsageRecord had the same customer, dimension, and time, but a different quantity.  
    */
  var Status: js.UndefOr[UsageRecordResultStatus] = js.undefined
  
  /**
    * The UsageRecord that was part of the BatchMeterUsage request.
    */
  var UsageRecord: js.UndefOr[typingsJapgolly.awsSdk.clientsMarketplacemeteringMod.UsageRecord] = js.undefined
}
object UsageRecordResult {
  
  inline def apply(): UsageRecordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageRecordResult]
  }
  
  extension [Self <: UsageRecordResult](x: Self) {
    
    inline def setMeteringRecordId(value: String): Self = StObject.set(x, "MeteringRecordId", value.asInstanceOf[js.Any])
    
    inline def setMeteringRecordIdUndefined: Self = StObject.set(x, "MeteringRecordId", js.undefined)
    
    inline def setStatus(value: UsageRecordResultStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUsageRecord(value: UsageRecord): Self = StObject.set(x, "UsageRecord", value.asInstanceOf[js.Any])
    
    inline def setUsageRecordUndefined: Self = StObject.set(x, "UsageRecord", js.undefined)
  }
}
