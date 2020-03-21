package typingsJapgolly.baconjs.typesFlatmapMod

import typingsJapgolly.baconjs.eventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmap_", "makeObservable")
@js.native
object makeObservable extends js.Object {
  def apply[V](x: V): typingsJapgolly.baconjs.observableMod.default[V] = js.native
  def apply[V](x: Event[V]): typingsJapgolly.baconjs.observableMod.default[V] = js.native
  def apply[V](x: typingsJapgolly.baconjs.observableMod.default[V]): typingsJapgolly.baconjs.observableMod.default[V] = js.native
}

