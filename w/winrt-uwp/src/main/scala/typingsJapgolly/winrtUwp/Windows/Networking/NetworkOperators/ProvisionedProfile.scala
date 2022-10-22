package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Networking.Connectivity.NetworkCostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Updates cost and usage information for a mobile broadband profile. */
trait ProvisionedProfile extends StObject {
  
  /**
    * Called by the application to update the cost for a specific profile.
    * @param value Updates the cost for the profile.
    */
  def updateCost(value: NetworkCostType): Unit
  
  /**
    * Called by the application to update the usage for a specific profile.
    * @param value Updates the usage for a profile.
    */
  def updateUsage(value: ProfileUsage): Unit
}
object ProvisionedProfile {
  
  inline def apply(updateCost: NetworkCostType => Callback, updateUsage: ProfileUsage => Callback): ProvisionedProfile = {
    val __obj = js.Dynamic.literal(updateCost = js.Any.fromFunction1((t0: NetworkCostType) => updateCost(t0).runNow()), updateUsage = js.Any.fromFunction1((t0: ProfileUsage) => updateUsage(t0).runNow()))
    __obj.asInstanceOf[ProvisionedProfile]
  }
  
  extension [Self <: ProvisionedProfile](x: Self) {
    
    inline def setUpdateCost(value: NetworkCostType => Callback): Self = StObject.set(x, "updateCost", js.Any.fromFunction1((t0: NetworkCostType) => value(t0).runNow()))
    
    inline def setUpdateUsage(value: ProfileUsage => Callback): Self = StObject.set(x, "updateUsage", js.Any.fromFunction1((t0: ProfileUsage) => value(t0).runNow()))
  }
}
