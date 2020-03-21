package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "PrackUserAgentClient")
@js.native
class PrackUserAgentClient protected ()
  extends typingsJapgolly.sipJs.userAgentsMod.PrackUserAgentClient {
  def this(dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

