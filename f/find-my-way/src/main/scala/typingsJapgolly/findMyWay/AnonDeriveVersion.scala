package typingsJapgolly.findMyWay

import typingsJapgolly.findMyWay.mod.HTTPVersion
import typingsJapgolly.node.http2Mod.Http2ServerRequest
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeriveVersion[V /* <: HTTPVersion */] extends js.Object {
  def deriveVersion[Context](req: Http2ServerRequest | IncomingMessage): String = js.native
  def deriveVersion[Context](req: Http2ServerRequest | IncomingMessage, ctx: Context): String = js.native
  def storage(): AnonDel[V] = js.native
}

