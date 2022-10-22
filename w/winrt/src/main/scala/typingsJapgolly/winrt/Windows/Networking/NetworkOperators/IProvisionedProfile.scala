package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkCostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProvisionedProfile extends StObject {
  
  def updateCost(value: NetworkCostType): Unit
  
  def updateUsage(value: ProfileUsage): Unit
}
object IProvisionedProfile {
  
  inline def apply(updateCost: NetworkCostType => Callback, updateUsage: ProfileUsage => Callback): IProvisionedProfile = {
    val __obj = js.Dynamic.literal(updateCost = js.Any.fromFunction1((t0: NetworkCostType) => updateCost(t0).runNow()), updateUsage = js.Any.fromFunction1((t0: ProfileUsage) => updateUsage(t0).runNow()))
    __obj.asInstanceOf[IProvisionedProfile]
  }
  
  extension [Self <: IProvisionedProfile](x: Self) {
    
    inline def setUpdateCost(value: NetworkCostType => Callback): Self = StObject.set(x, "updateCost", js.Any.fromFunction1((t0: NetworkCostType) => value(t0).runNow()))
    
    inline def setUpdateUsage(value: ProfileUsage => Callback): Self = StObject.set(x, "updateUsage", js.Any.fromFunction1((t0: ProfileUsage) => value(t0).runNow()))
  }
}
