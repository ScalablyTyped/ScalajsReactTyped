package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/repeatWhen", JSImport.Namespace)
@js.native
object repeatWhenMod extends js.Object {
  def repeatWhen[T](notifier: js.Function1[/* notifications */ Observable[_], Observable[_]]): MonoTypeOperatorFunction[T] = js.native
}

