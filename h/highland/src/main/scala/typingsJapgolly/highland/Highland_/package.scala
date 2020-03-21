package typingsJapgolly.highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Highland_ {
  type MappingHint = scala.Double | js.Array[java.lang.String] | js.Function
  type OnFinished = js.Function2[
    /* r */ typingsJapgolly.node.NodeJS.ReadableStream, 
    /* cb */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit | js.Function | typingsJapgolly.highland.Highland_.CleanupObject
  ]
  type PipeableStream[T, R] = typingsJapgolly.highland.Highland_.Stream[R]
}
