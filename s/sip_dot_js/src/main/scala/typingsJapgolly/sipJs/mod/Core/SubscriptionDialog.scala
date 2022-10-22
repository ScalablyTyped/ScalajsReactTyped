package typingsJapgolly.sipJs.mod.Core

import typingsJapgolly.sipJs.libCoreDialogsDialogStateMod.DialogState
import typingsJapgolly.sipJs.libCoreSubscriptionSubscriptionDelegateMod.SubscriptionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SubscriptionDialog")
@js.native
open class SubscriptionDialog protected ()
  extends typingsJapgolly.sipJs.libCoreMod.SubscriptionDialog {
  def this(
    subscriptionEvent: String,
    subscriptionExpires: Double,
    subscriptionState: typingsJapgolly.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState,
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    subscriptionEvent: String,
    subscriptionExpires: Double,
    subscriptionState: typingsJapgolly.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState,
    core: typingsJapgolly.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SubscriptionDelegate
  ) = this()
}
/* static members */
object SubscriptionDialog {
  
  @JSImport("sip.js", "Core.SubscriptionDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * When a UAC receives a response that establishes a dialog, it
    * constructs the state of the dialog.  This state MUST be maintained
    * for the duration of the dialog.
    * https://tools.ietf.org/html/rfc3261#section-12.1.2
    * @param outgoingRequestMessage - Outgoing request message for dialog.
    * @param incomingResponseMessage - Incoming response message creating dialog.
    */
  inline def initialDialogStateForSubscription(
    outgoingSubscribeRequestMessage: typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage,
    incomingNotifyRequestMessage: typingsJapgolly.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ): DialogState = (^.asInstanceOf[js.Dynamic].applyDynamic("initialDialogStateForSubscription")(outgoingSubscribeRequestMessage.asInstanceOf[js.Any], incomingNotifyRequestMessage.asInstanceOf[js.Any])).asInstanceOf[DialogState]
}
