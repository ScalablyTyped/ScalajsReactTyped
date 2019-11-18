package typingsJapgolly.node.httpsMod

import typingsJapgolly.node.httpMod.RequestListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", "Server")
@js.native
class Server ()
  extends typingsJapgolly.node.tlsMod.Server {
  def this(options: ServerOptions) = this()
  def this(requestListener: RequestListener) = this()
  def this(options: ServerOptions, requestListener: RequestListener) = this()
  /**
    * Limit the amount of time the parser will wait to receive the complete HTTP headers.
    * @default 40000
    * {@link https://nodejs.org/api/http.html#http_server_headerstimeout}
    */
  var headersTimeout: Double = js.native
  var keepAliveTimeout: Double = js.native
  /**
    * Limits maximum incoming headers count. If set to 0, no limit will be applied.
    * @default 2000
    * {@link https://nodejs.org/api/http.html#http_server_maxheaderscount}
    */
  var maxHeadersCount: Double | Null = js.native
  var timeout: Double = js.native
  def setTimeout(): this.type = js.native
  def setTimeout(callback: js.Function0[Unit]): this.type = js.native
  def setTimeout(msecs: Double): this.type = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): this.type = js.native
}

