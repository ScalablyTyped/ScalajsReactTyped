package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/concatAll", JSImport.Namespace)
@js.native
object internalOperatorsConcatAllMod extends js.Object {
  def concatAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
  @JSName("concatAll")
  def concatAll_R[R](): OperatorFunction[_, R] = js.native
}

