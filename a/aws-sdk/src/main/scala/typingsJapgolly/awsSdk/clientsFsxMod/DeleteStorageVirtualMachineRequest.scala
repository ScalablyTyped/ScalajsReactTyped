package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStorageVirtualMachineRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The ID of the SVM that you want to delete.
    */
  var StorageVirtualMachineId: typingsJapgolly.awsSdk.clientsFsxMod.StorageVirtualMachineId
}
object DeleteStorageVirtualMachineRequest {
  
  inline def apply(StorageVirtualMachineId: StorageVirtualMachineId): DeleteStorageVirtualMachineRequest = {
    val __obj = js.Dynamic.literal(StorageVirtualMachineId = StorageVirtualMachineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStorageVirtualMachineRequest]
  }
  
  extension [Self <: DeleteStorageVirtualMachineRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setStorageVirtualMachineId(value: StorageVirtualMachineId): Self = StObject.set(x, "StorageVirtualMachineId", value.asInstanceOf[js.Any])
  }
}
