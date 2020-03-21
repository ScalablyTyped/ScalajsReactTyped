package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.eventMod.Event
import typingsJapgolly.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/once", JSImport.Namespace)
@js.native
object onceMod extends js.Object {
  def default[V](value: V): EventStream[V] = js.native
  def default[V](value: Event[V]): EventStream[V] = js.native
}

