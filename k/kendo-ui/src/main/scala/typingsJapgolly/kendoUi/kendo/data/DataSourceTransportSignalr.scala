package typingsJapgolly.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportSignalr extends js.Object {
  var client: js.UndefOr[DataSourceTransportSignalrClient] = js.undefined
  var hub: js.UndefOr[js.Any] = js.undefined
  var promise: js.UndefOr[js.Any] = js.undefined
  var server: js.UndefOr[DataSourceTransportSignalrServer] = js.undefined
}

object DataSourceTransportSignalr {
  @scala.inline
  def apply(
    client: DataSourceTransportSignalrClient = null,
    hub: js.Any = null,
    promise: js.Any = null,
    server: DataSourceTransportSignalrServer = null
  ): DataSourceTransportSignalr = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (hub != null) __obj.updateDynamic("hub")(hub.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportSignalr]
  }
}

