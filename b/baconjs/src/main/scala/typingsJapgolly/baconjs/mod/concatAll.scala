package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "concatAll")
@js.native
object concatAll extends js.Object {
  def apply[V](streams_ : (default[V] | js.Array[default[V]])*): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
}

