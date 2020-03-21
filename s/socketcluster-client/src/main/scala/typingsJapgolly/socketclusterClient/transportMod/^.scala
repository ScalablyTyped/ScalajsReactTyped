package typingsJapgolly.socketclusterClient.transportMod

import typingsJapgolly.socketclusterClient.authMod.AGAuthEngine
import typingsJapgolly.socketclusterClient.clientsocketMod.ClientOptions
import typingsJapgolly.socketclusterServer.serverMod.CodecEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-client/lib/transport", JSImport.Namespace)
@js.native
class ^ protected () extends AGTransport {
  def this(authEngine: AGAuthEngine, codecEngine: CodecEngine, options: ClientOptions) = this()
  def this(
    authEngine: AGAuthEngine,
    codecEngine: CodecEngine,
    options: ClientOptions,
    wsOptions: typingsJapgolly.ws.mod.ClientOptions
  ) = this()
  def this(
    authEngine: AGAuthEngine,
    codecEngine: CodecEngine,
    options: ClientOptions,
    wsOptions: typingsJapgolly.ws.mod.ClientOptions,
    handlers: TransportHandlers
  ) = this()
}

