package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.frombinderMod.Binder
import typingsJapgolly.baconjs.frombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromBinder")
@js.native
object fromBinder extends js.Object {
  def apply[V](binder: Binder[V]): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](binder: Binder[V], eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
}

