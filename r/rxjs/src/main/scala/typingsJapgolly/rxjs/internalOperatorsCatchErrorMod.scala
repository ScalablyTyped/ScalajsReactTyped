package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.ObservedValueOf
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/catchError", JSImport.Namespace)
@js.native
object internalOperatorsCatchErrorMod extends js.Object {
  def catchError[T, O /* <: ObservableInput[_] */](selector: js.Function2[/* err */ js.Any, /* caught */ Observable[T], O]): OperatorFunction[T, T | ObservedValueOf[O]] = js.native
}

