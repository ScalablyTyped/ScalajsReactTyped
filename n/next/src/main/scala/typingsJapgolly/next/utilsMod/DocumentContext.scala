package typingsJapgolly.next.utilsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.ErrorstatusCodenumber
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next.next/dist/next-server/lib/utils.NextPageContext & {  renderPage  :next.next/dist/next-server/lib/utils.RenderPage} */
trait DocumentContext extends js.Object {
  /**
    * `Component` the tree of the App to use if needing to render separately
    */
  var AppTree: AppTreeType
  /**
    * `String` of the actual path including query.
    */
  var asPath: js.UndefOr[String] = js.undefined
  /**
    * Error object if encountered during rendering
    */
  var err: js.UndefOr[ErrorstatusCodenumber | Null] = js.undefined
  /**
    * Path section of `URL`.
    */
  var pathname: String
  /**
    * Query string section of `URL` parsed as an object.
    */
  var query: ParsedUrlQuery
  var renderPage: RenderPage
  /**
    * `HTTP` request object.
    */
  var req: js.UndefOr[IncomingMessage] = js.undefined
  /**
    * `HTTP` response object.
    */
  var res: js.UndefOr[ServerResponse] = js.undefined
}

object DocumentContext {
  @scala.inline
  def apply(
    AppTree: AppTreeType,
    pathname: String,
    query: ParsedUrlQuery,
    renderPage: /* options */ js.UndefOr[ComponentsEnhancer] => CallbackTo[RenderPageResult | js.Promise[RenderPageResult]],
    asPath: String = null,
    err: ErrorstatusCodenumber = null,
    req: IncomingMessage = null,
    res: ServerResponse = null
  ): DocumentContext = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("renderPage")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.next.utilsMod.ComponentsEnhancer]) => renderPage(t0).runNow()))
    if (asPath != null) __obj.updateDynamic("asPath")(asPath.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentContext]
  }
}

