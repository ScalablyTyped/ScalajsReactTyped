package typingsJapgolly.chrome

import typingsJapgolly.chrome.chrome.vpnProvider.VpnConfigCreationEvent
import typingsJapgolly.chrome.chrome.vpnProvider.VpnConfigRemovalEvent
import typingsJapgolly.chrome.chrome.vpnProvider.VpnPacketReceptionEvent
import typingsJapgolly.chrome.chrome.vpnProvider.VpnPlatformMessageEvent
import typingsJapgolly.chrome.chrome.vpnProvider.VpnSessionParameters
import typingsJapgolly.chrome.chrome.vpnProvider.VpnUiEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofvpnProvider extends js.Object {
  var onConfigCreated: VpnConfigCreationEvent = js.native
  var onConfigRemoved: VpnConfigRemovalEvent = js.native
  var onPacketReceived: VpnPacketReceptionEvent = js.native
  var onPlatformMessage: VpnPlatformMessageEvent = js.native
  var onUIEvent: VpnUiEvent = js.native
  def createConfig(name: String, callback: js.Function1[/* id */ String, Unit]): Unit = js.native
  def destroyConfig(id: String): Unit = js.native
  def destroyConfig(id: String, callback: js.Function): Unit = js.native
  def notifyConnectionStateChanged(state: String): Unit = js.native
  def notifyConnectionStateChanged(state: String, callback: js.Function): Unit = js.native
  def sendPacket(data: scala.scalajs.js.typedarray.ArrayBuffer): Unit = js.native
  def sendPacket(data: scala.scalajs.js.typedarray.ArrayBuffer, callback: js.Function): Unit = js.native
  def setParameters(parameters: VpnSessionParameters, callback: js.Function): Unit = js.native
}

