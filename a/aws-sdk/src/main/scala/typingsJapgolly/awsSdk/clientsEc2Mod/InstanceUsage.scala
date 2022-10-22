package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceUsage extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that is making use of the Capacity Reservation.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of instances the Amazon Web Services account currently has in the Capacity Reservation.
    */
  var UsedInstanceCount: js.UndefOr[Integer] = js.undefined
}
object InstanceUsage {
  
  inline def apply(): InstanceUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceUsage]
  }
  
  extension [Self <: InstanceUsage](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setUsedInstanceCount(value: Integer): Self = StObject.set(x, "UsedInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setUsedInstanceCountUndefined: Self = StObject.set(x, "UsedInstanceCount", js.undefined)
  }
}
