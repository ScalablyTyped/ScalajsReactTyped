package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.frombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromPromise")
@js.native
object fromPromise extends js.Object {
  def apply[V](promise: js.Promise[V]): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
}

