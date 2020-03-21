package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.whenMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "when")
@js.native
object when extends js.Object {
  def apply[O](patterns: Pattern[O]*): typingsJapgolly.baconjs.observableMod.EventStream[O] = js.native
}

