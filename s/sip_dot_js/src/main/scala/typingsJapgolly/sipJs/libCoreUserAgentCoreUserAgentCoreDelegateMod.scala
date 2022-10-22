package typingsJapgolly.sipJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsMessageMod.IncomingMessageRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsReferMod.IncomingReferRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsRegisterMod.IncomingRegisterRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsSubscribeMod.IncomingSubscribeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentCoreUserAgentCoreDelegateMod {
  
  trait UserAgentCoreDelegate extends StObject {
    
    /**
      * Receive INVITE request.
      * @param request - Incoming INVITE request.
      */
    var onInvite: js.UndefOr[js.Function1[/* request */ IncomingInviteRequest, Unit]] = js.undefined
    
    /**
      * Receive MESSAGE request.
      * @param request - Incoming MESSAGE request.
      */
    var onMessage: js.UndefOr[js.Function1[/* request */ IncomingMessageRequest, Unit]] = js.undefined
    
    /**
      * DEPRECATED. Receive NOTIFY request.
      * @param message - Incoming NOTIFY request.
      */
    var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.undefined
    
    /**
      * Receive REFER request.
      * @param request - Incoming REFER request.
      */
    var onRefer: js.UndefOr[js.Function1[/* request */ IncomingReferRequest, Unit]] = js.undefined
    
    /**
      * Receive REGISTER request.
      * @param request - Incoming REGISTER request.
      */
    var onRegister: js.UndefOr[js.Function1[/* request */ IncomingRegisterRequest, Unit]] = js.undefined
    
    /**
      * Receive SUBSCRIBE request.
      * @param request - Incoming SUBSCRIBE request.
      */
    var onSubscribe: js.UndefOr[js.Function1[/* request */ IncomingSubscribeRequest, Unit]] = js.undefined
  }
  object UserAgentCoreDelegate {
    
    inline def apply(): UserAgentCoreDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAgentCoreDelegate]
    }
    
    extension [Self <: UserAgentCoreDelegate](x: Self) {
      
      inline def setOnInvite(value: /* request */ IncomingInviteRequest => Callback): Self = StObject.set(x, "onInvite", js.Any.fromFunction1((t0: /* request */ IncomingInviteRequest) => value(t0).runNow()))
      
      inline def setOnInviteUndefined: Self = StObject.set(x, "onInvite", js.undefined)
      
      inline def setOnMessage(value: /* request */ IncomingMessageRequest => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: /* request */ IncomingMessageRequest) => value(t0).runNow()))
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setOnNotify(value: /* request */ IncomingNotifyRequest => Callback): Self = StObject.set(x, "onNotify", js.Any.fromFunction1((t0: /* request */ IncomingNotifyRequest) => value(t0).runNow()))
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      inline def setOnRefer(value: /* request */ IncomingReferRequest => Callback): Self = StObject.set(x, "onRefer", js.Any.fromFunction1((t0: /* request */ IncomingReferRequest) => value(t0).runNow()))
      
      inline def setOnReferUndefined: Self = StObject.set(x, "onRefer", js.undefined)
      
      inline def setOnRegister(value: /* request */ IncomingRegisterRequest => Callback): Self = StObject.set(x, "onRegister", js.Any.fromFunction1((t0: /* request */ IncomingRegisterRequest) => value(t0).runNow()))
      
      inline def setOnRegisterUndefined: Self = StObject.set(x, "onRegister", js.undefined)
      
      inline def setOnSubscribe(value: /* request */ IncomingSubscribeRequest => Callback): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1((t0: /* request */ IncomingSubscribeRequest) => value(t0).runNow()))
      
      inline def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
    }
  }
}
