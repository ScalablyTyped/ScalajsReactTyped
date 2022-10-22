package typingsJapgolly.stompit

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.node.streamMod.WritableOptions
import typingsJapgolly.stompit.libIncomingFrameStreamMod.IncomingFrame
import typingsJapgolly.stompit.libSocketMod.SocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientMod {
  
  @JSImport("stompit/lib/Client", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Client {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.stompit.stompitStrings.auto
    - typingsJapgolly.stompit.stompitStrings.client
    - typingsJapgolly.stompit.stompitStrings.`client-individual`
  */
  trait Ack extends StObject
  object Ack {
    
    inline def auto: typingsJapgolly.stompit.stompitStrings.auto = "auto".asInstanceOf[typingsJapgolly.stompit.stompitStrings.auto]
    
    inline def client: typingsJapgolly.stompit.stompitStrings.client = "client".asInstanceOf[typingsJapgolly.stompit.stompitStrings.client]
    
    inline def `client-individual`: typingsJapgolly.stompit.stompitStrings.`client-individual` = "client-individual".asInstanceOf[typingsJapgolly.stompit.stompitStrings.`client-individual`]
  }
  
  @js.native
  trait Client
    extends typingsJapgolly.stompit.libSocketMod.^ {
    
    def ack(message: Message): Unit = js.native
    def ack(message: Message, headers: Any): Unit = js.native
    def ack(
      message: Message,
      headers: Any,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: Any, sendOptions: SendOptions): Unit = js.native
    def ack(
      message: Message,
      headers: Any,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def ack(
      message: Message,
      headers: Unit,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: Unit, sendOptions: SendOptions): Unit = js.native
    def ack(
      message: Message,
      headers: Unit,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def begin(): typingsJapgolly.stompit.libClientTransactionMod.^ = js.native
    def begin(headers: Any): typingsJapgolly.stompit.libClientTransactionMod.^ = js.native
    
    def connect(): Unit = js.native
    def connect(headers: Any): Unit = js.native
    def connect(headers: Any, callback: js.Function2[/* err */ js.Error | Null, /* client */ this.type, Unit]): Unit = js.native
    def connect(headers: Unit, callback: js.Function2[/* err */ js.Error | Null, /* client */ this.type, Unit]): Unit = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(callback: js.Function2[/* error */ js.Error | Null, /* client */ this.type, Unit]): Unit = js.native
    
    def getOptions(): SocketOptions = js.native
    
    def getSubscription(id: Double): typingsJapgolly.stompit.libClientSubscriptionMod.^ = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(message: Message, headers: Any): Unit = js.native
    def nack(
      message: Message,
      headers: Any,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: Any, sendOptions: SendOptions): Unit = js.native
    def nack(
      message: Message,
      headers: Any,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def nack(
      message: Message,
      headers: Unit,
      sendOptions: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: Unit, sendOptions: SendOptions): Unit = js.native
    def nack(
      message: Message,
      headers: Unit,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def readEmptyBody(frame: typingsJapgolly.stompit.libIncomingFrameStreamMod.^): Unit = js.native
    def readEmptyBody(
      frame: typingsJapgolly.stompit.libIncomingFrameStreamMod.^,
      callback: js.Function1[/* client */ this.type, Unit]
    ): Unit = js.native
    
    def send(): Writable = js.native
    def send(headers: Any): Writable = js.native
    def send(headers: Any, options: SendOptions): Writable = js.native
    def send(headers: Unit, options: SendOptions): Writable = js.native
    
    def sendFrame(command: String, headers: Any, options: SendOptions): Writable = js.native
    def sendFrame(command: String, headers: Unit, options: SendOptions): Writable = js.native
    
    def sendString(): Unit = js.native
    def sendString(headers: Any): Unit = js.native
    def sendString(headers: Any, body: Any): Unit = js.native
    def sendString(
      headers: Any,
      body: Any,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: Any, body: Any, options: SendOptions): Unit = js.native
    def sendString(
      headers: Any,
      body: Any,
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(
      headers: Any,
      body: Unit,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: Any, body: Unit, options: SendOptions): Unit = js.native
    def sendString(
      headers: Any,
      body: Unit,
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: Unit, body: Any): Unit = js.native
    def sendString(
      headers: Unit,
      body: Any,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: Unit, body: Any, options: SendOptions): Unit = js.native
    def sendString(
      headers: Unit,
      body: Any,
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(
      headers: Unit,
      body: Unit,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: Unit, body: Unit, options: SendOptions): Unit = js.native
    def sendString(
      headers: Unit,
      body: Unit,
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def setImplicitSubscription(id: Double): typingsJapgolly.stompit.libClientSubscriptionMod.^ = js.native
    def setImplicitSubscription(id: Double, ack: Unit, messageListener: MessageCallback): typingsJapgolly.stompit.libClientSubscriptionMod.^ = js.native
    def setImplicitSubscription(id: Double, ack: Ack): typingsJapgolly.stompit.libClientSubscriptionMod.^ = js.native
    def setImplicitSubscription(id: Double, ack: Ack, messageListener: MessageCallback): typingsJapgolly.stompit.libClientSubscriptionMod.^ = js.native
    
    def subscribe(): typingsJapgolly.stompit.libClientSubscriptionMod.^ = js.native
    def subscribe(headers: Any): typingsJapgolly.stompit.libClientSubscriptionMod.^ = js.native
    def subscribe(headers: Any, messageListener: MessageCallback): typingsJapgolly.stompit.libClientSubscriptionMod.^ = js.native
    def subscribe(headers: Unit, messageListener: MessageCallback): typingsJapgolly.stompit.libClientSubscriptionMod.^ = js.native
  }
  
  @js.native
  trait Message extends IncomingFrame {
    
    def ack(): Unit = js.native
    
    def nack(): Unit = js.native
  }
  
  type MessageCallback = js.Function2[/* err */ js.Error | Null, /* message */ Message, Unit]
  
  trait SendOptions
    extends StObject
       with WritableOptions {
    
    def onError(err: js.Error): Unit
    
    def onReceipt(): Unit
  }
  object SendOptions {
    
    inline def apply(onError: js.Error => Callback, onReceipt: Callback): SendOptions = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()), onReceipt = onReceipt.toJsFn)
      __obj.asInstanceOf[SendOptions]
    }
    
    extension [Self <: SendOptions](x: Self) {
      
      inline def setOnError(value: js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setOnReceipt(value: Callback): Self = StObject.set(x, "onReceipt", value.toJsFn)
    }
  }
}
