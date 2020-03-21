package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/takeUntil", JSImport.Namespace)
@js.native
object takeUntilMod extends js.Object {
  def takeUntil[T](notifier: Observable[_]): MonoTypeOperatorFunction[T] = js.native
}

