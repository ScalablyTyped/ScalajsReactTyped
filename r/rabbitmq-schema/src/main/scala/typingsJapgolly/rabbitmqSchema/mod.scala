package typingsJapgolly.rabbitmqSchema

import typingsJapgolly.rabbitmqSchema.rabbitmqSchemaStrings.direct
import typingsJapgolly.rabbitmqSchema.rabbitmqSchemaStrings.fanout
import typingsJapgolly.rabbitmqSchema.rabbitmqSchemaStrings.topic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rabbitmq-schema", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RabbitMQSchema {
    def this(schema: js.Array[Topology]) = this()
    def this(schema: Topology) = this()
    def this(schema: js.Array[Topology], parentPath: String) = this()
    def this(schema: Topology, parentPath: String) = this()
  }
  
  trait Binding extends StObject {
    
    var args: js.UndefOr[js.Object] = js.undefined
    
    var destination: Exchange | Queue
    
    var routingPattern: js.UndefOr[String] = js.undefined
    
    var source: Exchange
  }
  object Binding {
    
    inline def apply(destination: Exchange | Queue, source: Exchange): Binding = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Binding]
    }
    
    extension [Self <: Binding](x: Self) {
      
      inline def setArgs(value: js.Object): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setDestination(value: Exchange | Queue): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setRoutingPattern(value: String): Self = StObject.set(x, "routingPattern", value.asInstanceOf[js.Any])
      
      inline def setRoutingPatternUndefined: Self = StObject.set(x, "routingPattern", js.undefined)
      
      inline def setSource(value: Exchange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectBinding
    extends StObject
       with Binding {
    
    @JSName("routingPattern")
    var routingPattern_DirectBinding: String
  }
  object DirectBinding {
    
    inline def apply(destination: Exchange | Queue, routingPattern: String, source: Exchange): DirectBinding = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], routingPattern = routingPattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectBinding]
    }
    
    extension [Self <: DirectBinding](x: Self) {
      
      inline def setRoutingPattern(value: String): Self = StObject.set(x, "routingPattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectExchange
    extends StObject
       with Exchange {
    
    @JSName("bindings")
    var bindings_DirectExchange: js.Array[DirectBinding]
    
    @JSName("type")
    var type_DirectExchange: direct
  }
  object DirectExchange {
    
    inline def apply(bindings: js.Array[DirectBinding], exchange: String): DirectExchange = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("direct")
      __obj.asInstanceOf[DirectExchange]
    }
    
    extension [Self <: DirectExchange](x: Self) {
      
      inline def setBindings(value: js.Array[DirectBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsVarargs(value: DirectBinding*): Self = StObject.set(x, "bindings", js.Array(value*))
      
      inline def setType(value: direct): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Exchange
    extends StObject
       with Topology {
    
    var bindings: js.Array[Binding]
    
    var exchange: String
    
    var `type`: String
  }
  object Exchange {
    
    inline def apply(bindings: js.Array[Binding], exchange: String, `type`: String): Exchange = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exchange]
    }
    
    extension [Self <: Exchange](x: Self) {
      
      inline def setBindings(value: js.Array[Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsVarargs(value: Binding*): Self = StObject.set(x, "bindings", js.Array(value*))
      
      inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FanoutExchange
    extends StObject
       with Exchange {
    
    @JSName("type")
    var type_FanoutExchange: fanout
  }
  object FanoutExchange {
    
    inline def apply(bindings: js.Array[Binding], exchange: String): FanoutExchange = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fanout")
      __obj.asInstanceOf[FanoutExchange]
    }
    
    extension [Self <: FanoutExchange](x: Self) {
      
      inline def setType(value: fanout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Queue
    extends StObject
       with Topology {
    
    var messageSchema: js.Object
    
    var queue: String
  }
  object Queue {
    
    inline def apply(messageSchema: js.Object, queue: String): Queue = {
      val __obj = js.Dynamic.literal(messageSchema = messageSchema.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Queue]
    }
    
    extension [Self <: Queue](x: Self) {
      
      inline def setMessageSchema(value: js.Object): Self = StObject.set(x, "messageSchema", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RabbitMQSchema extends StObject {
    
    def getBindings(): js.Array[Binding] = js.native
    
    def getDirectBindings(): js.Array[DirectBinding] = js.native
    
    def getExchangeByName(name: String): Exchange | Unit = js.native
    
    def getExchanges(): js.Array[Exchange] = js.native
    
    def getQueueByName(name: String): Queue | Unit = js.native
    
    def getQueues(): js.Array[Queue] = js.native
    
    def validate(schema: js.Array[Topology]): Unit = js.native
    def validate(schema: js.Array[Topology], parentPath: String): Unit = js.native
    def validate(schema: Topology): Unit = js.native
    def validate(schema: Topology, parentPath: String): Unit = js.native
    
    def validateMessage[T](exchangeName: String, routingPattern: String, message: T): T = js.native
  }
  
  trait TopicBinding
    extends StObject
       with Binding {
    
    @JSName("routingPattern")
    var routingPattern_TopicBinding: String
  }
  object TopicBinding {
    
    inline def apply(destination: Exchange | Queue, routingPattern: String, source: Exchange): TopicBinding = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], routingPattern = routingPattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicBinding]
    }
    
    extension [Self <: TopicBinding](x: Self) {
      
      inline def setRoutingPattern(value: String): Self = StObject.set(x, "routingPattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait TopicExchange
    extends StObject
       with Exchange {
    
    @JSName("bindings")
    var bindings_TopicExchange: js.Array[TopicBinding]
    
    @JSName("type")
    var type_TopicExchange: topic
  }
  object TopicExchange {
    
    inline def apply(bindings: js.Array[TopicBinding], exchange: String): TopicExchange = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("topic")
      __obj.asInstanceOf[TopicExchange]
    }
    
    extension [Self <: TopicExchange](x: Self) {
      
      inline def setBindings(value: js.Array[TopicBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsVarargs(value: TopicBinding*): Self = StObject.set(x, "bindings", js.Array(value*))
      
      inline def setType(value: topic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Topology extends StObject {
    
    var options: js.UndefOr[js.Object] = js.undefined
  }
  object Topology {
    
    inline def apply(): Topology = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Topology]
    }
    
    extension [Self <: Topology](x: Self) {
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
