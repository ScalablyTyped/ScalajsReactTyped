package typingsJapgolly.systeminformation.mod

import typingsJapgolly.systeminformation.mod.Systeminformation.WifiNetworkData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "wifiNetworks")
@js.native
object wifiNetworks extends js.Object {
  def apply(): js.Promise[js.Array[WifiNetworkData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[WifiNetworkData], _]): js.Promise[js.Array[WifiNetworkData]] = js.native
}

