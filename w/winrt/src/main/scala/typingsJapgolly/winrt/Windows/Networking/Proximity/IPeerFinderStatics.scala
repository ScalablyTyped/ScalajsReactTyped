package typingsJapgolly.winrt.Windows.Networking.Proximity

import typingsJapgolly.winrt.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeerFinderStatics extends js.Object {
  var allowBluetooth: Boolean = js.native
  var allowInfrastructure: Boolean = js.native
  var allowWiFiDirect: Boolean = js.native
  var alternateIdentities: IMap[String, String] = js.native
  var displayName: String = js.native
  var onconnectionrequested: js.Any = js.native
  var ontriggeredconnectionstatechanged: js.Any = js.native
  var supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
  def connectAsync(peerInformation: PeerInformation): IAsyncOperation[StreamSocket] = js.native
  def findAllPeersAsync(): IAsyncOperation[IVectorView[PeerInformation]] = js.native
  def start(): Unit = js.native
  def start(peerMessage: String): Unit = js.native
  def stop(): Unit = js.native
}

