package typingsJapgolly.absintheSocket

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.absintheSocket.anon.OnError
import typingsJapgolly.phoenix.mod.Channel
import typingsJapgolly.phoenix.mod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@absinthe/socket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cancel(absintheSocket: AbsintheSocket[js.Object], notifier: Notifier[js.Object, js.Object]): AbsintheSocket[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(absintheSocket.asInstanceOf[js.Any], notifier.asInstanceOf[js.Any])).asInstanceOf[AbsintheSocket[js.Object]]
  
  inline def create(socket: Socket): AbsintheSocket[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(socket.asInstanceOf[js.Any]).asInstanceOf[AbsintheSocket[js.Object]]
  
  inline def observe[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: Observer[Variables, js.Object]
  ): AbsintheSocket[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(absintheSocket.asInstanceOf[js.Any], notifier.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[AbsintheSocket[js.Object]]
  
  inline def send[Variables](absintheSocket: AbsintheSocket[js.Object], gqlRequest: GqlRequest[Variables]): Notifier[Variables, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(absintheSocket.asInstanceOf[js.Any], gqlRequest.asInstanceOf[js.Any])).asInstanceOf[Notifier[Variables, js.Object]]
  
  inline def toObservable[Variables](absintheSocket: AbsintheSocket[js.Object], notifier: Notifier[Variables, js.Object]): Observer[Variables, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObservable")(absintheSocket.asInstanceOf[js.Any], notifier.asInstanceOf[js.Any])).asInstanceOf[Observer[Variables, js.Object]]
  inline def toObservable[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: OnError[Variables]
  ): Observer[Variables, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObservable")(absintheSocket.asInstanceOf[js.Any], notifier.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Observer[Variables, js.Object]]
  
  inline def unobserve[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: Observer[Variables, js.Object]
  ): AbsintheSocket[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("unobserve")(absintheSocket.asInstanceOf[js.Any], notifier.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[AbsintheSocket[js.Object]]
  
  inline def unobserveOrCancel[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: Observer[Variables, js.Object]
  ): AbsintheSocket[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("unobserveOrCancel")(absintheSocket.asInstanceOf[js.Any], notifier.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[AbsintheSocket[js.Object]]
  
  trait AbsintheSocket[T] extends StObject {
    
    var channel: Channel
    
    var channelJoinCreated: Boolean
    
    var notifiers: js.Array[Notifier[T, js.Object]]
    
    var phoenixSocket: Socket
  }
  object AbsintheSocket {
    
    inline def apply[T](
      channel: Channel,
      channelJoinCreated: Boolean,
      notifiers: js.Array[Notifier[T, js.Object]],
      phoenixSocket: Socket
    ): AbsintheSocket[T] = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], channelJoinCreated = channelJoinCreated.asInstanceOf[js.Any], notifiers = notifiers.asInstanceOf[js.Any], phoenixSocket = phoenixSocket.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsintheSocket[T]]
    }
    
    extension [Self <: AbsintheSocket[?], T](x: Self & AbsintheSocket[T]) {
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelJoinCreated(value: Boolean): Self = StObject.set(x, "channelJoinCreated", value.asInstanceOf[js.Any])
      
      inline def setNotifiers(value: js.Array[Notifier[T, js.Object]]): Self = StObject.set(x, "notifiers", value.asInstanceOf[js.Any])
      
      inline def setNotifiersVarargs(value: (Notifier[T, js.Object])*): Self = StObject.set(x, "notifiers", js.Array(value*))
      
      inline def setPhoenixSocket(value: Socket): Self = StObject.set(x, "phoenixSocket", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.absintheSocket.absintheSocketStrings.mutation
    - typingsJapgolly.absintheSocket.absintheSocketStrings.query
    - typingsJapgolly.absintheSocket.absintheSocketStrings.subscription
  */
  trait GqlOperationType extends StObject
  object GqlOperationType {
    
    inline def mutation: typingsJapgolly.absintheSocket.absintheSocketStrings.mutation = "mutation".asInstanceOf[typingsJapgolly.absintheSocket.absintheSocketStrings.mutation]
    
    inline def query: typingsJapgolly.absintheSocket.absintheSocketStrings.query = "query".asInstanceOf[typingsJapgolly.absintheSocket.absintheSocketStrings.query]
    
    inline def subscription: typingsJapgolly.absintheSocket.absintheSocketStrings.subscription = "subscription".asInstanceOf[typingsJapgolly.absintheSocket.absintheSocketStrings.subscription]
  }
  
  trait GqlRequest[Variables] extends StObject {
    
    var operation: String
    
    var variables: js.UndefOr[Variables] = js.undefined
  }
  object GqlRequest {
    
    inline def apply[Variables](operation: String): GqlRequest[Variables] = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[GqlRequest[Variables]]
    }
    
    extension [Self <: GqlRequest[?], Variables](x: Self & GqlRequest[Variables]) {
      
      inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait Notifier[Variables, Result] extends StObject {
    
    var activeObservers: js.Array[Observer[Variables, Result]]
    
    var canceledObservers: js.Array[Observer[Variables, Result]]
    
    var isActive: Boolean
    
    var operationType: GqlOperationType
    
    var request: GqlRequest[Variables]
    
    var requestStatus: RequestStatus
    
    var subscriptionId: js.UndefOr[String] = js.undefined
  }
  object Notifier {
    
    inline def apply[Variables, Result](
      activeObservers: js.Array[Observer[Variables, Result]],
      canceledObservers: js.Array[Observer[Variables, Result]],
      isActive: Boolean,
      operationType: GqlOperationType,
      request: GqlRequest[Variables],
      requestStatus: RequestStatus
    ): Notifier[Variables, Result] = {
      val __obj = js.Dynamic.literal(activeObservers = activeObservers.asInstanceOf[js.Any], canceledObservers = canceledObservers.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestStatus = requestStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notifier[Variables, Result]]
    }
    
    extension [Self <: Notifier[?, ?], Variables, Result](x: Self & (Notifier[Variables, Result])) {
      
      inline def setActiveObservers(value: js.Array[Observer[Variables, Result]]): Self = StObject.set(x, "activeObservers", value.asInstanceOf[js.Any])
      
      inline def setActiveObserversVarargs(value: (Observer[Variables, Result])*): Self = StObject.set(x, "activeObservers", js.Array(value*))
      
      inline def setCanceledObservers(value: js.Array[Observer[Variables, Result]]): Self = StObject.set(x, "canceledObservers", value.asInstanceOf[js.Any])
      
      inline def setCanceledObserversVarargs(value: (Observer[Variables, Result])*): Self = StObject.set(x, "canceledObservers", js.Array(value*))
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setOperationType(value: GqlOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: GqlRequest[Variables]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestStatus(value: RequestStatus): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    }
  }
  
  trait Observer[Variables, Result] extends StObject {
    
    var onAbort: js.UndefOr[js.Function1[/* error */ js.Error, Any]] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Any]] = js.undefined
    
    var onResult: js.UndefOr[js.Function1[/* result */ Result, Any]] = js.undefined
    
    var onStart: js.UndefOr[js.Function1[/* notifier */ Notifier[Variables, js.Object], Any]] = js.undefined
  }
  object Observer {
    
    inline def apply[Variables, Result](): Observer[Variables, Result] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Observer[Variables, Result]]
    }
    
    extension [Self <: Observer[?, ?], Variables, Result](x: Self & (Observer[Variables, Result])) {
      
      inline def setOnAbort(value: /* error */ js.Error => Any): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnCancel(value: CallbackTo[Any]): Self = StObject.set(x, "onCancel", value.toJsFn)
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnResult(value: /* result */ Result => Any): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
      
      inline def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      inline def setOnStart(value: /* notifier */ Notifier[Variables, js.Object] => Any): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.absintheSocket.absintheSocketStrings.canceled
    - typingsJapgolly.absintheSocket.absintheSocketStrings.canceling
    - typingsJapgolly.absintheSocket.absintheSocketStrings.pending
    - typingsJapgolly.absintheSocket.absintheSocketStrings.sent
    - typingsJapgolly.absintheSocket.absintheSocketStrings.sending
  */
  trait RequestStatus extends StObject
  object RequestStatus {
    
    inline def canceled: typingsJapgolly.absintheSocket.absintheSocketStrings.canceled = "canceled".asInstanceOf[typingsJapgolly.absintheSocket.absintheSocketStrings.canceled]
    
    inline def canceling: typingsJapgolly.absintheSocket.absintheSocketStrings.canceling = "canceling".asInstanceOf[typingsJapgolly.absintheSocket.absintheSocketStrings.canceling]
    
    inline def pending: typingsJapgolly.absintheSocket.absintheSocketStrings.pending = "pending".asInstanceOf[typingsJapgolly.absintheSocket.absintheSocketStrings.pending]
    
    inline def sending: typingsJapgolly.absintheSocket.absintheSocketStrings.sending = "sending".asInstanceOf[typingsJapgolly.absintheSocket.absintheSocketStrings.sending]
    
    inline def sent: typingsJapgolly.absintheSocket.absintheSocketStrings.sent = "sent".asInstanceOf[typingsJapgolly.absintheSocket.absintheSocketStrings.sent]
  }
}
