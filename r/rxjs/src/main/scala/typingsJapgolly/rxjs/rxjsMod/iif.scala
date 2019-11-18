package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalTypesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "iif")
@js.native
object iif extends js.Object {
  def apply[T, F](condition: js.Function0[Boolean]): typingsJapgolly.rxjs.internalObservableMod.Observable[T | F] = js.native
  def apply[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): typingsJapgolly.rxjs.internalObservableMod.Observable[T | F] = js.native
  def apply[T, F](
    condition: js.Function0[Boolean],
    trueResult: SubscribableOrPromise[T],
    falseResult: SubscribableOrPromise[F]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T | F] = js.native
}

