package typingsJapgolly.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectCustomKeyStoreRequest extends StObject {
  
  /**
    * Enter the key store ID of the custom key store that you want to connect. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: CustomKeyStoreIdType
}
object ConnectCustomKeyStoreRequest {
  
  inline def apply(CustomKeyStoreId: CustomKeyStoreIdType): ConnectCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CustomKeyStoreId = CustomKeyStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectCustomKeyStoreRequest]
  }
  
  extension [Self <: ConnectCustomKeyStoreRequest](x: Self) {
    
    inline def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
  }
}
