package typingsJapgolly.raygun

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.raygun.anon.HttpOptions
import typingsJapgolly.raygun.buildTypesMod.Callback
import typingsJapgolly.raygun.buildTypesMod.SendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRaygunDotbatchMod {
  
  @JSImport("raygun/build/raygun.batch", "MAX_BATCH_SIZE_BYTES")
  @js.native
  val MAX_BATCH_SIZE_BYTES: /* 1638400 */ Double = js.native
  
  @JSImport("raygun/build/raygun.batch", "MAX_MESSAGES_IN_BATCH")
  @js.native
  val MAX_MESSAGES_IN_BATCH: /* 100 */ Double = js.native
  
  @JSImport("raygun/build/raygun.batch", "RaygunBatchTransport")
  @js.native
  open class RaygunBatchTransport protected () extends StObject {
    def this(options: HttpOptions) = this()
    
    /* private */ var batchId: Any = js.native
    
    /* private */ var batchState: Any = js.native
    
    /* private */ var httpOptions: Any = js.native
    
    /* private */ var interval: Any = js.native
    
    /* private */ var onIncomingMessage: Any = js.native
    
    /* private */ var processBatch: Any = js.native
    
    def send(options: SendOptions): Unit = js.native
    
    /* private */ var sendBatch: Any = js.native
    
    def stopProcessing(): Unit = js.native
    
    /* private */ var timerId: Any = js.native
  }
  
  trait BatchState extends StObject {
    
    var messageSizeInBytes: Double
    
    var messages: js.Array[MessageAndCallback]
  }
  object BatchState {
    
    inline def apply(messageSizeInBytes: Double, messages: js.Array[MessageAndCallback]): BatchState = {
      val __obj = js.Dynamic.literal(messageSizeInBytes = messageSizeInBytes.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchState]
    }
    
    extension [Self <: BatchState](x: Self) {
      
      inline def setMessageSizeInBytes(value: Double): Self = StObject.set(x, "messageSizeInBytes", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[MessageAndCallback]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: MessageAndCallback*): Self = StObject.set(x, "messages", js.Array(value*))
    }
  }
  
  trait MessageAndCallback extends StObject {
    
    var callback: Callback[IncomingMessage] | Null
    
    var serializedMessage: String
  }
  object MessageAndCallback {
    
    inline def apply(serializedMessage: String): MessageAndCallback = {
      val __obj = js.Dynamic.literal(serializedMessage = serializedMessage.asInstanceOf[js.Any], callback = null)
      __obj.asInstanceOf[MessageAndCallback]
    }
    
    extension [Self <: MessageAndCallback](x: Self) {
      
      inline def setCallback(value: Callback[IncomingMessage]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackFunction1(value: /* t */ IncomingMessage | Null => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* t */ IncomingMessage | Null) => value(t0).runNow()))
      
      inline def setCallbackFunction2(
        value: (/* e */ js.Error | Null, /* t */ IncomingMessage | Null) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* e */ js.Error | Null, t1: /* t */ IncomingMessage | Null) => (value(t0, t1)).runNow()))
      
      inline def setCallbackNull: Self = StObject.set(x, "callback", null)
      
      inline def setSerializedMessage(value: String): Self = StObject.set(x, "serializedMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreparedBatch extends StObject {
    
    var callbacks: js.Array[Callback[IncomingMessage] | Null]
    
    var messageCount: Double
    
    var payload: String
  }
  object PreparedBatch {
    
    inline def apply(callbacks: js.Array[Callback[IncomingMessage] | Null], messageCount: Double, payload: String): PreparedBatch = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreparedBatch]
    }
    
    extension [Self <: PreparedBatch](x: Self) {
      
      inline def setCallbacks(value: js.Array[Callback[IncomingMessage] | Null]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksVarargs(value: (Callback[IncomingMessage] | Null)*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
