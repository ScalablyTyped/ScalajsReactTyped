package typingsJapgolly.jssip.mod

import typingsJapgolly.jssip.jssipStrings.failed
import typingsJapgolly.jssip.jssipStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jssip", "Message")
@js.native
class Message () extends js.Object {
  var direction: String = js.native
  var local_identrity: NameAddrHeader = js.native
  var remote_identrity: NameAddrHeader = js.native
  def accept(): Unit = js.native
  def accept(options: MessageAcceptOptions): Unit = js.native
  @JSName("on")
  def on_failed(eventName: failed, handler: EventHandler[MessageFailedEvent]): Unit = js.native
  @JSName("on")
  def on_succeeded(eventName: succeeded, handler: EventHandler[MessageSucceededEvent]): Unit = js.native
  def reject(): Unit = js.native
  def reject(options: MessageRejectOptions): Unit = js.native
  def send(target: String, body: String): Unit = js.native
  def send(target: String, body: String, options: MessageSendOptions): Unit = js.native
}

