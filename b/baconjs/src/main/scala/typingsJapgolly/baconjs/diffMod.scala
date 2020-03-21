package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.Property
import typingsJapgolly.baconjs.observableMod.default
import typingsJapgolly.baconjs.typesMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/diff", JSImport.Namespace)
@js.native
object diffMod extends js.Object {
  def diff[V, V2](src: default[V], start: V, f: Differ[V, V2]): Property[V2] = js.native
  type Differ[V, V2] = Function2[V, V, V2]
}

