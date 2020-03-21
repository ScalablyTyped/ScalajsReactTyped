package typingsJapgolly.httpProxyMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Filter = js.Function2[
    /* pathname */ java.lang.String, 
    /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
    scala.Boolean
  ]
  type Logger = js.Function1[/* repeated */ js.Any, scala.Unit]
  type Proxy = typingsJapgolly.connect.mod.NextHandleFunction
}
