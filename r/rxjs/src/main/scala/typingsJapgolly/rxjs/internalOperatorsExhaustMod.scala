package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/exhaust", JSImport.Namespace)
@js.native
object internalOperatorsExhaustMod extends js.Object {
  def exhaust[T](): OperatorFunction[ObservableInput[T], T] = js.native
  @JSName("exhaust")
  def exhaust_R[R](): OperatorFunction[_, R] = js.native
}

