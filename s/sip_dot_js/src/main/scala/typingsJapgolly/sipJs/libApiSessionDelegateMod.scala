package typingsJapgolly.sipJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.libApiAckMod.Ack
import typingsJapgolly.sipJs.libApiByeMod.Bye
import typingsJapgolly.sipJs.libApiInfoMod.Info
import typingsJapgolly.sipJs.libApiMessageMod.Message
import typingsJapgolly.sipJs.libApiNotificationMod.Notification
import typingsJapgolly.sipJs.libApiReferralMod.Referral
import typingsJapgolly.sipJs.libApiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typingsJapgolly.sipJs.libCoreMod.IncomingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiSessionDelegateMod {
  
  trait SessionDelegate extends StObject {
    
    /**
      * Called upon receiving an incoming in dialog ACK request.
      * @param ack - The ack.
      */
    var onAck: js.UndefOr[js.Function1[/* ack */ Ack, Unit]] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog BYE request.
      * @param bye - The bye.
      */
    var onBye: js.UndefOr[js.Function1[/* bye */ Bye, Unit]] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog INFO request.
      * @param info - The info.
      */
    var onInfo: js.UndefOr[js.Function1[/* info */ Info, Unit]] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog INVITE request.
      * @param invite - The invite.
      */
    var onInvite: js.UndefOr[
        js.Function3[
          /* request */ IncomingRequestMessage, 
          /* response */ String, 
          /* statusCode */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog MESSAGE request.
      * @param message - The message.
      */
    var onMessage: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog NOTIFY request.
      *
      * @remarks
      * If a refer is in progress notifications are delivered to the referrers delegate.
      *
      * @param notification - The notification.
      */
    var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
    
    /**
      * Called upon receiving an incoming in dialog REFER request.
      * @param referral - The referral.
      */
    var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.undefined
    
    /**
      * Called upon creating a SessionDescriptionHandler.
      *
      * @remarks
      * It's recommended that the SessionDescriptionHandler be accessed via the `Session.sessionDescriptionHandler` property.
      * However there are use cases where one needs access immediately after it is constructed and before it is utilized.
      * Thus this callback.
      *
      * In most scenarios a single SessionDescriptionHandler will be created per Session
      * in which case this callback will be called at most once and `provisional` will be `false`.
      *
      * However if reliable provisional responses are being supported and an INVITE is sent without SDP,
      * one or more session description handlers will be created if remote offers are received in reliable provisional responses.
      * When remote offers are received in reliable provisional responses, the `provisional` parameter will be `true`.
      * When the `provisional` paramter is `true`, this callback may (or may not) be called again.
      * If the session is ultimately established using a SessionDescriptionHandler which was not created provisionally,
      * this callback will be called again and the `provisional` parameter will be `false`.
      * If the session is ultimately established using a SessionDescriptionHandler which was created provisionally,
      * this callback will not be called again.
      * Note that if the session is ultimately established using a SessionDescriptionHandler which was created provisionally,
      * the provisional SessionDescriptionHandler being utilized will be available via the `Session.sessionDescriptionHandler` property.
      *
      * @param sessionDescriptionHandler - The handler.
      * @param provisional - True if created provisionally.
      */
    var onSessionDescriptionHandler: js.UndefOr[
        js.Function2[
          /* sessionDescriptionHandler */ SessionDescriptionHandler, 
          /* provisional */ Boolean, 
          Unit
        ]
      ] = js.undefined
  }
  object SessionDelegate {
    
    inline def apply(): SessionDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionDelegate]
    }
    
    extension [Self <: SessionDelegate](x: Self) {
      
      inline def setOnAck(value: /* ack */ Ack => Callback): Self = StObject.set(x, "onAck", js.Any.fromFunction1((t0: /* ack */ Ack) => value(t0).runNow()))
      
      inline def setOnAckUndefined: Self = StObject.set(x, "onAck", js.undefined)
      
      inline def setOnBye(value: /* bye */ Bye => Callback): Self = StObject.set(x, "onBye", js.Any.fromFunction1((t0: /* bye */ Bye) => value(t0).runNow()))
      
      inline def setOnByeUndefined: Self = StObject.set(x, "onBye", js.undefined)
      
      inline def setOnInfo(value: /* info */ Info => Callback): Self = StObject.set(x, "onInfo", js.Any.fromFunction1((t0: /* info */ Info) => value(t0).runNow()))
      
      inline def setOnInfoUndefined: Self = StObject.set(x, "onInfo", js.undefined)
      
      inline def setOnInvite(
        value: (/* request */ IncomingRequestMessage, /* response */ String, /* statusCode */ Double) => Callback
      ): Self = StObject.set(x, "onInvite", js.Any.fromFunction3((t0: /* request */ IncomingRequestMessage, t1: /* response */ String, t2: /* statusCode */ Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnInviteUndefined: Self = StObject.set(x, "onInvite", js.undefined)
      
      inline def setOnMessage(value: /* message */ Message => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: /* message */ Message) => value(t0).runNow()))
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setOnNotify(value: /* notification */ Notification => Callback): Self = StObject.set(x, "onNotify", js.Any.fromFunction1((t0: /* notification */ Notification) => value(t0).runNow()))
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      inline def setOnRefer(value: /* referral */ Referral => Callback): Self = StObject.set(x, "onRefer", js.Any.fromFunction1((t0: /* referral */ Referral) => value(t0).runNow()))
      
      inline def setOnReferUndefined: Self = StObject.set(x, "onRefer", js.undefined)
      
      inline def setOnSessionDescriptionHandler(
        value: (/* sessionDescriptionHandler */ SessionDescriptionHandler, /* provisional */ Boolean) => Callback
      ): Self = StObject.set(x, "onSessionDescriptionHandler", js.Any.fromFunction2((t0: /* sessionDescriptionHandler */ SessionDescriptionHandler, t1: /* provisional */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnSessionDescriptionHandlerUndefined: Self = StObject.set(x, "onSessionDescriptionHandler", js.undefined)
    }
  }
}
