package typingsJapgolly.responseTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResponseTimeFunction = js.Function3[
    /* request */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* response */ typingsJapgolly.node.httpMod.ServerResponse, 
    /* time */ scala.Double, 
    js.Any
  ]
}
