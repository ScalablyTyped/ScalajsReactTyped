package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.frombinderMod.EventTransformer
import typingsJapgolly.baconjs.fromeventMod.EventSourceFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromEvent")
@js.native
object fromEvent extends js.Object {
  def apply[V](target: js.Any, eventSource: String): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: EventSourceFn): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
}

