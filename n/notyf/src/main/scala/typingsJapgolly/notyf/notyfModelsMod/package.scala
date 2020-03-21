package typingsJapgolly.notyf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notyfModelsMod {
  type NotyfArrayEventFn[T] = js.Function3[
    /* elem */ T, 
    /* event */ typingsJapgolly.notyf.notyfModelsMod.NotyfArrayEvent, 
    /* elems */ js.Array[T], 
    scala.Unit
  ]
}
