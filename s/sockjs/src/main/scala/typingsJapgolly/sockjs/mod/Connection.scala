package typingsJapgolly.sockjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.sockjs.AnonAddress
import typingsJapgolly.sockjs.sockjsStrings.close
import typingsJapgolly.sockjs.sockjsStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection
  extends ReadableStream
     with WritableStream {
  var address: StringDictionary[AnonAddress] = js.native
  var headers: StringDictionary[String] = js.native
  var id: String = js.native
  var pathname: String = js.native
  var prefix: String = js.native
  var protocol: String = js.native
  var readyState: Double = js.native
  var remoteAddress: String = js.native
  var remotePort: Double = js.native
  var url: String = js.native
  def close(): Boolean = js.native
  def close(code: String): Boolean = js.native
  def close(code: String, reason: String): Boolean = js.native
  def destroy(): Unit = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* message */ String, _]): this.type = js.native
}

