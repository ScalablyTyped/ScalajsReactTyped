package typingsJapgolly.next.anon

import typingsJapgolly.next.nextBooleans.`true`
import typingsJapgolly.next.nextStrings.`export`
import typingsJapgolly.next.nextStrings.passthrough
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Render extends StObject {
  
  def render(req: IncomingMessage, res: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
  
  def renderReqToHTML(req: IncomingMessage, res: ServerResponse[IncomingMessage]): js.Promise[String | Html | Null] = js.native
  def renderReqToHTML(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    renderMode: `export` | passthrough | `true`
  ): js.Promise[String | Html | Null] = js.native
  def renderReqToHTML(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    renderMode: `export` | passthrough | `true`,
    _renderOpts: Any
  ): js.Promise[String | Html | Null] = js.native
  def renderReqToHTML(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    renderMode: `export` | passthrough | `true`,
    _renderOpts: Any,
    _params: Any
  ): js.Promise[String | Html | Null] = js.native
  def renderReqToHTML(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    renderMode: `export` | passthrough | `true`,
    _renderOpts: Unit,
    _params: Any
  ): js.Promise[String | Html | Null] = js.native
  def renderReqToHTML(req: IncomingMessage, res: ServerResponse[IncomingMessage], renderMode: Unit, _renderOpts: Any): js.Promise[String | Html | Null] = js.native
  def renderReqToHTML(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    renderMode: Unit,
    _renderOpts: Any,
    _params: Any
  ): js.Promise[String | Html | Null] = js.native
  def renderReqToHTML(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    renderMode: Unit,
    _renderOpts: Unit,
    _params: Any
  ): js.Promise[String | Html | Null] = js.native
}
