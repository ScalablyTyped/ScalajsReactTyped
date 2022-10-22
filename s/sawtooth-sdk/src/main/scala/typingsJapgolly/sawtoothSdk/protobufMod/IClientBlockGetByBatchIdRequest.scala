package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBlockGetByBatchIdRequest extends StObject {
  
  /** ClientBlockGetByBatchIdRequest batchId */
  var batchId: js.UndefOr[String | Null] = js.undefined
}
object IClientBlockGetByBatchIdRequest {
  
  inline def apply(): IClientBlockGetByBatchIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetByBatchIdRequest]
  }
  
  extension [Self <: IClientBlockGetByBatchIdRequest](x: Self) {
    
    inline def setBatchId(value: String): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
  }
}
