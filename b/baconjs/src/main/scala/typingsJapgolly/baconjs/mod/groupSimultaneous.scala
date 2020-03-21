package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "groupSimultaneous")
@js.native
object groupSimultaneous extends js.Object {
  def apply[V](streams: (default[V] | js.Array[default[V]])*): typingsJapgolly.baconjs.observableMod.EventStream[js.Array[js.Array[V]]] = js.native
}

