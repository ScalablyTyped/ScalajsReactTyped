package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.ObservedValueOf
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/catchError", JSImport.Namespace)
@js.native
object catchErrorMod extends js.Object {
  def catchError[T, O /* <: ObservableInput[_] */](selector: js.Function2[/* err */ js.Any, /* caught */ Observable[T], O]): OperatorFunction[T, T | ObservedValueOf[O]] = js.native
}

