package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorageVirtualMachinesResponse extends StObject {
  
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.NextToken] = js.undefined
  
  /**
    * Returned after a successful DescribeStorageVirtualMachines operation, describing each SVM.
    */
  var StorageVirtualMachines: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.StorageVirtualMachines] = js.undefined
}
object DescribeStorageVirtualMachinesResponse {
  
  inline def apply(): DescribeStorageVirtualMachinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStorageVirtualMachinesResponse]
  }
  
  extension [Self <: DescribeStorageVirtualMachinesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStorageVirtualMachines(value: StorageVirtualMachines): Self = StObject.set(x, "StorageVirtualMachines", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachinesUndefined: Self = StObject.set(x, "StorageVirtualMachines", js.undefined)
    
    inline def setStorageVirtualMachinesVarargs(value: StorageVirtualMachine*): Self = StObject.set(x, "StorageVirtualMachines", js.Array(value*))
  }
}
