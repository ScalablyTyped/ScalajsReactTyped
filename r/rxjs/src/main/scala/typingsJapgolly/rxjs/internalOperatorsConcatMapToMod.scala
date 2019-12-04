package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.ObservedValueOf
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/concatMapTo", JSImport.Namespace)
@js.native
object internalOperatorsConcatMapToMod extends js.Object {
  def concatMapTo[T, O /* <: ObservableInput[_] */](observable: O): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def concatMapTo[T, R, O /* <: ObservableInput[_] */](
    observable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
}

