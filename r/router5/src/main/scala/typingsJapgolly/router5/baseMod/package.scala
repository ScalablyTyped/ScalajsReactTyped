package typingsJapgolly.router5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object baseMod {
  type CancelFn = js.Function0[scala.Unit]
  type DoneFn = js.Function2[
    /* err */ js.UndefOr[js.Any], 
    /* state */ js.UndefOr[typingsJapgolly.router5.baseMod.State], 
    scala.Unit
  ]
  type Params = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type Unsubscribe = js.Function0[scala.Unit]
}
