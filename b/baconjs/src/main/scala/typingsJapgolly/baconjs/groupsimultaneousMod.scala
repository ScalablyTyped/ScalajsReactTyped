package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.EventStream
import typingsJapgolly.baconjs.observableMod.EventStreamOptions
import typingsJapgolly.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/groupsimultaneous", JSImport.Namespace)
@js.native
object groupsimultaneousMod extends js.Object {
  def default[V](
    streams: (typingsJapgolly.baconjs.observableMod.default[V] | js.Array[typingsJapgolly.baconjs.observableMod.default[V]])*
  ): EventStream[js.Array[js.Array[V]]] = js.native
  @JSName("groupSimultaneous_")
  def groupSimultaneous[V](streams: js.Array[default[V]]): EventStream[js.Array[js.Array[V]]] = js.native
  @JSName("groupSimultaneous_")
  def groupSimultaneous[V](streams: js.Array[default[V]], options: EventStreamOptions): EventStream[js.Array[js.Array[V]]] = js.native
}

