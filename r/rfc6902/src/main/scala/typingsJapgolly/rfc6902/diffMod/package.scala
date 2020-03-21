package typingsJapgolly.rfc6902

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object diffMod {
  type Diff = js.Function3[
    /* input */ js.Any, 
    /* output */ js.Any, 
    /* ptr */ typingsJapgolly.rfc6902.pointerMod.Pointer, 
    js.Array[typingsJapgolly.rfc6902.diffMod.Operation]
  ]
  type VoidableDiff = js.Function3[
    /* input */ js.Any, 
    /* output */ js.Any, 
    /* ptr */ typingsJapgolly.rfc6902.pointerMod.Pointer, 
    js.Array[typingsJapgolly.rfc6902.diffMod.Operation] | scala.Unit
  ]
}
