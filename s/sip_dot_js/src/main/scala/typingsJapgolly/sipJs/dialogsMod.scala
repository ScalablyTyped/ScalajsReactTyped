package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.dialogStateMod.DialogState
import typingsJapgolly.sipJs.messagesMod.IncomingRequestMessage
import typingsJapgolly.sipJs.messagesMod.IncomingResponseMessage
import typingsJapgolly.sipJs.messagesMod.OutgoingRequestMessage
import typingsJapgolly.sipJs.sessionSessionDelegateMod.SessionDelegate
import typingsJapgolly.sipJs.subscriptionSubscriptionDelegateMod.SubscriptionDelegate
import typingsJapgolly.sipJs.subscriptionSubscriptionMod.SubscriptionState
import typingsJapgolly.sipJs.transactionsMod.InviteClientTransaction
import typingsJapgolly.sipJs.transactionsMod.InviteServerTransaction
import typingsJapgolly.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/dialogs", JSImport.Namespace)
@js.native
object dialogsMod extends js.Object {
  @js.native
  class Dialog protected ()
    extends typingsJapgolly.sipJs.dialogMod.Dialog {
    /**
      * Dialog constructor.
      * @param core - User agent core.
      * @param dialogState - Initial dialog state.
      */
    protected def this(core: UserAgentCore, dialogState: DialogState) = this()
  }
  
  @js.native
  class SessionDialog protected ()
    extends typingsJapgolly.sipJs.sessionDialogMod.SessionDialog {
    def this(initialTransaction: InviteClientTransaction, core: UserAgentCore, state: DialogState) = this()
    def this(initialTransaction: InviteServerTransaction, core: UserAgentCore, state: DialogState) = this()
    def this(
      initialTransaction: InviteClientTransaction,
      core: UserAgentCore,
      state: DialogState,
      delegate: SessionDelegate
    ) = this()
    def this(
      initialTransaction: InviteServerTransaction,
      core: UserAgentCore,
      state: DialogState,
      delegate: SessionDelegate
    ) = this()
  }
  
  @js.native
  class SubscriptionDialog protected ()
    extends typingsJapgolly.sipJs.subscriptionDialogMod.SubscriptionDialog {
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: SubscriptionState,
      core: typingsJapgolly.sipJs.userAgentCoreUserAgentCoreMod.UserAgentCore,
      state: DialogState
    ) = this()
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: SubscriptionState,
      core: typingsJapgolly.sipJs.userAgentCoreUserAgentCoreMod.UserAgentCore,
      state: DialogState,
      delegate: SubscriptionDelegate
    ) = this()
  }
  
  /* static members */
  @js.native
  object Dialog extends js.Object {
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage - Outgoing request message for dialog.
      * @param incomingResponseMessage - Incoming response message creating dialog.
      */
    def initialDialogStateForUserAgentClient(outgoingRequestMessage: OutgoingRequestMessage, incomingResponseMessage: IncomingResponseMessage): DialogState = js.native
    /**
      * The UAS then constructs the state of the dialog.  This state MUST be
      * maintained for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.1
      * @param incomingRequestMessage - Incoming request message creating dialog.
      * @param toTag - Tag in the To field in the response to the incoming request.
      */
    def initialDialogStateForUserAgentServer(incomingRequestMessage: IncomingRequestMessage, toTag: String): DialogState = js.native
    def initialDialogStateForUserAgentServer(incomingRequestMessage: IncomingRequestMessage, toTag: String, early: Boolean): DialogState = js.native
  }
  
  /* static members */
  @js.native
  object SubscriptionDialog extends js.Object {
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage - Outgoing request message for dialog.
      * @param incomingResponseMessage - Incoming response message creating dialog.
      */
    def initialDialogStateForSubscription(
      outgoingSubscribeRequestMessage: OutgoingRequestMessage,
      incomingNotifyRequestMessage: IncomingRequestMessage
    ): DialogState = js.native
  }
  
}

