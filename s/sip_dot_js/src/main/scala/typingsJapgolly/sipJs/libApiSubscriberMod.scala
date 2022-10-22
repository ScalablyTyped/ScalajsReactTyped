package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libApiSubscriberOptionsMod.SubscriberOptions
import typingsJapgolly.sipJs.libApiSubscriberSubscribeOptionsMod.SubscriberSubscribeOptions
import typingsJapgolly.sipJs.libApiSubscriptionMod.Subscription
import typingsJapgolly.sipJs.libApiUserAgentMod.UserAgent
import typingsJapgolly.sipJs.libCoreMessagesIncomingResponseMod.IncomingResponse
import typingsJapgolly.sipJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typingsJapgolly.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest
import typingsJapgolly.sipJs.libCoreMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiSubscriberMod {
  
  @JSImport("sip.js/lib/api/subscriber", "Subscriber")
  @js.native
  open class Subscriber protected () extends Subscription {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - The request URI identifying the subscribed event.
      * @param eventType - The event type identifying the subscribed event.
      * @param options - Options bucket. See {@link SubscriberOptions} for details.
      */
    def this(userAgent: UserAgent, targetURI: URI, eventType: String) = this()
    def this(userAgent: UserAgent, targetURI: URI, eventType: String, options: SubscriberOptions) = this()
    
    /**
      * Sends a re-SUBSCRIBE request if the subscription is "active".
      * @deprecated Use `subscribe` instead.
      * @internal
      */
    def _refresh(): js.Promise[Unit] = js.native
    
    /* private */ var body: Any = js.native
    
    /* private */ var event: Any = js.native
    
    /* private */ var expires: Any = js.native
    
    /* private */ var extraHeaders: Any = js.native
    
    /* private */ var id: Any = js.native
    
    /* private */ var initSubscriberRequest: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /** @internal */
    /* protected */ def onAccepted(response: IncomingResponse): Unit = js.native
    
    /** @internal */
    /* protected */ def onNotify(request: IncomingNotifyRequest): Unit = js.native
    
    /** @internal */
    /* protected */ def onRefresh(request: OutgoingSubscribeRequest): Unit = js.native
    
    /* private */ var outgoingRequestMessage: Any = js.native
    
    /* private */ var retryAfterTimer: Any = js.native
    
    def subscribe(options: SubscriberSubscribeOptions): js.Promise[Unit] = js.native
    
    /* private */ var subscriberRequest: Any = js.native
    
    /* private */ var targetURI: Any = js.native
  }
}
