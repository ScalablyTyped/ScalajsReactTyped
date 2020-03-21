package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/exhaust", JSImport.Namespace)
@js.native
object exhaustMod extends js.Object {
  def exhaust[R](): OperatorFunction[_, R] = js.native
  @JSName("exhaust")
  def exhaust_T[T](): OperatorFunction[ObservableInput[T], T] = js.native
}

