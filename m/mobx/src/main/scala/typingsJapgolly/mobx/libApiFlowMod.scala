package typingsJapgolly.mobx

import typingsJapgolly.mobx.libApiFlowMod.CancellablePromise
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.Error
import typingsJapgolly.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/flow", JSImport.Namespace)
@js.native
object libApiFlowMod extends js.Object {
  @js.native
  class FlowCancellationError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, (Generator[_, R, _]) | (AsyncGenerator[_, R, _])]): js.Function1[/* args */ Args, CancellablePromise[R]] = js.native
  def isFlowCancellationError(error: js.Error): Boolean = js.native
  type CancellablePromise[T] = js.Promise[T] with Anon_Cancel
}

