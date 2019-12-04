package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/windowWhen", JSImport.Namespace)
@js.native
object internalOperatorsWindowWhenMod extends js.Object {
  def windowWhen[T](closingSelector: js.Function0[Observable[_]]): OperatorFunction[T, Observable[T]] = js.native
}

