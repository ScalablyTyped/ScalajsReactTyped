package typingsJapgolly.openfin

import typingsJapgolly.openfin.channelChannelMod.ChannelBase
import typingsJapgolly.openfin.channelChannelMod.ProviderIdentity
import typingsJapgolly.openfin.identityMod.Identity
import typingsJapgolly.openfin.notificationMod.NotificationOptions
import typingsJapgolly.openfin.transportMod.default
import typingsJapgolly.openfin.wireMod.ConnectConfig
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/main", JSImport.Namespace)
@js.native
object mainMod extends js.Object {
  @js.native
  class Application protected ()
    extends typingsJapgolly.openfin.applicationMod.Application {
    def this(wire: default, identity: Identity) = this()
  }
  
  @js.native
  class ChannelClient protected ()
    extends typingsJapgolly.openfin.clientMod.ChannelClient {
    def this(providerIdentity: ProviderIdentity, send: FnCall, channelMap: Map[String, ChannelBase]) = this()
  }
  
  @js.native
  class ChannelProvider protected ()
    extends typingsJapgolly.openfin.providerMod.ChannelProvider {
    def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
  }
  
  @js.native
  class Fin protected ()
    extends typingsJapgolly.openfin.finMod.default {
    def this(wire: default) = this()
  }
  
  @js.native
  class Frame protected ()
    extends typingsJapgolly.openfin.frameFrameMod.Frame {
    def this(wire: default, identity: Identity) = this()
  }
  
  @js.native
  class Notification protected ()
    extends typingsJapgolly.openfin.notificationMod.Notification {
    def this(wire: default, options: NotificationOptions) = this()
  }
  
  @js.native
  class System protected ()
    extends typingsJapgolly.openfin.systemSystemMod.default {
    def this(wire: default) = this()
  }
  
  @js.native
  class View protected ()
    extends typingsJapgolly.openfin.viewViewMod.View {
    def this(wire: default, identity: Identity) = this()
  }
  
  @js.native
  class Window protected ()
    extends typingsJapgolly.openfin.windowWindowMod.Window {
    def this(wire: default, identity: Identity) = this()
  }
  
  def connect(config: ConnectConfig): js.Promise[typingsJapgolly.openfin.finMod.default] = js.native
  def launch(config: ConnectConfig): js.Promise[Double] = js.native
}

