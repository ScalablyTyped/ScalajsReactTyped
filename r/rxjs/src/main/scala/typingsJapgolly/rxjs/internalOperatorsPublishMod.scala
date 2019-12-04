package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableConnectableObservableMod.ConnectableObservable
import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.ObservedValueOf
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/publish", JSImport.Namespace)
@js.native
object internalOperatorsPublishMod extends js.Object {
  def publish[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  def publish[T](selector: MonoTypeOperatorFunction[T]): MonoTypeOperatorFunction[T] = js.native
  @JSName("publish")
  def publish_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
}

