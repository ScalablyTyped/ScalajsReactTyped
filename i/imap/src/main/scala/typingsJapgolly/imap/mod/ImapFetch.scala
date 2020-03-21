package typingsJapgolly.imap.mod

import typingsJapgolly.imap.imapStrings.error
import typingsJapgolly.imap.imapStrings.message
import typingsJapgolly.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImapFetch extends EventEmitter {
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* message */ ImapMessage, /* seqno */ Double, Unit]): this.type = js.native
  def once(event: String, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
}

