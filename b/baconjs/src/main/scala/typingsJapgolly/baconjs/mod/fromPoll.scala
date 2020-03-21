package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.frompollMod.PollFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromPoll")
@js.native
object fromPoll extends js.Object {
  def apply[V](delay: Double, poll: PollFunction[V]): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
}

