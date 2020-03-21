package typingsJapgolly.expressWsRoutes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CbHandler = js.Function1[
    /* connectHandler */ typingsJapgolly.expressWsRoutes.mod.WebSocketHandler | scala.Boolean, 
    scala.Unit
  ]
  type WebSocketHandler = js.Function1[/* socket */ typingsJapgolly.ws.mod.^, scala.Unit]
  type WebSocketRouteHandler = js.Function3[
    /* info */ typingsJapgolly.expressWsRoutes.mod.ClientInfo, 
    /* cb */ typingsJapgolly.expressWsRoutes.mod.CbHandler, 
    /* next */ typingsJapgolly.express.mod.NextFunction, 
    scala.Unit
  ]
}
