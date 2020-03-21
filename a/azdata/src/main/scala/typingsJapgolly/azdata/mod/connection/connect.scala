package typingsJapgolly.azdata.mod.connection

import typingsJapgolly.azdata.mod.ConnectionResult
import typingsJapgolly.azdata.mod.IConnectionProfile
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "connection.connect")
@js.native
object connect extends js.Object {
  def apply(connectionProfile: IConnectionProfile): Thenable[ConnectionResult] = js.native
  def apply(connectionProfile: IConnectionProfile, saveConnection: Boolean): Thenable[ConnectionResult] = js.native
  def apply(connectionProfile: IConnectionProfile, saveConnection: Boolean, showDashboard: Boolean): Thenable[ConnectionResult] = js.native
}

