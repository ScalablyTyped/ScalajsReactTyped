package typingsJapgolly.pulumiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpServerMod {
  type RequestListenerFactory = js.Function0[
    js.Function2[
      /* req */ typingsJapgolly.node.httpMod.IncomingMessage, 
      /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
      scala.Unit
    ]
  ]
}
