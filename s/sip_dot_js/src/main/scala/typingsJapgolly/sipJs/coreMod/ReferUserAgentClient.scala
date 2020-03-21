package typingsJapgolly.sipJs.coreMod

import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReferUserAgentClient")
@js.native
class ReferUserAgentClient protected ()
  extends typingsJapgolly.sipJs.userAgentsMod.ReferUserAgentClient {
  def this(dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsJapgolly.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

