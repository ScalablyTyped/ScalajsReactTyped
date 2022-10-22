package typingsJapgolly.amqplib

import typingsJapgolly.amqplib.amqplibBooleans.`false`
import typingsJapgolly.amqplib.amqplibStrings.`match`
import typingsJapgolly.amqplib.amqplibStrings.direct
import typingsJapgolly.amqplib.amqplibStrings.fanout
import typingsJapgolly.amqplib.amqplibStrings.headers
import typingsJapgolly.amqplib.amqplibStrings.topic
import typingsJapgolly.amqplib.anon.Mechanism
import typingsJapgolly.amqplib.anon.Response
import typingsJapgolly.amqplib.anon.ServerProperties
import typingsJapgolly.amqplib.propertiesMod.ConsumeMessage
import typingsJapgolly.amqplib.propertiesMod.GetMessage
import typingsJapgolly.amqplib.propertiesMod.Message
import typingsJapgolly.amqplib.propertiesMod.Options.Connect
import typingsJapgolly.amqplib.propertiesMod.Options.DeleteExchange
import typingsJapgolly.amqplib.propertiesMod.Options.Get
import typingsJapgolly.amqplib.propertiesMod.Options.Publish
import typingsJapgolly.amqplib.propertiesMod.Replies.AssertExchange
import typingsJapgolly.amqplib.propertiesMod.Replies.AssertQueue
import typingsJapgolly.amqplib.propertiesMod.Replies.Consume
import typingsJapgolly.amqplib.propertiesMod.Replies.DeleteQueue
import typingsJapgolly.amqplib.propertiesMod.Replies.Empty
import typingsJapgolly.amqplib.propertiesMod.Replies.PurgeQueue
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amqplib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(url: String): typingsJapgolly.bluebird.mod.^[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Connection]]
  inline def connect(url: String, socketOptions: Any): typingsJapgolly.bluebird.mod.^[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], socketOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Connection]]
  inline def connect(url: Connect): typingsJapgolly.bluebird.mod.^[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bluebird.mod.^[Connection]]
  inline def connect(url: Connect, socketOptions: Any): typingsJapgolly.bluebird.mod.^[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], socketOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bluebird.mod.^[Connection]]
  
  object credentials {
    
    @JSImport("amqplib", "credentials")
    @js.native
    val ^ : js.Any = js.native
    
    inline def amqplain(username: String, password: String): Mechanism = (^.asInstanceOf[js.Dynamic].applyDynamic("amqplain")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Mechanism]
    
    inline def external(): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("external")().asInstanceOf[Response]
    
    inline def plain(username: String, password: String): Mechanism = (^.asInstanceOf[js.Dynamic].applyDynamic("plain")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Mechanism]
  }
  
  @js.native
  trait Channel extends EventEmitter {
    
    def ack(message: Message): Unit = js.native
    def ack(message: Message, allUpTo: Boolean): Unit = js.native
    
    def ackAll(): Unit = js.native
    
    def assertExchange(exchange: String, `type`: direct | topic | headers | fanout | `match`): typingsJapgolly.bluebird.mod.^[AssertExchange] = js.native
    def assertExchange(
      exchange: String,
      `type`: direct | topic | headers | fanout | `match`,
      options: typingsJapgolly.amqplib.propertiesMod.Options.AssertExchange
    ): typingsJapgolly.bluebird.mod.^[AssertExchange] = js.native
    def assertExchange(exchange: String, `type`: String): typingsJapgolly.bluebird.mod.^[AssertExchange] = js.native
    def assertExchange(
      exchange: String,
      `type`: String,
      options: typingsJapgolly.amqplib.propertiesMod.Options.AssertExchange
    ): typingsJapgolly.bluebird.mod.^[AssertExchange] = js.native
    
    def assertQueue(queue: String): typingsJapgolly.bluebird.mod.^[AssertQueue] = js.native
    def assertQueue(queue: String, options: typingsJapgolly.amqplib.propertiesMod.Options.AssertQueue): typingsJapgolly.bluebird.mod.^[AssertQueue] = js.native
    
    def bindExchange(destination: String, source: String, pattern: String): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    def bindExchange(destination: String, source: String, pattern: String, args: Any): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    
    def bindQueue(queue: String, source: String, pattern: String): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    def bindQueue(queue: String, source: String, pattern: String, args: Any): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    
    def cancel(consumerTag: String): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    
    def checkExchange(exchange: String): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    
    def checkQueue(queue: String): typingsJapgolly.bluebird.mod.^[AssertQueue] = js.native
    
    def close(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
    
    def consume(queue: String, onMessage: js.Function1[/* msg */ ConsumeMessage | Null, Unit]): typingsJapgolly.bluebird.mod.^[Consume] = js.native
    def consume(
      queue: String,
      onMessage: js.Function1[/* msg */ ConsumeMessage | Null, Unit],
      options: typingsJapgolly.amqplib.propertiesMod.Options.Consume
    ): typingsJapgolly.bluebird.mod.^[Consume] = js.native
    
    def deleteExchange(exchange: String): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    def deleteExchange(exchange: String, options: DeleteExchange): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    
    def deleteQueue(queue: String): typingsJapgolly.bluebird.mod.^[DeleteQueue] = js.native
    def deleteQueue(queue: String, options: typingsJapgolly.amqplib.propertiesMod.Options.DeleteQueue): typingsJapgolly.bluebird.mod.^[DeleteQueue] = js.native
    
    def get(queue: String): typingsJapgolly.bluebird.mod.^[GetMessage | `false`] = js.native
    def get(queue: String, options: Get): typingsJapgolly.bluebird.mod.^[GetMessage | `false`] = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(message: Message, allUpTo: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Unit, requeue: Boolean): Unit = js.native
    
    def nackAll(): Unit = js.native
    def nackAll(requeue: Boolean): Unit = js.native
    
    def prefetch(count: Double): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    def prefetch(count: Double, global: Boolean): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    
    def publish(exchange: String, routingKey: String, content: Buffer): Boolean = js.native
    def publish(exchange: String, routingKey: String, content: Buffer, options: Publish): Boolean = js.native
    
    def purgeQueue(queue: String): typingsJapgolly.bluebird.mod.^[PurgeQueue] = js.native
    
    def recover(): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    
    def reject(message: Message): Unit = js.native
    def reject(message: Message, requeue: Boolean): Unit = js.native
    
    def sendToQueue(queue: String, content: Buffer): Boolean = js.native
    def sendToQueue(queue: String, content: Buffer, options: Publish): Boolean = js.native
    
    def unbindExchange(destination: String, source: String, pattern: String): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    def unbindExchange(destination: String, source: String, pattern: String, args: Any): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    
    def unbindQueue(queue: String, source: String, pattern: String): typingsJapgolly.bluebird.mod.^[Empty] = js.native
    def unbindQueue(queue: String, source: String, pattern: String, args: Any): typingsJapgolly.bluebird.mod.^[Empty] = js.native
  }
  
  @js.native
  trait ConfirmChannel extends Channel {
    
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: Unit,
      callback: js.Function2[/* err */ Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: Unit,
      callback: js.Function2[/* err */ Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ Any, /* ok */ Empty, Unit]
    ): Boolean = js.native
    
    def waitForConfirms(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  }
  
  @js.native
  trait Connection extends EventEmitter {
    
    def close(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
    
    var connection: ServerProperties = js.native
    
    def createChannel(): typingsJapgolly.bluebird.mod.^[Channel] = js.native
    
    def createConfirmChannel(): typingsJapgolly.bluebird.mod.^[ConfirmChannel] = js.native
  }
}
