package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.dialogStateMod.DialogState
import typingsJapgolly.sipJs.sessionSessionDelegateMod.SessionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SessionDialog")
@js.native
class SessionDialog protected ()
  extends typingsJapgolly.sipJs.coreMod.SessionDialog {
  def this(
    initialTransaction: typingsJapgolly.sipJs.transactionsMod.InviteClientTransaction,
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typingsJapgolly.sipJs.transactionsMod.InviteServerTransaction,
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typingsJapgolly.sipJs.transactionsMod.InviteClientTransaction,
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  def this(
    initialTransaction: typingsJapgolly.sipJs.transactionsMod.InviteServerTransaction,
    core: typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
}

