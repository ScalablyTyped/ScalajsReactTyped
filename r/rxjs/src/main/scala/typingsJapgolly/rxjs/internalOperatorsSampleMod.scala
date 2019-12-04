package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/sample", JSImport.Namespace)
@js.native
object internalOperatorsSampleMod extends js.Object {
  def sample[T](notifier: Observable[_]): MonoTypeOperatorFunction[T] = js.native
}

