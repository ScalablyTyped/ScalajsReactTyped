package typingsJapgolly.expressRouters.expressRoutersMod

import typingsJapgolly.express.mod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-routers/dist/express-routers", "createRouter")
@js.native
object createRouter extends js.Object {
  def apply(routeConfig: js.Array[RouteConfig]): Router = js.native
  def apply(routeConfig: RouteConfigAlternative): Router = js.native
}

