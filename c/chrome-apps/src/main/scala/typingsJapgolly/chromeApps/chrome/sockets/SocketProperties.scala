package typingsJapgolly.chromeApps.chrome.sockets

import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketProperties extends js.Object {
  /**
    * The size of the buffer used to receive data.
    * @default: 4096
    */
  var bufferSize: js.UndefOr[integer] = js.undefined
  /** An application-defined string associated with the socket. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Flag indicating if the socket is left open when the event page of the
    * application is unloaded. When the application is loaded, any sockets
    * previously opened with persistent=true can be fetched with *getSockets*.
    * @default false
    */
  var persistent: js.UndefOr[Boolean] = js.undefined
}

object SocketProperties {
  @scala.inline
  def apply(
    bufferSize: Int | Double = null,
    name: String = null,
    persistent: js.UndefOr[Boolean] = js.undefined
  ): SocketProperties = {
    val __obj = js.Dynamic.literal()
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketProperties]
  }
}

