package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/concatAll", JSImport.Namespace)
@js.native
object concatAllMod extends js.Object {
  def concatAll[R](): OperatorFunction[_, R] = js.native
  @JSName("concatAll")
  def concatAll_T[T](): OperatorFunction[ObservableInput[T], T] = js.native
}

