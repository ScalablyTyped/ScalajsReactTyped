package typingsJapgolly.rabbitJs

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.eventsMod.EventEmitterOptions
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.rabbitJs.anon.CorrelationId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rabbit.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rabbit.js", "Context")
  @js.native
  open class Context () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def close(callback: js.Function): Any = js.native
    
    def socket[T](`type`: String): T = js.native
    def socket[T](`type`: String, options: SocketOptions): T = js.native
  }
  
  @JSImport("rabbit.js", "PubSocket")
  @js.native
  open class PubSocket protected ()
    extends Writable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def publish(topic: String, chunk: String): Any = js.native
    def publish(topic: String, chunk: String, encoding: String): Any = js.native
    def publish(topic: String, chunk: Buffer): Any = js.native
    def publish(topic: String, chunk: Buffer, encoding: String): Any = js.native
  }
  
  @JSImport("rabbit.js", "PullSocket")
  @js.native
  open class PullSocket protected ()
    extends Readable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
  }
  
  @JSImport("rabbit.js", "PushSocket")
  @js.native
  open class PushSocket protected ()
    extends Writable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
  }
  
  @JSImport("rabbit.js", "RepSocket")
  @js.native
  open class RepSocket protected ()
    extends Duplex
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def discard(): Any = js.native
    
    def requeue(): Any = js.native
  }
  
  @JSImport("rabbit.js", "ReqSocket")
  @js.native
  open class ReqSocket protected ()
    extends Duplex
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def handleReply(msg: RequestMessage): Any = js.native
  }
  
  @JSImport("rabbit.js", "SubSocket")
  @js.native
  open class SubSocket protected ()
    extends Readable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def connect(source: String, topic: String): Any = js.native
    def connect(source: String, topic: String, callback: js.Function): Any = js.native
    def connect(source: String, topic: Unit, callback: js.Function): Any = js.native
  }
  
  @JSImport("rabbit.js", "TaskSocket")
  @js.native
  open class TaskSocket protected ()
    extends Writable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def post(task: String, chunk: String): Any = js.native
    def post(task: String, chunk: String, encoding: String): Any = js.native
    def post(task: String, chunk: Buffer): Any = js.native
    def post(task: String, chunk: Buffer, encoding: String): Any = js.native
  }
  
  @JSImport("rabbit.js", "WorkerSocket")
  @js.native
  open class WorkerSocket protected ()
    extends Readable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def ack(): Any = js.native
    
    def discard(): Any = js.native
    
    def requeue(): Any = js.native
  }
  
  inline def createContext(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[Context]
  inline def createContext(url: String): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(url.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  trait RequestMessage extends StObject {
    
    var content: Any
    
    var properties: CorrelationId
  }
  object RequestMessage {
    
    inline def apply(content: Any, properties: CorrelationId): RequestMessage = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestMessage]
    }
    
    extension [Self <: RequestMessage](x: Self) {
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: CorrelationId): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Socket extends StObject {
    
    def close(): Any = js.native
    
    def connect(destination: String): Any = js.native
    def connect(destination: String, callback: js.Function): Any = js.native
    
    def setsockopt(opt: String, value: String): Any = js.native
  }
  
  trait SocketOptions extends StObject {
    
    var expiration: js.UndefOr[Any] = js.undefined
    
    var persistent: js.UndefOr[Any] = js.undefined
    
    var prefetch: js.UndefOr[Any] = js.undefined
    
    var routing: js.UndefOr[Any] = js.undefined
    
    var task: js.UndefOr[Any] = js.undefined
    
    var topic: js.UndefOr[Any] = js.undefined
  }
  object SocketOptions {
    
    inline def apply(): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOptions]
    }
    
    extension [Self <: SocketOptions](x: Self) {
      
      inline def setExpiration(value: Any): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      inline def setPersistent(value: Any): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
      
      inline def setPrefetch(value: Any): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
      
      inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      
      inline def setRouting(value: Any): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
      
      inline def setTask(value: Any): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
      
      inline def setTopic(value: Any): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
}
