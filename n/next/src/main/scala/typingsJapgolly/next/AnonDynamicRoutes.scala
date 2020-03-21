package typingsJapgolly.next

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.serverRouterMod.DynamicRoutes
import typingsJapgolly.next.serverRouterMod.PageChecker
import typingsJapgolly.next.serverRouterMod.Route_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDynamicRoutes extends js.Object {
  var catchAllRoute: Route_
  var dynamicRoutes: js.UndefOr[DynamicRoutes] = js.undefined
  var fsRoutes: js.Array[Route_]
  var pageChecker: PageChecker
  var routes: js.Array[Route_]
}

object AnonDynamicRoutes {
  @scala.inline
  def apply(
    catchAllRoute: Route_,
    fsRoutes: js.Array[Route_],
    pageChecker: /* pathname */ String => CallbackTo[js.Promise[Boolean]],
    routes: js.Array[Route_],
    dynamicRoutes: DynamicRoutes = null
  ): AnonDynamicRoutes = {
    val __obj = js.Dynamic.literal(catchAllRoute = catchAllRoute.asInstanceOf[js.Any], fsRoutes = fsRoutes.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.updateDynamic("pageChecker")(js.Any.fromFunction1((t0: /* pathname */ java.lang.String) => pageChecker(t0).runNow()))
    if (dynamicRoutes != null) __obj.updateDynamic("dynamicRoutes")(dynamicRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDynamicRoutes]
  }
}

