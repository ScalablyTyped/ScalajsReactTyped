package typingsJapgolly.paypalPayoutsSdk.mod

import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.BALANCE
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.CANCELED
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.DENIED
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.PENDING
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.PROCESSING
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.SUCCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayoutBatchHeader
  extends StObject
     with PayoutHeader {
  
  var amount: js.UndefOr[Currency] = js.undefined
  
  var fees: js.UndefOr[Currency] = js.undefined
  
  var funding_source: js.UndefOr[BALANCE] = js.undefined
  
  var time_closed: js.UndefOr[String] = js.undefined
  
  var time_completed: js.UndefOr[String] = js.undefined
}
object PayoutBatchHeader {
  
  inline def apply(
    batch_status: CANCELED | DENIED | PENDING | PROCESSING | SUCCESS,
    payout_batch_id: String,
    sender_batch_header: PayoutSenderBatchHeader
  ): PayoutBatchHeader = {
    val __obj = js.Dynamic.literal(batch_status = batch_status.asInstanceOf[js.Any], payout_batch_id = payout_batch_id.asInstanceOf[js.Any], sender_batch_header = sender_batch_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayoutBatchHeader]
  }
  
  extension [Self <: PayoutBatchHeader](x: Self) {
    
    inline def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setFees(value: Currency): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    inline def setFunding_source(value: BALANCE): Self = StObject.set(x, "funding_source", value.asInstanceOf[js.Any])
    
    inline def setFunding_sourceUndefined: Self = StObject.set(x, "funding_source", js.undefined)
    
    inline def setTime_closed(value: String): Self = StObject.set(x, "time_closed", value.asInstanceOf[js.Any])
    
    inline def setTime_closedUndefined: Self = StObject.set(x, "time_closed", js.undefined)
    
    inline def setTime_completed(value: String): Self = StObject.set(x, "time_completed", value.asInstanceOf[js.Any])
    
    inline def setTime_completedUndefined: Self = StObject.set(x, "time_completed", js.undefined)
  }
}
