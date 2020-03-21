package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "zipWith")
@js.native
object zipWith extends js.Object {
  def apply[Out](f: js.Function1[/* repeated */ js.Any, Out], streams: default[_]*): typingsJapgolly.baconjs.observableMod.EventStream[Out] = js.native
}

