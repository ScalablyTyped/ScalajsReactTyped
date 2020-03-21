package typingsJapgolly.sipJs.userAgentsMod

import typingsJapgolly.sipJs.dialogsMod.SessionDialog
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ReferUserAgentClient")
@js.native
class ReferUserAgentClient protected ()
  extends typingsJapgolly.sipJs.referUserAgentClientMod.ReferUserAgentClient {
  def this(dialog: SessionDialog) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
}

