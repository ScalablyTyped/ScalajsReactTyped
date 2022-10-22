package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkCostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedProfile
  extends StObject
     with IProvisionedProfile
object ProvisionedProfile {
  
  inline def apply(updateCost: NetworkCostType => Callback, updateUsage: ProfileUsage => Callback): ProvisionedProfile = {
    val __obj = js.Dynamic.literal(updateCost = js.Any.fromFunction1((t0: NetworkCostType) => updateCost(t0).runNow()), updateUsage = js.Any.fromFunction1((t0: ProfileUsage) => updateUsage(t0).runNow()))
    __obj.asInstanceOf[ProvisionedProfile]
  }
}
