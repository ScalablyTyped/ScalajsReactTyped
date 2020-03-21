package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/switchAll", JSImport.Namespace)
@js.native
object switchAllMod extends js.Object {
  def switchAll[R](): OperatorFunction[_, R] = js.native
  @JSName("switchAll")
  def switchAll_T[T](): OperatorFunction[ObservableInput[T], T] = js.native
}

