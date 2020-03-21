package typingsJapgolly.basicAuth.mod

import typingsJapgolly.node.http2Mod.Http2ServerRequest
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("basic-auth", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(req: Http2ServerRequest): js.UndefOr[BasicAuthResult] = js.native
  // See https://github.com/jshttp/basic-auth/blob/v1.1.0/index.js#L49
  def apply(req: IncomingMessage): js.UndefOr[BasicAuthResult] = js.native
}

