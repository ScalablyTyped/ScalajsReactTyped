package typingsJapgolly.paypalPayoutsSdk.mod

import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.BLOCKED
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.FAILED
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.ONHOLD
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.PENDING
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.REFUNDED
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.RETURNED
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.REVERSED
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.SUCCESS
import typingsJapgolly.paypalPayoutsSdk.paypalPayoutsSdkStrings.UNCLAIMED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayoutBatchItems extends StObject {
  
  var activity_id: js.UndefOr[String] = js.undefined
  
  var currency_conversion: js.UndefOr[PayoutCurrencyConversion] = js.undefined
  
  var errors: js.UndefOr[Any] = js.undefined
  
  var links: js.UndefOr[js.Array[LinkDescription]] = js.undefined
  
  var payout_batch_id: String
  
  var payout_item: PayoutItemDetail
  
  var payout_item_fee: js.UndefOr[Currency] = js.undefined
  
  var payout_item_id: String
  
  var time_processed: js.UndefOr[String] = js.undefined
  
  var transaction_id: js.UndefOr[String] = js.undefined
  
  var transaction_status: js.UndefOr[
    BLOCKED | FAILED | ONHOLD | PENDING | REFUNDED | RETURNED | REVERSED | SUCCESS | UNCLAIMED
  ] = js.undefined
}
object PayoutBatchItems {
  
  inline def apply(payout_batch_id: String, payout_item: PayoutItemDetail, payout_item_id: String): PayoutBatchItems = {
    val __obj = js.Dynamic.literal(payout_batch_id = payout_batch_id.asInstanceOf[js.Any], payout_item = payout_item.asInstanceOf[js.Any], payout_item_id = payout_item_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayoutBatchItems]
  }
  
  extension [Self <: PayoutBatchItems](x: Self) {
    
    inline def setActivity_id(value: String): Self = StObject.set(x, "activity_id", value.asInstanceOf[js.Any])
    
    inline def setActivity_idUndefined: Self = StObject.set(x, "activity_id", js.undefined)
    
    inline def setCurrency_conversion(value: PayoutCurrencyConversion): Self = StObject.set(x, "currency_conversion", value.asInstanceOf[js.Any])
    
    inline def setCurrency_conversionUndefined: Self = StObject.set(x, "currency_conversion", js.undefined)
    
    inline def setErrors(value: Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setLinks(value: js.Array[LinkDescription]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: LinkDescription*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setPayout_batch_id(value: String): Self = StObject.set(x, "payout_batch_id", value.asInstanceOf[js.Any])
    
    inline def setPayout_item(value: PayoutItemDetail): Self = StObject.set(x, "payout_item", value.asInstanceOf[js.Any])
    
    inline def setPayout_item_fee(value: Currency): Self = StObject.set(x, "payout_item_fee", value.asInstanceOf[js.Any])
    
    inline def setPayout_item_feeUndefined: Self = StObject.set(x, "payout_item_fee", js.undefined)
    
    inline def setPayout_item_id(value: String): Self = StObject.set(x, "payout_item_id", value.asInstanceOf[js.Any])
    
    inline def setTime_processed(value: String): Self = StObject.set(x, "time_processed", value.asInstanceOf[js.Any])
    
    inline def setTime_processedUndefined: Self = StObject.set(x, "time_processed", js.undefined)
    
    inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    inline def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    
    inline def setTransaction_status(value: BLOCKED | FAILED | ONHOLD | PENDING | REFUNDED | RETURNED | REVERSED | SUCCESS | UNCLAIMED): Self = StObject.set(x, "transaction_status", value.asInstanceOf[js.Any])
    
    inline def setTransaction_statusUndefined: Self = StObject.set(x, "transaction_status", js.undefined)
  }
}
