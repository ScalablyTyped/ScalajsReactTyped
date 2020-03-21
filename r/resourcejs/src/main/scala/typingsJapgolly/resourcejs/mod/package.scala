package typingsJapgolly.resourcejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HttpHandler = js.Function3[
    /* req */ typingsJapgolly.resourcejs.mod.Request, 
    /* res */ typingsJapgolly.resourcejs.mod.Response, 
    /* next */ typingsJapgolly.express.mod.NextFunction, 
    scala.Unit
  ]
  type MethodBuild[T] = js.Function1[/* options */ js.UndefOr[T], typingsJapgolly.resourcejs.mod.ResourceEndpoint]
}
