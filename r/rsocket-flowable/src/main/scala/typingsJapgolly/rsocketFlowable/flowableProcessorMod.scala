package typingsJapgolly.rsocketFlowable

import typingsJapgolly.rsocketTypes.reactiveStreamTypesMod.IPublisher
import typingsJapgolly.rsocketTypes.reactiveStreamTypesMod.ISubscriber
import typingsJapgolly.rsocketTypes.reactiveStreamTypesMod.ISubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowableProcessorMod {
  
  @JSImport("rsocket-flowable/FlowableProcessor", JSImport.Default)
  @js.native
  open class default[T, R] protected ()
    extends StObject
       with FlowableProcessor[T, R] {
    def this(source: IPublisher[T]) = this()
    def this(source: IPublisher[T], fn: js.Function1[/* a */ T, R]) = this()
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def onComplete(): Unit = js.native
    
    /* CompleteClass */
    override def onError(error: js.Error): Unit = js.native
    
    /* CompleteClass */
    override def onNext(value: T): Unit = js.native
    
    /* CompleteClass */
    override def onSubscribe(subscription: ISubscription): Unit = js.native
    
    /* CompleteClass */
    override def request(n: Double): Unit = js.native
  }
  
  @js.native
  trait FlowableProcessor[T, R]
    extends StObject
       with IPublisher[R]
       with ISubscriber[T]
       with ISubscription
}
