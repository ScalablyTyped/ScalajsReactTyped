package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesFlatmapMod.EventOrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmaperror", JSImport.Namespace)
@js.native
object flatmaperrorMod extends js.Object {
  def default[V, V2](
    src: typingsJapgolly.baconjs.observableMod.default[V],
    f: js.Function1[
      /* error */ js.Any, 
      typingsJapgolly.baconjs.observableMod.default[V2] | EventOrValue[V2]
    ]
  ): typingsJapgolly.baconjs.observableMod.default[V | V2] = js.native
}

