package typingsJapgolly.rsocketTypes.reactiveSocketTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveSocket[D, M]
  extends StObject
     with Responder[D, M] {
  
  /**
    * Returns positive number representing the availability of RSocket requester. Higher is better, 0.0
    * means not available.
    */
  def availability(): Double
  
  /**
    * Close this `ReactiveSocket` and the underlying transport connection.
    */
  def close(): Unit
  
  /**
    * Returns a Flowable that immediately publishes the current connection
    * status and thereafter updates as it changes. Once a connection is in
    * the CLOSED or ERROR state, it may not be connected again.
    * Implementations must publish values per the comments on ConnectionStatus.
    */
  def connectionStatus(): Any
}
object ReactiveSocket {
  
  inline def apply[D, M](
    availability: CallbackTo[Double],
    close: Callback,
    connectionStatus: CallbackTo[Any],
    fireAndForget: Payload[D, M] => Callback,
    metadataPush: Payload[D, M] => Any,
    requestChannel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Flowable<Payload<D, M>> */ Any => Any,
    requestResponse: Payload[D, M] => Any,
    requestStream: Payload[D, M] => Any
  ): ReactiveSocket[D, M] = {
    val __obj = js.Dynamic.literal(availability = availability.toJsFn, close = close.toJsFn, connectionStatus = connectionStatus.toJsFn, fireAndForget = js.Any.fromFunction1((t0: Payload[D, M]) => fireAndForget(t0).runNow()), metadataPush = js.Any.fromFunction1(metadataPush), requestChannel = js.Any.fromFunction1(requestChannel), requestResponse = js.Any.fromFunction1(requestResponse), requestStream = js.Any.fromFunction1(requestStream))
    __obj.asInstanceOf[ReactiveSocket[D, M]]
  }
  
  extension [Self <: ReactiveSocket[?, ?], D, M](x: Self & (ReactiveSocket[D, M])) {
    
    inline def setAvailability(value: CallbackTo[Double]): Self = StObject.set(x, "availability", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setConnectionStatus(value: CallbackTo[Any]): Self = StObject.set(x, "connectionStatus", value.toJsFn)
  }
}
