package typingsJapgolly.ipfsGrpcServer

import japgolly.scalajs.react.Callback
import typingsJapgolly.libp2pInterfaces.distSrcEventsMod.EventHandler
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEndpointsPubsubSubscriptionsMod {
  
  @JSImport("ipfs-grpc-server/dist/src/endpoints/pubsub/subscriptions", "subscriptions")
  @js.native
  val subscriptions: Map[String, Subscription] = js.native
  
  type Message = typingsJapgolly.libp2pInterfacePubsub.mod.Message
  
  trait Subscription extends StObject {
    
    var onMessage: EventHandler[Message]
    
    def onUnsubscribe(): Unit
  }
  object Subscription {
    
    inline def apply(onMessage: EventHandler[Message], onUnsubscribe: Callback): Subscription = {
      val __obj = js.Dynamic.literal(onMessage = onMessage.asInstanceOf[js.Any], onUnsubscribe = onUnsubscribe.toJsFn)
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setOnMessage(value: EventHandler[Message]): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
      
      inline def setOnMessageFunction1(value: Message => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
      
      inline def setOnUnsubscribe(value: Callback): Self = StObject.set(x, "onUnsubscribe", value.toJsFn)
    }
  }
}
