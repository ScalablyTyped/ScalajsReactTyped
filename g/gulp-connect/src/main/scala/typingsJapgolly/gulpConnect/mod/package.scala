package typingsJapgolly.gulpConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConnectRouteHandler = js.Tuple2[java.lang.String, typingsJapgolly.connect.mod.HandleFunction]
  type MiddlewareFactory = js.Function2[
    /* connect */ js.Function0[typingsJapgolly.connect.mod.Server] with typingsJapgolly.gulpConnect.TypeofconnectModule, 
    /* options */ typingsJapgolly.gulpConnect.mod.ConnectAppOptions, 
    js.Array[
      typingsJapgolly.connect.mod.HandleFunction | typingsJapgolly.gulpConnect.mod.ConnectRouteHandler
    ]
  ]
}
