package typingsJapgolly.openfin.interappbusChannelMod

import typingsJapgolly.openfin.baseMod.EmitterBase
import typingsJapgolly.openfin.channelChannelMod.ProviderIdentity
import typingsJapgolly.openfin.channelMod.ChannelEvents
import typingsJapgolly.openfin.clientMod.ChannelClient
import typingsJapgolly.openfin.providerMod.ChannelProvider
import typingsJapgolly.openfin.transportMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/interappbus/channel", "Channel")
@js.native
class Channel protected () extends EmitterBase[ChannelEvents] {
  def this(wire: default) = this()
  var channelMap: js.Any = js.native
  var processChannelConnection: js.Any = js.native
  var processChannelMessage: js.Any = js.native
  def connect(channelName: String): js.Promise[ChannelClient] = js.native
  def connect(channelName: String, options: ConnectOptions): js.Promise[ChannelClient] = js.native
  def create(channelName: String): js.Promise[ChannelProvider] = js.native
  def getAllChannels(): js.Promise[js.Array[ProviderIdentity]] = js.native
  def onChannelConnect(listener: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Unit] = js.native
  def onChannelDisconnect(listener: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Unit] = js.native
  def onmessage(msg: ChannelMessage): Boolean = js.native
  /* protected */ def removeChannelFromMap(mapKey: String): Unit = js.native
}

