package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountUsage extends StObject {
  
  /**
    * The number of Lambda functions.
    */
  var FunctionCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
    */
  var TotalCodeSize: js.UndefOr[Long] = js.undefined
}
object AccountUsage {
  
  inline def apply(): AccountUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUsage]
  }
  
  extension [Self <: AccountUsage](x: Self) {
    
    inline def setFunctionCount(value: Long): Self = StObject.set(x, "FunctionCount", value.asInstanceOf[js.Any])
    
    inline def setFunctionCountUndefined: Self = StObject.set(x, "FunctionCount", js.undefined)
    
    inline def setTotalCodeSize(value: Long): Self = StObject.set(x, "TotalCodeSize", value.asInstanceOf[js.Any])
    
    inline def setTotalCodeSizeUndefined: Self = StObject.set(x, "TotalCodeSize", js.undefined)
  }
}
