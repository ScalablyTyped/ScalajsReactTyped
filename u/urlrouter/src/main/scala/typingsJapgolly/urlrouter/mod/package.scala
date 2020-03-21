package typingsJapgolly.urlrouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HttpHandler = js.Function3[
    /* req */ typingsJapgolly.urlrouter.mod.ServerRequest, 
    /* res */ typingsJapgolly.urlrouter.mod.ServerResponse, 
    /* next */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  type ServerResponse = typingsJapgolly.node.httpMod.ServerResponse
}
