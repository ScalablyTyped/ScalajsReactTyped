package typingsJapgolly.sipJs

import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.sipJs.coreMod.IncomingRequestMessage
import typingsJapgolly.sipJs.coreMod.InviteServerTransaction
import typingsJapgolly.sipJs.coreMod.Logger
import typingsJapgolly.sipJs.coreMod.NameAddrHeader
import typingsJapgolly.sipJs.coreMod.NonInviteServerTransaction
import typingsJapgolly.sipJs.enumsMod.TypeStrings
import typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.uAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/ServerContext", JSImport.Namespace)
@js.native
object serverContextMod extends js.Object {
  @js.native
  class ServerContext protected () extends EventEmitter {
    def this(ua: UA, incomingRequest: IncomingRequest) = this()
    var assertedIdentity: js.UndefOr[NameAddrHeader] = js.native
    var body: js.Any = js.native
    var contentType: js.UndefOr[String] = js.native
    var data: js.Any = js.native
    var incomingRequest: IncomingRequest = js.native
    var localIdentity: NameAddrHeader = js.native
    var logger: Logger = js.native
    var method: String = js.native
    var remoteIdentity: NameAddrHeader = js.native
    var request: IncomingRequestMessage = js.native
    var transaction: InviteServerTransaction | NonInviteServerTransaction = js.native
    var `type`: TypeStrings = js.native
    var ua: UA = js.native
    def accept(): js.Any = js.native
    def accept(options: js.Any): js.Any = js.native
    def onRequestTimeout(): Unit = js.native
    def onTransportError(): Unit = js.native
    def progress(): js.Any = js.native
    def progress(options: js.Any): js.Any = js.native
    def reject(): js.Any = js.native
    def reject(options: js.Any): js.Any = js.native
    def reply(): js.Any = js.native
    def reply(options: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ServerContext extends js.Object {
    def initializer(objectToConstruct: ServerContext, ua: UA, incomingRequest: IncomingRequest): Unit = js.native
  }
  
}

