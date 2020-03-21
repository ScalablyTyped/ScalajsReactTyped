package typingsJapgolly.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "repeatedly")
@js.native
object repeatedly extends js.Object {
  def apply[V](delay: Double, values: js.Array[V | typingsJapgolly.baconjs.eventMod.Event[V]]): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
}

