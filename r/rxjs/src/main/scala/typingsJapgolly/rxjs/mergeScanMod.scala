package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.operatorMod.Operator
import typingsJapgolly.rxjs.outerSubscriberMod.OuterSubscriber
import typingsJapgolly.rxjs.subscriberMod.Subscriber
import typingsJapgolly.rxjs.subscriptionMod.Subscription
import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import typingsJapgolly.rxjs.typesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/mergeScan", JSImport.Namespace)
@js.native
object mergeScanMod extends js.Object {
  @js.native
  class MergeScanOperator[T, R] protected () extends Operator[T, R] {
    def this(
      accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
      seed: R,
      concurrent: Double
    ) = this()
    var accumulator: js.Any = js.native
    var concurrent: js.Any = js.native
    var seed: js.Any = js.native
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
  }
  
  @js.native
  class MergeScanSubscriber[T, R] protected () extends OuterSubscriber[T, R] {
    def this(
      destination: Subscriber[R],
      accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
      acc: R,
      concurrent: Double
    ) = this()
    var _innerSub: js.Any = js.native
    var acc: js.Any = js.native
    var accumulator: js.Any = js.native
    var active: js.Any = js.native
    var buffer: js.Any = js.native
    var concurrent: js.Any = js.native
    var hasCompleted: js.Any = js.native
    var hasValue: js.Any = js.native
    var index: Double = js.native
    /* protected */ def _next(value: js.Any): Unit = js.native
    def notifyComplete(innerSub: Subscription): Unit = js.native
  }
  
  def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R
  ): OperatorFunction[T, R] = js.native
  def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R,
    concurrent: Double
  ): OperatorFunction[T, R] = js.native
}

