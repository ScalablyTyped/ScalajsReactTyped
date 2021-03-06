package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/zipAll", JSImport.Namespace)
@js.native
object zipAllMod extends js.Object {
  def zipAll[T](): OperatorFunction[ObservableInput[T], js.Array[T]] = js.native
  def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[_, R] = js.native
  @JSName("zipAll")
  def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = js.native
}

