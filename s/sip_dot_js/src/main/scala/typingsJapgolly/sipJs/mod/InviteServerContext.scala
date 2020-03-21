package typingsJapgolly.sipJs.mod

import typingsJapgolly.sipJs.inviteMod.IncomingInviteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "InviteServerContext")
@js.native
class InviteServerContext protected ()
  extends typingsJapgolly.sipJs.libSessionMod.InviteServerContext {
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, incomingInviteRequest: IncomingInviteRequest) = this()
}

