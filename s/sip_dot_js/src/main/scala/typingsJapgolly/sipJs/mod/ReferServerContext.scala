package typingsJapgolly.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ReferServerContext")
@js.native
class ReferServerContext protected ()
  extends typingsJapgolly.sipJs.referContextMod.ReferServerContext {
  def this(
    ua: typingsJapgolly.sipJs.uAMod.UA,
    incomingRequest: typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest
  ) = this()
  def this(
    ua: typingsJapgolly.sipJs.uAMod.UA,
    incomingRequest: typingsJapgolly.sipJs.incomingRequestMod.IncomingRequest,
    session: typingsJapgolly.sipJs.sessionSessionMod.Session
  ) = this()
}

