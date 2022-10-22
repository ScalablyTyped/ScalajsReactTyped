package typingsJapgolly.consumerDataStandards.energyMod

import typingsJapgolly.consumerDataStandards.anon.ServicePointIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountV2
  extends StObject
     with EnergyAccountBaseV2 {
  
  /**
    * The array of plans containing service points and associated plan details
    */
  var plans: js.Array[ServicePointIds]
}
object EnergyAccountV2 {
  
  inline def apply(accountId: String, plans: js.Array[ServicePointIds]): EnergyAccountV2 = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountV2]
  }
  
  extension [Self <: EnergyAccountV2](x: Self) {
    
    inline def setPlans(value: js.Array[ServicePointIds]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: ServicePointIds*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
