package typingsJapgolly.expressRouters

import typingsJapgolly.express.mod.Router
import typingsJapgolly.expressRouters.expressRoutersMod.RouteConfig
import typingsJapgolly.expressRouters.expressRoutersMod.RouteConfigAlternative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-routers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createRouter(routeConfig: js.Array[RouteConfig]): Router = js.native
  def createRouter(routeConfig: RouteConfigAlternative): Router = js.native
}

