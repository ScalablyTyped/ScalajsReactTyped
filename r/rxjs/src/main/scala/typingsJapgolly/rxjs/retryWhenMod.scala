package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/retryWhen", JSImport.Namespace)
@js.native
object retryWhenMod extends js.Object {
  def retryWhen[T](notifier: js.Function1[/* errors */ Observable[_], Observable[_]]): MonoTypeOperatorFunction[T] = js.native
}

