package typingsJapgolly.bucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Bucks {
  type Task = js.Function2[/* err */ js.UndefOr[js.Error], /* res */ js.UndefOr[js.Any], js.Any]
  type TaskWithNext = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* res */ js.UndefOr[js.Any], 
    /* next */ js.UndefOr[typingsJapgolly.bucks.Bucks.Task], 
    js.Any
  ]
}
