package typingsJapgolly.qRetry.mod

import typingsJapgolly.q.mod.IPromise
import typingsJapgolly.qRetry.mod.qAugmentingMod.IRetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "retry")
@js.native
object retry extends js.Object {
  def apply[U](process: js.Function0[IPromise[U] | U]): typingsJapgolly.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], limit: Double): typingsJapgolly.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit]
  ): typingsJapgolly.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    limit: Double
  ): typingsJapgolly.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    options: IRetryOptions
  ): typingsJapgolly.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], options: IRetryOptions): typingsJapgolly.qRetry.mod.qAugmentingMod.Promise[U] = js.native
}

