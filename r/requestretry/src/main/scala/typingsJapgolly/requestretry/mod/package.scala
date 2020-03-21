package typingsJapgolly.requestretry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DelayStrategy = js.Function3[
    /* err */ js.Error, 
    /* response */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* body */ js.Any, 
    scala.Double
  ]
  type RetryStrategy = js.Function3[
    /* err */ js.Error, 
    /* response */ typingsJapgolly.node.httpMod.IncomingMessage, 
    /* body */ js.Any, 
    scala.Boolean
  ]
}
