package typingsJapgolly.winrtUwp.Windows.Networking.Sockets

import typingsJapgolly.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a StreamWebSocket object. */
@JSGlobal("Windows.Networking.Sockets.StreamWebSocketInformation")
@js.native
abstract class StreamWebSocketInformation () extends js.Object {
  /** Gets bandwidth information for network data transfer on a StreamWebSocket object. */
  var bandwidthStatistics: BandwidthStatistics = js.native
  /** Gets the IP address associated with a StreamWebSocket object. */
  var localAddress: HostName = js.native
  /** Gets the WebSocket sub-protocol negotiated with the server during WebSocket handshake on a StreamWebSocket object. */
  var protocol: String = js.native
}

