package typingsJapgolly.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "try")
@js.native
object `try` extends js.Object {
  def apply[In, Out](f: js.Function1[/* value */ In, Out]): js.Function1[/* value */ In, typingsJapgolly.baconjs.observableMod.EventStream[Out]] = js.native
}

