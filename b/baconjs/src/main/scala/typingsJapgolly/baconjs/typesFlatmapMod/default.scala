package typingsJapgolly.baconjs.typesFlatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmap_", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[In, Out](spawner: EventSpawner[In, Out], src: typingsJapgolly.baconjs.observableMod.default[In]): typingsJapgolly.baconjs.observableMod.default[Out] = js.native
  def apply[In, Out](
    spawner: EventSpawner[In, Out],
    src: typingsJapgolly.baconjs.observableMod.default[In],
    params: FlatMapParams
  ): typingsJapgolly.baconjs.observableMod.default[Out] = js.native
}

