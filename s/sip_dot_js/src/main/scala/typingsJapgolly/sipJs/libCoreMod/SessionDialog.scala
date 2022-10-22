package typingsJapgolly.sipJs.libCoreMod

import typingsJapgolly.sipJs.libCoreDialogsDialogStateMod.DialogState
import typingsJapgolly.sipJs.libCoreSessionSessionDelegateMod.SessionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "SessionDialog")
@js.native
open class SessionDialog protected ()
  extends typingsJapgolly.sipJs.libCoreDialogsMod.SessionDialog {
  def this(
    initialTransaction: typingsJapgolly.sipJs.libCoreTransactionsMod.InviteClientTransaction,
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typingsJapgolly.sipJs.libCoreTransactionsMod.InviteServerTransaction,
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typingsJapgolly.sipJs.libCoreTransactionsMod.InviteClientTransaction,
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  def this(
    initialTransaction: typingsJapgolly.sipJs.libCoreTransactionsMod.InviteServerTransaction,
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
}
