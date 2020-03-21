package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.eventMod.Event
import typingsJapgolly.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/sequentially", JSImport.Namespace)
@js.native
object sequentiallyMod extends js.Object {
  def default[V](delay: Double, values: js.Array[V | Event[V]]): EventStream[V] = js.native
}

