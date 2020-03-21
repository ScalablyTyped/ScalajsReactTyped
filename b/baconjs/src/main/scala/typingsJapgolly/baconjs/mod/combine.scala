package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.observableMod.default
import typingsJapgolly.baconjs.typesMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "combine")
@js.native
object combine extends js.Object {
  def apply[V, V2, R](left: default[V], right: default[V2], f: Function2[V, V2, R]): typingsJapgolly.baconjs.observableMod.Property[R] = js.native
}

