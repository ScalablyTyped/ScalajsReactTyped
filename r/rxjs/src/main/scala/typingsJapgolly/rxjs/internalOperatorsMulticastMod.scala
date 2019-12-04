package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableConnectableObservableMod.ConnectableObservable
import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalOperatorMod.Operator
import typingsJapgolly.rxjs.internalSubjectMod.Subject
import typingsJapgolly.rxjs.internalSubscriberMod.Subscriber
import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.ObservedValueOf
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.TeardownLogic
import typingsJapgolly.rxjs.internalTypesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/multicast", JSImport.Namespace)
@js.native
object internalOperatorsMulticastMod extends js.Object {
  @js.native
  class MulticastOperator[T, R] protected () extends Operator[T, R] {
    def this(
      subjectFactory: js.Function0[Subject[T]],
      selector: js.Function1[/* source */ Observable[T], Observable[R]]
    ) = this()
    var selector: js.Any = js.native
    var subjectFactory: js.Any = js.native
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
  }
  
  def multicast[T](subjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]]): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  def multicast[T](subject: Subject[T]): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  def multicast[T, O /* <: ObservableInput[_] */](
    SubjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]],
    selector: js.Function1[/* shared */ Observable[T], O]
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def multicast[T, O /* <: ObservableInput[_] */](subject: Subject[T], selector: js.Function1[/* shared */ Observable[T], O]): UnaryFunction[Observable[T], ConnectableObservable[ObservedValueOf[O]]] = js.native
}

