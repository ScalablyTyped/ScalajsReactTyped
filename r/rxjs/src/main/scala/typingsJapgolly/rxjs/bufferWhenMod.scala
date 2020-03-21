package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/bufferWhen", JSImport.Namespace)
@js.native
object bufferWhenMod extends js.Object {
  def bufferWhen[T](closingSelector: js.Function0[Observable[_]]): OperatorFunction[T, js.Array[T]] = js.native
}

