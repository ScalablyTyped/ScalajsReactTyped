package typingsJapgolly.sipJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequest
import typingsJapgolly.sipJs.libCoreMessagesIncomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequest
import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.libCoreSubscriptionSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMessagesMethodsSubscribeMod {
  
  trait IncomingRequestWithSubscription extends StObject {
    
    /** The NOTIFY request which established the subscription. */
    val request: IncomingNotifyRequest
    
    /** If subscription state is not "terminated", then the subscription. Otherwise undefined. */
    val subscription: js.UndefOr[Subscription] = js.undefined
  }
  object IncomingRequestWithSubscription {
    
    inline def apply(request: IncomingNotifyRequest): IncomingRequestWithSubscription = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingRequestWithSubscription]
    }
    
    extension [Self <: IncomingRequestWithSubscription](x: Self) {
      
      inline def setRequest(value: IncomingNotifyRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    }
  }
  
  type IncomingSubscribeRequest = IncomingRequest
  
  type IncomingSubscribeResponse = IncomingResponse
  
  @js.native
  trait OutgoingSubscribeRequest
    extends StObject
       with OutgoingRequest {
    
    /** Delegate providing custom handling of this outgoing SUBSCRIBE request. */
    @JSName("delegate")
    var delegate_OutgoingSubscribeRequest: js.UndefOr[OutgoingSubscribeRequestDelegate] = js.native
    
    /** Stop waiting for an inital subscription creating NOTIFY. */
    def waitNotifyStop(): Unit = js.native
  }
  
  trait OutgoingSubscribeRequestDelegate
    extends StObject
       with OutgoingRequestDelegate {
    
    /**
      * Received the initial subscription creating NOTIFY in response to this request.
      * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
      * @param request - Incoming NOTIFY request (including a Subscription).
      */
    var onNotify: js.UndefOr[js.Function1[/* request */ IncomingRequestWithSubscription, Unit]] = js.undefined
    
    /**
      * Timed out waiting to receive the initial subscription creating NOTIFY in response to this request.
      * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
      */
    var onNotifyTimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object OutgoingSubscribeRequestDelegate {
    
    inline def apply(): OutgoingSubscribeRequestDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutgoingSubscribeRequestDelegate]
    }
    
    extension [Self <: OutgoingSubscribeRequestDelegate](x: Self) {
      
      inline def setOnNotify(value: /* request */ IncomingRequestWithSubscription => Callback): Self = StObject.set(x, "onNotify", js.Any.fromFunction1((t0: /* request */ IncomingRequestWithSubscription) => value(t0).runNow()))
      
      inline def setOnNotifyTimeout(value: Callback): Self = StObject.set(x, "onNotifyTimeout", value.toJsFn)
      
      inline def setOnNotifyTimeoutUndefined: Self = StObject.set(x, "onNotifyTimeout", js.undefined)
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
    }
  }
}
