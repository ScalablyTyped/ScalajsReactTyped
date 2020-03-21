package typingsJapgolly.syslogClient.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("syslog-client", "Client")
@js.native
class Client () extends EventEmitter {
  def this(target: String) = this()
  def this(target: String, options: ClientOptions) = this()
  def buildFormattedMessage(message: String, options: MessageOptions): Buffer = js.native
  def close(): Client = js.native
  def getTransport(cb: js.Function2[/* error */ js.Error | Null, /* transport */ Transport, Unit]): Unit = js.native
  def log(message: String): Client = js.native
  def log(message: String, options: MessageOptions): Client = js.native
  def log(message: String, options: MessageOptions, cb: js.Function1[/* error */ js.Error | Null, Unit]): Client = js.native
  def onClose(): Client = js.native
  def onError(error: js.Error): Client = js.native
}

