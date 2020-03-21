package typingsJapgolly.node.http2Mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.nodeStrings.data
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.ReadableOptions
import typingsJapgolly.node.tlsMod.TLSSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http2", "Http2ServerRequest")
@js.native
class Http2ServerRequest protected () extends Readable {
  def this(
    stream: ServerHttp2Stream,
    headers: IncomingHttpHeaders,
    options: ReadableOptions,
    rawHeaders: js.Array[String]
  ) = this()
  val aborted: Boolean = js.native
  val authority: String = js.native
  val headers: IncomingHttpHeaders = js.native
  val httpVersion: String = js.native
  val method: String = js.native
  val rawHeaders: js.Array[String] = js.native
  val rawTrailers: js.Array[String] = js.native
  val scheme: String = js.native
  val socket: Socket | TLSSocket = js.native
  val stream: ServerHttp2Stream = js.native
  val trailers: IncomingHttpHeaders = js.native
  val url: String = js.native
  @JSName("addListener")
  def addListener_aborted(
    event: typingsJapgolly.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_aborted(event: typingsJapgolly.node.nodeStrings.aborted, hadError: Boolean, code: Double): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: String): Boolean = js.native
  @JSName("emit")
  def emit_data(event: data, chunk: Buffer): Boolean = js.native
  @JSName("on")
  def on_aborted(
    event: typingsJapgolly.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_aborted(
    event: typingsJapgolly.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_aborted(
    event: typingsJapgolly.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_aborted(
    event: typingsJapgolly.node.nodeStrings.aborted,
    listener: js.Function2[/* hadError */ Boolean, /* code */ Double, Unit]
  ): this.type = js.native
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
}

