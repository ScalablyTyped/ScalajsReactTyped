package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.Observable
import typingsJapgolly.baconjs.observableMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/slidingwindow", JSImport.Namespace)
@js.native
object slidingwindowMod extends js.Object {
  def slidingWindow[V](src: Observable[V], maxValues: Double): Property[js.Array[V]] = js.native
  def slidingWindow[V](src: Observable[V], maxValues: Double, minValues: Double): Property[js.Array[V]] = js.native
}

