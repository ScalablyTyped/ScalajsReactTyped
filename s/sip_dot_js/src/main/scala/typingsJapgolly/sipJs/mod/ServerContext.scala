package typingsJapgolly.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ServerContext")
@js.native
class ServerContext protected ()
  extends typingsJapgolly.sipJs.serverContextMod.ServerContext {
  def this(
    ua: typingsJapgolly.sipJs.uAMod.UA,
    incomingRequest: typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
  ) = this()
}

/* static members */
@JSImport("sip.js", "ServerContext")
@js.native
object ServerContext extends js.Object {
  def initializer(
    objectToConstruct: typingsJapgolly.sipJs.serverContextMod.ServerContext,
    ua: typingsJapgolly.sipJs.uAMod.UA,
    incomingRequest: typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
  ): Unit = js.native
}

