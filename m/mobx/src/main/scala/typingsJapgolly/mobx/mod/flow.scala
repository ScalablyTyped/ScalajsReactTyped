package typingsJapgolly.mobx.mod

import typingsJapgolly.mobx.flowMod.CancellablePromise
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "flow")
@js.native
object flow extends js.Object {
  def apply[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, (Generator[_, R, _]) | (AsyncGenerator[_, R, _])]): js.Function1[/* args */ Args, CancellablePromise[R]] = js.native
}

