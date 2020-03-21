package typingsJapgolly.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromArray")
@js.native
object fromArray extends js.Object {
  def apply[T](values: js.Array[T | typingsJapgolly.baconjs.eventMod.Event[T]]): typingsJapgolly.baconjs.observableMod.EventStream[T] = js.native
}

