package typingsJapgolly.next.anon

import typingsJapgolly.next.distServerBaseHttpMod.BaseNextRequest
import typingsJapgolly.next.distServerBaseHttpMod.BaseNextResponse
import typingsJapgolly.next.distServerRequestMetaMod.NextUrlWithParsedQuery
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallReqResParsedUrlSetHeaders extends StObject {
  
  def apply(req: BaseNextRequest[Any], res: BaseNextResponse[Any]): js.Promise[Unit] = js.native
  def apply(req: BaseNextRequest[Any], res: BaseNextResponse[Any], parsedUrl: Unit, setHeaders: Boolean): js.Promise[Unit] = js.native
  def apply(req: BaseNextRequest[Any], res: BaseNextResponse[Any], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
  def apply(
    req: BaseNextRequest[Any],
    res: BaseNextResponse[Any],
    parsedUrl: NextUrlWithParsedQuery,
    setHeaders: Boolean
  ): js.Promise[Unit] = js.native
  def apply(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
  def apply(
    req: BaseNextRequest[Any],
    res: ServerResponse[IncomingMessage],
    parsedUrl: Unit,
    setHeaders: Boolean
  ): js.Promise[Unit] = js.native
  def apply(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
  def apply(
    req: BaseNextRequest[Any],
    res: ServerResponse[IncomingMessage],
    parsedUrl: NextUrlWithParsedQuery,
    setHeaders: Boolean
  ): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: BaseNextResponse[Any]): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: BaseNextResponse[Any], parsedUrl: Unit, setHeaders: Boolean): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: BaseNextResponse[Any], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
  def apply(
    req: IncomingMessage,
    res: BaseNextResponse[Any],
    parsedUrl: NextUrlWithParsedQuery,
    setHeaders: Boolean
  ): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], parsedUrl: Unit, setHeaders: Boolean): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
  def apply(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    parsedUrl: NextUrlWithParsedQuery,
    setHeaders: Boolean
  ): js.Promise[Unit] = js.native
}
