package typingsJapgolly.stompit.clientMod

import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.stompit.socketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client
  extends typingsJapgolly.stompit.socketMod.^ {
  def ack(message: Message): Unit = js.native
  def ack(message: Message, headers: js.Any): Unit = js.native
  def ack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
  def ack(
    message: Message,
    headers: js.Any,
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
  def begin(): typingsJapgolly.stompit.transactionMod.^ = js.native
  def begin(headers: js.Any): typingsJapgolly.stompit.transactionMod.^ = js.native
  def connect(): Unit = js.native
  def connect(headers: js.Any): Unit = js.native
  def connect(headers: js.Any, callback: js.Function2[/* err */ js.Error | Null, /* client */ this.type, Unit]): Unit = js.native
  def disconnect(): Unit = js.native
  def disconnect(callback: js.Function2[/* error */ js.Error | Null, /* client */ this.type, Unit]): Unit = js.native
  def getOptions(): SocketOptions = js.native
  def getSubscription(id: Double): typingsJapgolly.stompit.subscriptionMod.^ = js.native
  def nack(message: Message): Unit = js.native
  def nack(message: Message, headers: js.Any): Unit = js.native
  def nack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
  def nack(
    message: Message,
    headers: js.Any,
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
  def readEmptyBody(frame: typingsJapgolly.stompit.incomingFrameStreamMod.^): Unit = js.native
  def readEmptyBody(
    frame: typingsJapgolly.stompit.incomingFrameStreamMod.^,
    callback: js.Function1[/* client */ this.type, Unit]
  ): Unit = js.native
  def send(): Writable = js.native
  def send(headers: js.Any): Writable = js.native
  def send(headers: js.Any, options: SendOptions): Writable = js.native
  def sendFrame(command: String, headers: js.Any, options: SendOptions): Writable = js.native
  def sendString(): Unit = js.native
  def sendString(headers: js.Any): Unit = js.native
  def sendString(headers: js.Any, body: js.Any): Unit = js.native
  def sendString(headers: js.Any, body: js.Any, options: SendOptions): Unit = js.native
  def sendString(
    headers: js.Any,
    body: js.Any,
    options: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
  def setImplicitSubscription(id: Double): typingsJapgolly.stompit.subscriptionMod.^ = js.native
  def setImplicitSubscription(id: Double, ack: Ack): typingsJapgolly.stompit.subscriptionMod.^ = js.native
  def setImplicitSubscription(id: Double, ack: Ack, messageListener: MessageCallback): typingsJapgolly.stompit.subscriptionMod.^ = js.native
  def subscribe(): typingsJapgolly.stompit.subscriptionMod.^ = js.native
  def subscribe(headers: js.Any): typingsJapgolly.stompit.subscriptionMod.^ = js.native
  def subscribe(headers: js.Any, messageListener: MessageCallback): typingsJapgolly.stompit.subscriptionMod.^ = js.native
}

