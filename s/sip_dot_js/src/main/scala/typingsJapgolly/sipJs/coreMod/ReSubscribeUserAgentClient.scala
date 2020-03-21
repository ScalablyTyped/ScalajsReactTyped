package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends typingsJapgolly.sipJs.userAgentsMod.ReSubscribeUserAgentClient {
  def this(dialog: typingsJapgolly.sipJs.dialogsMod.SubscriptionDialog) = this()
  def this(dialog: typingsJapgolly.sipJs.dialogsMod.SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsJapgolly.sipJs.dialogsMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

