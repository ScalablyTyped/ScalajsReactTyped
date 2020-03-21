package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/switchMapTo", JSImport.Namespace)
@js.native
object switchMapToMod extends js.Object {
  def switchMapTo[R](observable: ObservableInput[R]): OperatorFunction[_, R] = js.native
  def switchMapTo[T, I, R](
    observable: ObservableInput[I],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  @JSName("switchMapTo")
  def switchMapTo_TR[T, R](observable: ObservableInput[R]): OperatorFunction[T, R] = js.native
}

