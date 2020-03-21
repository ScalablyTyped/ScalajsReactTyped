package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsJapgolly.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends typingsJapgolly.sipJs.userAgentsMod.ReInviteUserAgentClient {
  def this(dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
  def this(
    dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate,
    options: RequestOptions
  ) = this()
}

