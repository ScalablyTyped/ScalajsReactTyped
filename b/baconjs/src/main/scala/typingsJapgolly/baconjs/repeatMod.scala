package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/repeat", JSImport.Namespace)
@js.native
object repeatMod extends js.Object {
  def default[V](
    generator: js.Function1[
      /* iteration */ Double, 
      js.UndefOr[typingsJapgolly.baconjs.observableMod.default[V]]
    ]
  ): EventStream[V] = js.native
}

