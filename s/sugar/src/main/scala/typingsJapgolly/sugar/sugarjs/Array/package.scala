package typingsJapgolly.sugar.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Array {
  type Chainable[T, RawValue] = (typingsJapgolly.sugar.sugarjs.Array.ChainableBase[T, RawValue]) with typingsJapgolly.sugar.sugarjs.Object.ChainableBase[RawValue]
  type mapFn[T, U] = js.Function3[/* el */ T, /* i */ scala.Double, /* arr */ typingsJapgolly.sugar.Array[T], U]
  type searchFn[T] = js.Function3[
    /* el */ T, 
    /* i */ scala.Double, 
    /* arr */ typingsJapgolly.sugar.Array[T], 
    scala.Boolean
  ]
  type sortMapFn[T, U] = js.Function1[/* el */ T, U]
}
