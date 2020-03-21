package typingsJapgolly.openfin

import typingsJapgolly.openfin.channelChannelMod.ChannelBase
import typingsJapgolly.openfin.channelChannelMod.ProviderIdentity
import typingsJapgolly.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/interappbus/channel/provider", JSImport.Namespace)
@js.native
object providerMod extends js.Object {
  @js.native
  class ChannelProvider protected () extends ChannelBase {
    def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
    var connectListener: js.Any = js.native
    var connections: js.Array[Identity] = js.native
    var disconnectListener: js.Any = js.native
    def destroy(): js.Promise[Unit] = js.native
    def dispatch(to: Identity, action: String, payload: js.Any): js.Promise[_] = js.native
    def onConnection(listener: ConnectionListener): Unit = js.native
    def onDisconnection(listener: DisconnectionListener): Unit = js.native
    def processConnection(senderId: Identity, payload: js.Any): js.Promise[_] = js.native
    def publish(action: String, payload: js.Any): js.Array[js.Promise[_]] = js.native
  }
  
  type ConnectionListener = js.Function2[/* identity */ Identity, /* connectionMessage */ js.UndefOr[js.Any], js.Any]
  type DisconnectionListener = js.Function1[/* identity */ Identity, js.Any]
}

