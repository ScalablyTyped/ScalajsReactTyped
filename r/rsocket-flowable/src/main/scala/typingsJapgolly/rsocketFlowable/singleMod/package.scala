package typingsJapgolly.rsocketFlowable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object singleMod {
  type CancelCallback = js.Function0[scala.Unit]
  type Source[T] = js.Function1[
    /* subject */ typingsJapgolly.rsocketFlowable.singleMod.IFutureSubject[T], 
    scala.Unit
  ]
}
