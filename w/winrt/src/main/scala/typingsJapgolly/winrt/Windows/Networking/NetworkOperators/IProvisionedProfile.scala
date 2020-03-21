package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkCostType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvisionedProfile extends js.Object {
  def updateCost(value: NetworkCostType): Unit
  def updateUsage(value: ProfileUsage): Unit
}

object IProvisionedProfile {
  @scala.inline
  def apply(updateCost: NetworkCostType => Callback, updateUsage: ProfileUsage => Callback): IProvisionedProfile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("updateCost")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkCostType) => updateCost(t0).runNow()))
    __obj.updateDynamic("updateUsage")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Networking.NetworkOperators.ProfileUsage) => updateUsage(t0).runNow()))
    __obj.asInstanceOf[IProvisionedProfile]
  }
}

