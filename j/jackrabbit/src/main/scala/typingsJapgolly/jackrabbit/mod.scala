package typingsJapgolly.jackrabbit

import japgolly.scalajs.react.Callback
import typingsJapgolly.amqplib.mod.Connection
import typingsJapgolly.amqplib.propertiesMod.Message
import typingsJapgolly.amqplib.propertiesMod.Options.AssertExchange
import typingsJapgolly.amqplib.propertiesMod.Options.AssertQueue
import typingsJapgolly.amqplib.propertiesMod.Options.Consume
import typingsJapgolly.amqplib.propertiesMod.Options.Publish
import typingsJapgolly.jackrabbit.anon.Amqp
import typingsJapgolly.jackrabbit.mod.jackrabbit.JackRabbit
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jackrabbit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String): JackRabbit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[JackRabbit]
  
  object jackrabbit {
    
    @js.native
    sealed trait exchangeType extends StObject
    @JSImport("jackrabbit", "jackrabbit.exchangeType")
    @js.native
    object exchangeType extends StObject {
      
      @js.native
      sealed trait direct
        extends StObject
           with exchangeType
      
      @js.native
      sealed trait fanout
        extends StObject
           with exchangeType
      
      @js.native
      sealed trait topic
        extends StObject
           with exchangeType
    }
    
    type AckCallback = js.Function1[/* data */ js.UndefOr[Any], Unit]
    
    @js.native
    trait Exchange
      extends StObject
         with EventEmitter {
      
      def connect(con: Connection): Exchange = js.native
      
      var name: String = js.native
      
      var options: AssertExchange = js.native
      
      def publish(message: Any): Exchange = js.native
      def publish(message: Any, options: PublishOptions): Exchange = js.native
      
      def queue(options: QueueOptions): Queue = js.native
      
      var `type`: exchangeType = js.native
    }
    
    @js.native
    trait JackRabbit
      extends StObject
         with EventEmitter {
      
      def default(): Exchange = js.native
      
      def close(callback: js.Function1[/* e */ js.Error, Any]): Unit = js.native
      
      def direct(): Exchange = js.native
      def direct(name: String): Exchange = js.native
      
      def fanout(): Exchange = js.native
      def fanout(name: String): Exchange = js.native
      
      def getInternals(): Amqp = js.native
      
      def topic(): Exchange = js.native
      def topic(name: String): Exchange = js.native
    }
    
    trait PublishOptions
      extends StObject
         with Publish {
      
      var key: String
      
      var reply: js.UndefOr[AckCallback] = js.undefined
    }
    object PublishOptions {
      
      inline def apply(key: String): PublishOptions = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[PublishOptions]
      }
      
      extension [Self <: PublishOptions](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setReply(value: /* data */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "reply", js.Any.fromFunction1((t0: /* data */ js.UndefOr[Any]) => value(t0).runNow()))
        
        inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
      }
    }
    
    @js.native
    trait Queue
      extends StObject
         with EventEmitter {
      
      def cancel(done: Any): Unit = js.native
      
      def connect(con: Connection): Unit = js.native
      
      def consume(
        callback: js.Function4[
              /* data */ Any, 
              /* ack */ AckCallback, 
              /* nack */ js.Function0[Unit], 
              /* msg */ Message, 
              Unit
            ]
      ): Unit = js.native
      def consume(
        callback: js.Function4[
              /* data */ Any, 
              /* ack */ AckCallback, 
              /* nack */ js.Function0[Unit], 
              /* msg */ Message, 
              Unit
            ],
        options: Consume
      ): Unit = js.native
      
      var name: String = js.native
      
      var options: QueueOptions = js.native
      
      def purge(done: Any): Unit = js.native
    }
    
    trait QueueOptions
      extends StObject
         with AssertQueue {
      
      var key: js.UndefOr[String] = js.undefined
      
      var keys: js.UndefOr[js.Array[String]] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var prefetch: js.UndefOr[Double] = js.undefined
    }
    object QueueOptions {
      
      inline def apply(): QueueOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueueOptions]
      }
      
      extension [Self <: QueueOptions](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
        
        inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPrefetch(value: Double): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
        
        inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      }
    }
  }
}
