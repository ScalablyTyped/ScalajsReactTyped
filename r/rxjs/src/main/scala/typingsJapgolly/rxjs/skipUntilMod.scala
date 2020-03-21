package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/skipUntil", JSImport.Namespace)
@js.native
object skipUntilMod extends js.Object {
  def skipUntil[T](notifier: Observable[_]): MonoTypeOperatorFunction[T] = js.native
}

