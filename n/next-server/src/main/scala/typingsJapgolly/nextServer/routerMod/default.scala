package typingsJapgolly.nextServer.routerMod

import typingsJapgolly.nextServer.AnonApp
import typingsJapgolly.nextServer.mittMod.MittEmitter
import typingsJapgolly.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/lib/router/router", JSImport.Default)
@js.native
class default protected () extends Router {
  def this(
    pathname: String,
    query: ParsedUrlQuery,
    as: String,
    hasInitialPropsPageLoaderAppWrapAppComponentErrSubscription: AnonApp
  ) = this()
  /* CompleteClass */
  override var asPath: String = js.native
  /* CompleteClass */
  override var pathname: String = js.native
  /* CompleteClass */
  override var query: ParsedUrlQuery = js.native
  /* CompleteClass */
  override var route: String = js.native
}

/* static members */
@JSImport("next-server/dist/lib/router/router", JSImport.Default)
@js.native
object default extends js.Object {
  var events: MittEmitter = js.native
  def _rewriteUrlForNextExport(url: String): String = js.native
}

