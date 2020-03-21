package typingsJapgolly.pProgress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ProgressNotifier = js.Function1[/* progress */ scala.Double, scala.Unit]
  type PromiseFactory[ValueType] = js.Function0[js.Thenable[ValueType]]
}
