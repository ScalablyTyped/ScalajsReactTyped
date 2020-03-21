package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.operatorMod.Operator
import typingsJapgolly.rxjs.subscriberMod.Subscriber
import typingsJapgolly.rxjs.typesMod.Observer
import typingsJapgolly.rxjs.typesMod.OperatorFunction
import typingsJapgolly.rxjs.typesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/sequenceEqual", JSImport.Namespace)
@js.native
object sequenceEqualMod extends js.Object {
  @js.native
  class SequenceEqualOperator[T] protected () extends Operator[T, Boolean] {
    def this(compareTo: Observable[T], comparator: js.Function2[/* a */ T, /* b */ T, Boolean]) = this()
    var comparator: js.Any = js.native
    var compareTo: js.Any = js.native
    /* CompleteClass */
    override def call(subscriber: Subscriber[Boolean], source: js.Any): TeardownLogic = js.native
  }
  
  @js.native
  class SequenceEqualSubscriber[T, R] protected () extends Subscriber[T] {
    def this(
      destination: Observer[R],
      compareTo: Observable[T],
      comparator: js.Function2[/* a */ T, /* b */ T, Boolean]
    ) = this()
    var _a: js.Any = js.native
    var _b: js.Any = js.native
    var _oneComplete: js.Any = js.native
    var comparator: js.Any = js.native
    var compareTo: js.Any = js.native
    def checkValues(): Unit = js.native
    def completeB(): Unit = js.native
    def emit(value: Boolean): Unit = js.native
    def nextB(value: T): Unit = js.native
  }
  
  def sequenceEqual[T](compareTo: Observable[T]): OperatorFunction[T, Boolean] = js.native
  def sequenceEqual[T](compareTo: Observable[T], comparator: js.Function2[/* a */ T, /* b */ T, Boolean]): OperatorFunction[T, Boolean] = js.native
}

