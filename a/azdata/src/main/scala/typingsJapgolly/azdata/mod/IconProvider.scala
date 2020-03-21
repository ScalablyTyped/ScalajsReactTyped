package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProvider extends DataProvider {
  def getConnectionIconId(connection: IConnectionProfile, serverInfo: ServerInfo): Thenable[String]
}

object IconProvider {
  @scala.inline
  def apply(
    getConnectionIconId: (IConnectionProfile, ServerInfo) => CallbackTo[Thenable[String]],
    providerId: String,
    handle: Int | Double = null
  ): IconProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("getConnectionIconId")(js.Any.fromFunction2((t0: typingsJapgolly.azdata.mod.IConnectionProfile, t1: typingsJapgolly.azdata.mod.ServerInfo) => getConnectionIconId(t0, t1).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProvider]
  }
}

