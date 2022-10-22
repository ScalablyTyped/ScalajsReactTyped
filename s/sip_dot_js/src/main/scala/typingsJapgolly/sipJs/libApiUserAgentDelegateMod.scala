package typingsJapgolly.sipJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.libApiInvitationMod.Invitation
import typingsJapgolly.sipJs.libApiMessageMod.Message
import typingsJapgolly.sipJs.libApiNotificationMod.Notification
import typingsJapgolly.sipJs.libApiReferralMod.Referral
import typingsJapgolly.sipJs.libApiSubscriptionMod.Subscription
import typingsJapgolly.sipJs.libCoreMessagesMethodsReferMod.IncomingReferRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsRegisterMod.IncomingRegisterRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsSubscribeMod.IncomingSubscribeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiUserAgentDelegateMod {
  
  trait UserAgentDelegate extends StObject {
    
    /**
      * Called upon transport transitioning to connected state.
      */
    var onConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called upon transport transitioning from connected state.
      * @param error - An error if disconnect triggered by transport. Otherwise undefined.
      */
    var onDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Error], Unit]] = js.undefined
    
    /**
      * Called upon receipt of an invitation.
      * @remarks
      * Handler for incoming out of dialog INVITE requests.
      * @param invitation - The invitation.
      */
    var onInvite: js.UndefOr[js.Function1[/* invitation */ Invitation, Unit]] = js.undefined
    
    /**
      * Called upon receipt of a message.
      * @remarks
      * Handler for incoming out of dialog MESSAGE requests.
      * @param message - The message.
      */
    var onMessage: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
    
    /**
      * Called upon receipt of a notification.
      * @remarks
      * Handler for incoming out of dialog NOTIFY requests.
      * @param notification - The notification.
      */
    var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
    
    /**
      * @alpha
      * Called upon receipt of a referral.
      * @remarks
      * Handler for incoming out of dialog REFER requests.
      * @param referral - The referral.
      */
    var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.undefined
    
    /**
      * @internal
      * Called upon receipt of an out of dialog REFER. Used by test suite.
      * @param request - The request.
      */
    var onReferRequest: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.undefined
    
    /**
      * @alpha
      * Called upon receipt of a registration.
      * @remarks
      * Handler for incoming out of dialog REGISTER requests.
      * @param registration - The registration.
      */
    var onRegister: js.UndefOr[js.Function1[/* registration */ Any, Unit]] = js.undefined
    
    /**
      * @internal
      * Called upon receipt of a REGISTER request. Used by test suite.
      * @param request - The request.
      */
    var onRegisterRequest: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.undefined
    
    /**
      * @alpha
      * Called upon receipt of a subscription.
      * @remarks
      * Handler for incoming out of dialog SUBSCRIBE requests.
      * @param subscription - The subscription.
      */
    var onSubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.undefined
    
    /**
      * @internal
      * Called upon receipt of an out of dialog SUBSCRIBE request. Used by test suite.
      * @param request - The request.
      */
    var onSubscribeRequest: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.undefined
  }
  object UserAgentDelegate {
    
    inline def apply(): UserAgentDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAgentDelegate]
    }
    
    extension [Self <: UserAgentDelegate](x: Self) {
      
      inline def setOnConnect(value: Callback): Self = StObject.set(x, "onConnect", value.toJsFn)
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnDisconnect(value: /* error */ js.UndefOr[js.Error] => Callback): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Error]) => value(t0).runNow()))
      
      inline def setOnDisconnectUndefined: Self = StObject.set(x, "onDisconnect", js.undefined)
      
      inline def setOnInvite(value: /* invitation */ Invitation => Callback): Self = StObject.set(x, "onInvite", js.Any.fromFunction1((t0: /* invitation */ Invitation) => value(t0).runNow()))
      
      inline def setOnInviteUndefined: Self = StObject.set(x, "onInvite", js.undefined)
      
      inline def setOnMessage(value: /* message */ Message => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: /* message */ Message) => value(t0).runNow()))
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setOnNotify(value: /* notification */ Notification => Callback): Self = StObject.set(x, "onNotify", js.Any.fromFunction1((t0: /* notification */ Notification) => value(t0).runNow()))
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      inline def setOnRefer(value: /* referral */ Referral => Callback): Self = StObject.set(x, "onRefer", js.Any.fromFunction1((t0: /* referral */ Referral) => value(t0).runNow()))
      
      inline def setOnReferRequest(value: /* request */ IncomingReferRequest => Callback): Self = StObject.set(x, "onReferRequest", js.Any.fromFunction1((t0: /* request */ IncomingReferRequest) => value(t0).runNow()))
      
      inline def setOnReferRequestUndefined: Self = StObject.set(x, "onReferRequest", js.undefined)
      
      inline def setOnReferUndefined: Self = StObject.set(x, "onRefer", js.undefined)
      
      inline def setOnRegister(value: /* registration */ Any => Callback): Self = StObject.set(x, "onRegister", js.Any.fromFunction1((t0: /* registration */ Any) => value(t0).runNow()))
      
      inline def setOnRegisterRequest(value: /* request */ IncomingRegisterRequest => Callback): Self = StObject.set(x, "onRegisterRequest", js.Any.fromFunction1((t0: /* request */ IncomingRegisterRequest) => value(t0).runNow()))
      
      inline def setOnRegisterRequestUndefined: Self = StObject.set(x, "onRegisterRequest", js.undefined)
      
      inline def setOnRegisterUndefined: Self = StObject.set(x, "onRegister", js.undefined)
      
      inline def setOnSubscribe(value: /* subscription */ Subscription => Callback): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1((t0: /* subscription */ Subscription) => value(t0).runNow()))
      
      inline def setOnSubscribeRequest(value: /* request */ IncomingSubscribeRequest => Callback): Self = StObject.set(x, "onSubscribeRequest", js.Any.fromFunction1((t0: /* request */ IncomingSubscribeRequest) => value(t0).runNow()))
      
      inline def setOnSubscribeRequestUndefined: Self = StObject.set(x, "onSubscribeRequest", js.undefined)
      
      inline def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
    }
  }
}
