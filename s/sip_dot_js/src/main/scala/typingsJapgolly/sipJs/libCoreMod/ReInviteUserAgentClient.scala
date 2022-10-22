package typingsJapgolly.sipJs.libCoreMod

import typingsJapgolly.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ReInviteUserAgentClient")
@js.native
open class ReInviteUserAgentClient protected ()
  extends typingsJapgolly.sipJs.libCoreUserAgentsMod.ReInviteUserAgentClient {
  def this(dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog) = this()
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate
  ) = this()
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog,
    delegate: Unit,
    options: RequestOptions
  ) = this()
  def this(
    dialog: typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate,
    options: RequestOptions
  ) = this()
}
