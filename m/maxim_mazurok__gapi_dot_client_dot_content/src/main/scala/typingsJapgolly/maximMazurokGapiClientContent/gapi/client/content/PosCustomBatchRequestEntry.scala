package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PosCustomBatchRequestEntry extends StObject {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** The inventory to submit. This should be set only if the method is `inventory`. */
  var inventory: js.UndefOr[PosInventory] = js.undefined
  
  /** The ID of the POS data provider. */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /** The method of the batch entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`" - "`inventory`" - "`sale`" */
  var method: js.UndefOr[String] = js.undefined
  
  /** The sale information to submit. This should be set only if the method is `sale`. */
  var sale: js.UndefOr[PosSale] = js.undefined
  
  /** The store information to submit. This should be set only if the method is `insert`. */
  var store: js.UndefOr[PosStore] = js.undefined
  
  /** The store code. This should be set only if the method is `delete` or `get`. */
  var storeCode: js.UndefOr[String] = js.undefined
  
  /** The ID of the account for which to get/submit data. */
  var targetMerchantId: js.UndefOr[String] = js.undefined
}
object PosCustomBatchRequestEntry {
  
  inline def apply(): PosCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosCustomBatchRequestEntry]
  }
  
  extension [Self <: PosCustomBatchRequestEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setInventory(value: PosInventory): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    inline def setInventoryUndefined: Self = StObject.set(x, "inventory", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSale(value: PosSale): Self = StObject.set(x, "sale", value.asInstanceOf[js.Any])
    
    inline def setSaleUndefined: Self = StObject.set(x, "sale", js.undefined)
    
    inline def setStore(value: PosStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    inline def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setTargetMerchantId(value: String): Self = StObject.set(x, "targetMerchantId", value.asInstanceOf[js.Any])
    
    inline def setTargetMerchantIdUndefined: Self = StObject.set(x, "targetMerchantId", js.undefined)
  }
}
