package typingsJapgolly.rsocketCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketFlowable.mod.Flowable
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Encodable
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.LeaseFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketleaseMod {
  
  @JSImport("rsocket-core/RSocketLease", "Lease")
  @js.native
  open class Lease protected () extends StObject {
    def this(timeToLiveMillis: Double, allowedRequests: Double) = this()
    def this(timeToLiveMillis: Double, allowedRequests: Double, metadata: Encodable) = this()
    
    var allowedRequests: Double = js.native
    
    def expired(): Boolean = js.native
    
    var expiry: Double = js.native
    
    var metadata: js.UndefOr[Encodable] = js.native
    
    var startingAllowedRequests: Double = js.native
    
    var timeToLiveMillis: Double = js.native
    
    def valid(): Boolean = js.native
  }
  
  @JSImport("rsocket-core/RSocketLease", "Leases")
  @js.native
  open class Leases[T /* <: LeaseStats */] () extends StObject {
    
    def receiver(receiver: js.Function1[/* flowable */ Flowable[Lease], Unit]): Leases[T] = js.native
    
    def sender(sender: js.Function1[/* t */ js.UndefOr[T], Flowable[Lease]]): Leases[T] = js.native
    
    def stats(stats: T): Leases[T] = js.native
  }
  
  @JSImport("rsocket-core/RSocketLease", "RequesterLeaseHandler")
  @js.native
  open class RequesterLeaseHandler protected ()
    extends StObject
       with LeaseHandler
       with Disposable {
    def this(leaseReceiver: js.Function1[/* flowable */ Flowable[Lease], Unit]) = this()
    
    def availability(): Double = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def errorMessage(): String = js.native
    
    /* CompleteClass */
    override def isDisposed(): Boolean = js.native
    
    def receive(frame: LeaseFrame): Unit = js.native
    
    /* CompleteClass */
    override def use(): Boolean = js.native
  }
  
  @JSImport("rsocket-core/RSocketLease", "ResponderLeaseHandler")
  @js.native
  open class ResponderLeaseHandler protected ()
    extends StObject
       with LeaseHandler {
    def this(leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]]) = this()
    def this(
      leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
      stats: LeaseStats
    ) = this()
    def this(
      leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
      stats: Unit,
      errorConsumer: js.Function1[/* e */ js.Error, Unit]
    ) = this()
    def this(
      leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
      stats: LeaseStats,
      errorConsumer: js.Function1[/* e */ js.Error, Unit]
    ) = this()
    
    /* CompleteClass */
    override def errorMessage(): String = js.native
    
    def send(send: js.Function1[/* lease */ Lease, Unit]): Disposable = js.native
    
    /* CompleteClass */
    override def use(): Boolean = js.native
  }
  
  trait Disposable extends StObject {
    
    def dispose(): Unit
    
    def isDisposed(): Boolean
  }
  object Disposable {
    
    inline def apply(dispose: Callback, isDisposed: CallbackTo[Boolean]): Disposable = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, isDisposed = isDisposed.toJsFn)
      __obj.asInstanceOf[Disposable]
    }
    
    extension [Self <: Disposable](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setIsDisposed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisposed", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rsocketCore.rsocketCoreStrings.Accept
    - typingsJapgolly.rsocketCore.rsocketCoreStrings.Reject
    - typingsJapgolly.rsocketCore.rsocketCoreStrings.Terminate
  */
  trait EventType extends StObject
  object EventType {
    
    inline def Accept: typingsJapgolly.rsocketCore.rsocketCoreStrings.Accept = "Accept".asInstanceOf[typingsJapgolly.rsocketCore.rsocketCoreStrings.Accept]
    
    inline def Reject: typingsJapgolly.rsocketCore.rsocketCoreStrings.Reject = "Reject".asInstanceOf[typingsJapgolly.rsocketCore.rsocketCoreStrings.Reject]
    
    inline def Terminate: typingsJapgolly.rsocketCore.rsocketCoreStrings.Terminate = "Terminate".asInstanceOf[typingsJapgolly.rsocketCore.rsocketCoreStrings.Terminate]
  }
  
  trait LeaseHandler extends StObject {
    
    def errorMessage(): String
    
    def use(): Boolean
  }
  object LeaseHandler {
    
    inline def apply(errorMessage: CallbackTo[String], use: CallbackTo[Boolean]): LeaseHandler = {
      val __obj = js.Dynamic.literal(errorMessage = errorMessage.toJsFn, use = use.toJsFn)
      __obj.asInstanceOf[LeaseHandler]
    }
    
    extension [Self <: LeaseHandler](x: Self) {
      
      inline def setErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "errorMessage", value.toJsFn)
      
      inline def setUse(value: CallbackTo[Boolean]): Self = StObject.set(x, "use", value.toJsFn)
    }
  }
  
  trait LeaseStats extends StObject {
    
    def onEvent(event: EventType): Unit
  }
  object LeaseStats {
    
    inline def apply(onEvent: EventType => Callback): LeaseStats = {
      val __obj = js.Dynamic.literal(onEvent = js.Any.fromFunction1((t0: EventType) => onEvent(t0).runNow()))
      __obj.asInstanceOf[LeaseStats]
    }
    
    extension [Self <: LeaseStats](x: Self) {
      
      inline def setOnEvent(value: EventType => Callback): Self = StObject.set(x, "onEvent", js.Any.fromFunction1((t0: EventType) => value(t0).runNow()))
    }
  }
}
