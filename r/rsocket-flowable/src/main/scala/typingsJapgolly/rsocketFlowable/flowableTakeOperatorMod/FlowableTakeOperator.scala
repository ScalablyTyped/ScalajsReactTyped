package typingsJapgolly.rsocketFlowable.flowableTakeOperatorMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> * / any */ trait FlowableTakeOperator[T] extends js.Object {
  def onComplete(): Unit
  def onError(error: js.Error): Unit
  def onNext(t: T): Unit
  def onSubscribe(
    subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): Unit
}

object FlowableTakeOperator {
  @scala.inline
  def apply[T](
    onComplete: Callback,
    onError: js.Error => Callback,
    onNext: T => Callback,
    onSubscribe: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Callback
  ): FlowableTakeOperator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()))
    __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: T) => onNext(t0).runNow()))
    __obj.updateDynamic("onSubscribe")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any) => onSubscribe(t0).runNow()))
    __obj.asInstanceOf[FlowableTakeOperator[T]]
  }
}

