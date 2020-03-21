package typingsJapgolly.reduxBatchedSubscribe

import typingsJapgolly.redux.mod.StoreEnhancer
import typingsJapgolly.redux.mod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-batched-subscribe", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait StoreExtension extends js.Object {
    @JSName("subscribeImmediate")
    var subscribeImmediate_Original: js.Function1[/* listener */ js.Function0[Unit], Unsubscribe] = js.native
    def subscribeImmediate(listener: js.Function0[Unit]): Unsubscribe = js.native
  }
  
  def batchedSubscribe(batch: BatchFunction): StoreEnhancer[StoreExtension, js.Object] = js.native
  type BatchFunction = js.Function1[/* notify */ NotifyFunction, Unit]
  type NotifyFunction = js.Function0[Unit]
}

