package typingsJapgolly.expressWechatAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type WeMiddleware = js.Function3[
    /* req */ js.Any, 
    /* res */ org.scalajs.dom.experimental.Response | typingsJapgolly.node.httpMod.ServerResponse, 
    /* next */ typingsJapgolly.express.mod.NextFunction, 
    js.Any
  ]
}
