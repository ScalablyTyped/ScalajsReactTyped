package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/switchAll", JSImport.Namespace)
@js.native
object internalOperatorsSwitchAllMod extends js.Object {
  def switchAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
  @JSName("switchAll")
  def switchAll_R[R](): OperatorFunction[_, R] = js.native
}

