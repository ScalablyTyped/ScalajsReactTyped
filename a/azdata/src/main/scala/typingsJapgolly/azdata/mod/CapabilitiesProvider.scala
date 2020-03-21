package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapabilitiesProvider extends DataProvider {
  def getServerCapabilities(client: DataProtocolClientCapabilities): Thenable[DataProtocolServerCapabilities]
}

object CapabilitiesProvider {
  @scala.inline
  def apply(
    getServerCapabilities: DataProtocolClientCapabilities => CallbackTo[Thenable[DataProtocolServerCapabilities]],
    providerId: String,
    handle: Int | Double = null
  ): CapabilitiesProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("getServerCapabilities")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.DataProtocolClientCapabilities) => getServerCapabilities(t0).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilitiesProvider]
  }
}

