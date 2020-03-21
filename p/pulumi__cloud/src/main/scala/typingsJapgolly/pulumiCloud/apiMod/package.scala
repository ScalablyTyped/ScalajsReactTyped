package typingsJapgolly.pulumiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiMod {
  type HttpEndpoint = typingsJapgolly.pulumiCloud.apiMod.API
  type RouteHandler = js.Function3[
    /* req */ typingsJapgolly.pulumiCloud.apiMod.Request, 
    /* res */ typingsJapgolly.pulumiCloud.apiMod.Response, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ]
}
