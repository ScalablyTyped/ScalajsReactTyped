package typingsJapgolly.urllib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function3[
    /* err */ js.Error, 
    /* data */ T, 
    /* res */ typingsJapgolly.node.httpMod.IncomingMessage, 
    scala.Unit
  ]
}
