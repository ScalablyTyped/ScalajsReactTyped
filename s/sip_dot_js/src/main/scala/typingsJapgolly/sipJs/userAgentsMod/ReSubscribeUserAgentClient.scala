package typingsJapgolly.sipJs.userAgentsMod

import typingsJapgolly.sipJs.dialogsMod.SubscriptionDialog
import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends typingsJapgolly.sipJs.reSubscribeUserAgentClientMod.ReSubscribeUserAgentClient {
  def this(dialog: SubscriptionDialog) = this()
  def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
}

