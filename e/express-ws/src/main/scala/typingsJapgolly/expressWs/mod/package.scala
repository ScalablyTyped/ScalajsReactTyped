package typingsJapgolly.expressWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Application = typingsJapgolly.express.mod.Application_ with typingsJapgolly.expressWs.mod.WithWebsocketMethod
  type Router = typingsJapgolly.express.mod.Router with typingsJapgolly.expressWs.mod.WithWebsocketMethod
  type WebsocketMethod[T] = js.Function2[
    /* route */ typingsJapgolly.expressServeStaticCore.mod.PathParams, 
    /* repeated */ typingsJapgolly.expressWs.mod.WebsocketRequestHandler, 
    T
  ]
  type WebsocketRequestHandler = js.Function3[
    /* ws */ typingsJapgolly.ws.mod.^, 
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* next */ typingsJapgolly.express.mod.NextFunction, 
    scala.Unit
  ]
}
