package typingsJapgolly.rsocketFlowable

import japgolly.scalajs.react.Callback
import typingsJapgolly.rsocketTypes.reactiveStreamTypesMod.ISubscriber
import typingsJapgolly.rsocketTypes.reactiveStreamTypesMod.ISubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowableMapOperatorMod {
  
  @JSImport("rsocket-flowable/FlowableMapOperator", JSImport.Default)
  @js.native
  open class default[T, R] protected ()
    extends StObject
       with FlowableMapOperator[T, R] {
    def this(subscriber: ISubscriber[R], fn: js.Function1[/* t */ T, R]) = this()
    
    /* CompleteClass */
    override def onComplete(): Unit = js.native
    
    /* CompleteClass */
    override def onError(error: js.Error): Unit = js.native
    
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /* CompleteClass */
    override def onSubscribe(subscription: ISubscription): Unit = js.native
  }
  
  trait FlowableMapOperator[T, R]
    extends StObject
       with ISubscriber[T]
  object FlowableMapOperator {
    
    inline def apply[T, R](
      onComplete: Callback,
      onError: js.Error => Callback,
      onNext: T => Callback,
      onSubscribe: ISubscription => Callback
    ): FlowableMapOperator[T, R] = {
      val __obj = js.Dynamic.literal(onComplete = onComplete.toJsFn, onError = js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()), onNext = js.Any.fromFunction1((t0: T) => onNext(t0).runNow()), onSubscribe = js.Any.fromFunction1((t0: ISubscription) => onSubscribe(t0).runNow()))
      __obj.asInstanceOf[FlowableMapOperator[T, R]]
    }
  }
}
