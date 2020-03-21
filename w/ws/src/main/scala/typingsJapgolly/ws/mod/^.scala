package typingsJapgolly.ws.mod

import typingsJapgolly.node.httpMod.ClientRequestArgs
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket socket.
@JSImport("ws", JSImport.Namespace)
@js.native
class ^ protected () extends WebSocket {
  def this(address: String) = this()
  def this(address: URL_) = this()
  def this(address: String, options: ClientRequestArgs) = this()
  def this(address: String, options: ClientOptions) = this()
  def this(address: String, protocols: String) = this()
  def this(address: String, protocols: js.Array[String]) = this()
  def this(address: URL_, options: ClientRequestArgs) = this()
  def this(address: URL_, options: ClientOptions) = this()
  def this(address: URL_, protocols: String) = this()
  def this(address: URL_, protocols: js.Array[String]) = this()
  def this(address: String, protocols: String, options: ClientRequestArgs) = this()
  def this(address: String, protocols: String, options: ClientOptions) = this()
  def this(address: String, protocols: js.Array[String], options: ClientRequestArgs) = this()
  def this(address: String, protocols: js.Array[String], options: ClientOptions) = this()
  def this(address: URL_, protocols: String, options: ClientRequestArgs) = this()
  def this(address: URL_, protocols: String, options: ClientOptions) = this()
  def this(address: URL_, protocols: js.Array[String], options: ClientRequestArgs) = this()
  def this(address: URL_, protocols: js.Array[String], options: ClientOptions) = this()
}

@JSImport("ws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CLOSED: Double = js.native
  var CLOSING: Double = js.native
  var CONNECTING: Double = js.native
  var OPEN: Double = js.native
}

