package typingsJapgolly.imap.mod

import typingsJapgolly.imap.imapStrings.attributes
import typingsJapgolly.imap.imapStrings.body
import typingsJapgolly.imap.imapStrings.end
import typingsJapgolly.node.NodeJS.EventEmitter
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImapMessage extends EventEmitter {
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_attributes(event: attributes, listener: js.Function1[/* attrs */ ImapMessageAttributes, Unit]): this.type = js.native
  @JSName("on")
  def on_body(
    event: body,
    listener: js.Function2[/* stream */ ReadableStream, /* info */ ImapMessageBodyInfo, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
}

