package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.frombinderMod.EventTransformer
import typingsJapgolly.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/fromevent", JSImport.Namespace)
@js.native
object fromeventMod extends js.Object {
  def default[V](target: js.Any, eventSource: String): EventStream[V] = js.native
  def default[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): EventStream[V] = js.native
  def default[V](target: js.Any, eventSource: EventSourceFn): EventStream[V] = js.native
  def default[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): EventStream[V] = js.native
  type EventSourceFn = js.Function2[/* binder */ js.Function, /* listener */ js.Function, js.Any]
}

