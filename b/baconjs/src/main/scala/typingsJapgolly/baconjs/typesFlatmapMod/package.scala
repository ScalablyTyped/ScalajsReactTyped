package typingsJapgolly.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesFlatmapMod {
  type EventOrValue[V] = typingsJapgolly.baconjs.eventMod.Event[V] | V
  type EventSpawner[V, V2] = js.Function1[
    /* e */ typingsJapgolly.baconjs.eventMod.Event[V], 
    typingsJapgolly.baconjs.observableMod.default[V2] | typingsJapgolly.baconjs.typesFlatmapMod.EventOrValue[V2]
  ]
  type SpawnerOrObservable[V, V2] = (typingsJapgolly.baconjs.typesFlatmapMod.ValueSpawner[V, V2]) | typingsJapgolly.baconjs.observableMod.default[V2]
  type ValueSpawner[V, V2] = js.Function1[
    /* value */ V, 
    typingsJapgolly.baconjs.observableMod.default[V2] | typingsJapgolly.baconjs.typesFlatmapMod.EventOrValue[V2]
  ]
}
