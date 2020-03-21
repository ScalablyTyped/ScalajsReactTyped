package typingsJapgolly.nextServer.renderMod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/render", "renderToHTML")
@js.native
object renderToHTML extends js.Object {
  def apply(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: ParsedUrlQuery,
    renderOpts: RenderOpts
  ): js.Promise[String | Null] = js.native
}

