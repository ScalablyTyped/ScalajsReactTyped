package typingsJapgolly.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "once")
@js.native
object once extends js.Object {
  def apply[V](value: V): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](value: typingsJapgolly.baconjs.eventMod.Event[V]): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
}

