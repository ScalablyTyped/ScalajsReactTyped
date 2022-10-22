package typingsJapgolly.next.anon

import typingsJapgolly.next.distServerBaseHttpMod.BaseNextRequest
import typingsJapgolly.next.distServerBaseHttpMod.BaseNextResponse
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallReqResPathnameQuery extends StObject {
  
  def apply(req: BaseNextRequest[Any], res: BaseNextResponse[Any], pathname: String): js.Promise[String | Null] = js.native
  def apply(
    req: BaseNextRequest[Any],
    res: BaseNextResponse[Any],
    pathname: String,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): js.Promise[String | Null] = js.native
  def apply(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], pathname: String): js.Promise[String | Null] = js.native
  def apply(
    req: BaseNextRequest[Any],
    res: ServerResponse[IncomingMessage],
    pathname: String,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): js.Promise[String | Null] = js.native
  def apply(req: IncomingMessage, res: BaseNextResponse[Any], pathname: String): js.Promise[String | Null] = js.native
  def apply(
    req: IncomingMessage,
    res: BaseNextResponse[Any],
    pathname: String,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): js.Promise[String | Null] = js.native
  def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], pathname: String): js.Promise[String | Null] = js.native
  def apply(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    pathname: String,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): js.Promise[String | Null] = js.native
}
