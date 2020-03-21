package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.Observable
import typingsJapgolly.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/asyncwrapsubscribe", JSImport.Namespace)
@js.native
object asyncwrapsubscribeMod extends js.Object {
  def default[V](obs: Observable[V], subscribe: Subscribe[V]): Subscribe[V] = js.native
}

