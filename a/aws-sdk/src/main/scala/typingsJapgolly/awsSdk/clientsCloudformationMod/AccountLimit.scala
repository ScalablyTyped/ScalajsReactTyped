package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLimit extends StObject {
  
  /**
    * The name of the account limit. Values: ConcurrentResourcesLimit | StackLimit | StackOutputsLimit 
    */
  var Name: js.UndefOr[LimitName] = js.undefined
  
  /**
    * The value that's associated with the account limit name.
    */
  var Value: js.UndefOr[LimitValue] = js.undefined
}
object AccountLimit {
  
  inline def apply(): AccountLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLimit]
  }
  
  extension [Self <: AccountLimit](x: Self) {
    
    inline def setName(value: LimitName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: LimitValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
