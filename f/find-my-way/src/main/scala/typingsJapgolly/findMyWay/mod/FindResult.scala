package typingsJapgolly.findMyWay.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.http2Mod.Http2ServerRequest
import typingsJapgolly.node.http2Mod.Http2ServerResponse
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindResult[V /* <: HTTPVersion */] extends js.Object {
  @JSName("handler")
  var handler_Original: Handler[V] = js.native
  var params: StringDictionary[js.UndefOr[String]] = js.native
  var store: js.Any = js.native
  def handler(
    req: Http2ServerRequest | IncomingMessage,
    res: Http2ServerResponse | ServerResponse,
    params: StringDictionary[js.UndefOr[String]],
    store: js.Any
  ): Unit = js.native
}

