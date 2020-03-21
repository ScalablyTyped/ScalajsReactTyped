package typingsJapgolly.ndnJs.faceMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ndnJs.transportMod.Transport
import typingsJapgolly.ndnJs.transportMod.TransportConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceCtorOptions extends js.Object {
  var connectionInfo: js.UndefOr[TransportConnectionInfo | Null] = js.undefined
  var getConnectionInfo: js.UndefOr[js.Function0[TransportConnectionInfo]] = js.undefined
  var getTransport: js.UndefOr[js.Function0[Transport]] = js.undefined
  var host: js.UndefOr[String | Null] = js.undefined
  var port: js.UndefOr[Double | Null] = js.undefined
}

object FaceCtorOptions {
  @scala.inline
  def apply(
    connectionInfo: TransportConnectionInfo = null,
    getConnectionInfo: js.UndefOr[CallbackTo[TransportConnectionInfo]] = js.undefined,
    getTransport: js.UndefOr[CallbackTo[Transport]] = js.undefined,
    host: String = null,
    port: Int | Double = null
  ): FaceCtorOptions = {
    val __obj = js.Dynamic.literal()
    if (connectionInfo != null) __obj.updateDynamic("connectionInfo")(connectionInfo.asInstanceOf[js.Any])
    getConnectionInfo.foreach(p => __obj.updateDynamic("getConnectionInfo")(p.toJsFn))
    getTransport.foreach(p => __obj.updateDynamic("getTransport")(p.toJsFn))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceCtorOptions]
  }
}

