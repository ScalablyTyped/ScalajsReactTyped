package typingsJapgolly.expressWsRoutes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Express
  extends typingsJapgolly.expressServeStaticCore.mod.Express {
  def websocket(route: String, handler: WebSocketRouteHandler): Express = js.native
}

