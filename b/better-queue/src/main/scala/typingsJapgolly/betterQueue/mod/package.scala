package typingsJapgolly.betterQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // TODO reflect task types somehow (task: T | T[])
  type ProcessFunction[T, K] = js.Function2[
    /* task */ js.Any, 
    /* cb */ typingsJapgolly.betterQueue.mod.ProcessFunctionCb[K], 
    scala.Unit
  ]
  type ProcessFunctionCb[K] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[K], scala.Unit]
}
