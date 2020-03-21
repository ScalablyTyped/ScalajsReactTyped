package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesFlatmapMod.SpawnerOrObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmapwithconcurrencylimit", JSImport.Namespace)
@js.native
object flatmapwithconcurrencylimitMod extends js.Object {
  def default[V, V2](
    src: typingsJapgolly.baconjs.observableMod.default[V],
    limit: Double,
    f: SpawnerOrObservable[V, V2]
  ): typingsJapgolly.baconjs.observableMod.default[V2] = js.native
}

